package pl.sport.sport_manager.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sport.sport_manager.entity.*;
import pl.sport.sport_manager.repository.CompetitionRepository;
import pl.sport.sport_manager.repository.CyclistTypeRepository;
import pl.sport.sport_manager.repository.StageRankingRepository;
import pl.sport.sport_manager.repository.StageRepository;
import pl.sport.sport_manager.service.SecurityService;
import pl.sport.sport_manager.service.UserService;
import pl.sport.sport_manager.validator.UserValidator;

import java.util.List;
import java.util.stream.Stream;

@Controller
@RequestMapping(path = "/TourDeFranceGame")
public class HomeController {

    @Autowired
    private StageRankingRepository stageRankingRepository;

    @Autowired
    private StageRepository stageRepository;

    @Autowired
    private CyclistTypeRepository cyclistTypeRepository;

    @Autowired
    private CompetitionRepository competitionRepository;

    @Autowired
    private UserValidator userValidator;

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @ModelAttribute("lastStageRankingCyclistYoung")
    public List<StageRanking> lastStageRanking() {
        Stage stage = stageRepository.findLastEnded();
        CyclistType cyclistType = cyclistTypeRepository.findById(1L);
        List<StageRanking> stageRankingList1 = stageRankingRepository
                .findStageRankingsByStageAndCyclistType(stage, cyclistType);
        System.out.println("-----------------------------------");
        Stream.of(stageRankingList1).forEach(System.out::println);
        return stageRankingList1;
    }

    @ModelAttribute("lastStageRankingCyclistSpeed")
    public List<StageRanking> lastStageRanking2() {
        Stage stage = stageRepository.findLastEnded();
        CyclistType cyclistType = cyclistTypeRepository.findById(2L);
        List<StageRanking> stageRankingList2 = stageRankingRepository
                .findStageRankingsByStageAndCyclistType(stage, cyclistType);
        return stageRankingList2;
    }

    @ModelAttribute("lastStageRankingCyclistMounting")
    public List<StageRanking> lastStageRanking3() {
        Stage stage = stageRepository.findLastEnded();
        CyclistType cyclistType = cyclistTypeRepository.findById(3L);
        List<StageRanking> stageRankingList3 = stageRankingRepository
                .findStageRankingsByStageAndCyclistType(stage, cyclistType);
        return stageRankingList3;
    }

    @ModelAttribute("competition")
    public Competition findCompetition() {return competitionRepository.findById(1L);}

    @ModelAttribute("allStages")
    public List<Stage> findAllStages() {return stageRepository.findAll();
    }

    @ModelAttribute("lastStage")
    public Stage findLastStage() {return stageRepository.findLastEnded();
    }


    @GetMapping(path = "/")
    public String homePageShow(Model model) {
        return "index"; }

    @GetMapping("/login")
    public String loginPageShow(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");
        return "login"; }

    @GetMapping("/register")
    public String registerPageShow(Model model) {
        model.addAttribute("userForm", new User());
        return "register"; }

    @PostMapping("/register")
    public String registerPagePost(@ModelAttribute("ueForm") User userForm, BindingResult bindingResult) {
        userValidator.validate(userForm, bindingResult);
        if( bindingResult.hasErrors()) {
            return "register";
        }

        userService.save(userForm);
        securityService.autoLogin(userForm.getLogin(), userForm.getPasswordConfirm());
        return "redirect:/createTeam"; }


}
