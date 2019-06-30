package pl.sport.sport_manager.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.sport.sport_manager.entity.Stage;
import pl.sport.sport_manager.entity.StageRanking;
import pl.sport.sport_manager.repository.StageRankingRepository;
import pl.sport.sport_manager.repository.StageRepository;

import java.util.List;
import java.util.stream.Stream;

@Controller
public class HomeController {

    @Autowired
    private StageRankingRepository stageRankingRepository;

    @Autowired
    private StageRepository stageRepository;

    @ModelAttribute("lastStageRanking")
    public List<StageRanking> lastStageRanking() {
        Stage stage = stageRepository.findById(1);
        List<StageRanking> stageRankingList = stageRankingRepository
                .findStageRankingsByStage(stage);
        return stageRankingList;
    }

    @GetMapping("/")
    public String homePageShow() {
        Stage stage = stageRepository.findById(1);
        List<StageRanking> stageRankingList = stageRankingRepository
                .findStageRankingsByStage(stage);
        Stream.of(stageRankingList).forEach((System.out::println));
        return "index"; }

    @GetMapping("/login")
    public String loginPageShow() { return "login"; }

    @GetMapping("/register")
    public String registerPageShow() { return "register"; }

}
