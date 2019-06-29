package pl.sport.sport_manager.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.sport.sport_manager.entity.Stage;
import pl.sport.sport_manager.entity.StageRanking;
import pl.sport.sport_manager.repository.StageRankingRepository;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private StageRankingRepository stageRankingRepository;

    @ModelAttribute("lastStageRanking")
    public List<StageRanking> lastStageRanking() {
        Stage stage =  new Stage();
        return stageRankingRepository.findStageRankingByStage(stage);
    }

    @GetMapping("/")
    public String homePageShow() { return "index"; }

    @GetMapping("/login")
    public String loginPageShow() { return "login"; }

    @GetMapping("/register")
    public String registerPageShow() { return "register"; }

}
