package pl.sport.sport_manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sport.sport_manager.entity.*;
import pl.sport.sport_manager.repository.*;

import javax.validation.Valid;
import java.util.List;


@Controller
public class GameController {

    final static long budgetAmount = 1000000;
    final static long competitionId = 1;

    @Autowired
    GameTeamRepository gameTeamRepository;

    @Autowired
    CompetitionRepository competitionRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    BudgetRepository budgetRepository;

    @Autowired
    CyclistRepository cyclistRepository;

    @ModelAttribute("cyclists")
    public List<Cyclist> cyclist() {return cyclistRepository.findAll();}

    
    private User getLoggedInUser() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userRepository.findByUsername(userDetails.getUsername());
        return user;
    }

    @GetMapping("/createTeam")
    public String createGameTeam(Model model) {
        model.addAttribute("gameTeam", new GameTeam());
        return "/game/teamCreate"; }

    @PostMapping("/createTeam")
    public String addNewGameTeam(@ModelAttribute @Valid GameTeam gameTeam,
                                BindingResult result) {
        if (result.hasErrors()) {
            return "/game/teamCreate";
        }
        gameTeam.setCompetition(competitionRepository.findById(competitionId));
        User user = getLoggedInUser();
        gameTeam.setUser(user);
        Budget budget = new Budget();
        budget.setBudgetAmount(budgetAmount);
        budgetRepository.save(budget);
        gameTeam.setBudget(budget);
        gameTeamRepository.save(gameTeam);
        return "redirect:/chooseCyclists";
    }

    @GetMapping("/chooseCyclists")
    public String addCyclist(Model model) {
        User user = getLoggedInUser();
        model.addAttribute("user", user);
        return "/game/chooseCyclists"; }


    @PostMapping("/chooseCyclists")
    public String editTeam(Model model,@ModelAttribute @Valid User user,
                                 BindingResult result) {
        if (result.hasErrors()) {
            return "/game/chooseCyclists";
        }

        List <GameTeam> gameTeamList = user.getGameTeamList();
        GameTeam gameTeamToEdit = gameTeamList.get(0);
        model.addAttribute("gameTeamToEdit", gameTeamToEdit);
        GameTeamDetails gameTeamDetails = new GameTeamDetails();
        model.addAttribute("gameTeamToEdit", gameTeamToEdit);
        model.addAttribute("gameTeamDetails", gameTeamDetails);
        return "/game/editTeam";
    }


}

