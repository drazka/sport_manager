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
import pl.sport.sport_manager.entity.Budget;
import pl.sport.sport_manager.entity.GameTeam;
import pl.sport.sport_manager.entity.User;
import pl.sport.sport_manager.repository.BudgetRepository;
import pl.sport.sport_manager.repository.CompetitionRepository;
import pl.sport.sport_manager.repository.GameTeamRepository;
import pl.sport.sport_manager.repository.UserRepository;

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
                                BindingResult result, Authentication authentication) {
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
}

