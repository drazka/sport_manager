package pl.sport.sport_manager.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.sport.sport_manager.entity.Competition;
import pl.sport.sport_manager.entity.CyclistType;
import pl.sport.sport_manager.entity.Stage;
import pl.sport.sport_manager.entity.StageRanking;
import pl.sport.sport_manager.repository.CompetitionRepository;
import pl.sport.sport_manager.repository.CyclistTypeRepository;
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

    @Autowired
    private CyclistTypeRepository cyclistTypeRepository;

    @Autowired
    private CompetitionRepository competitionRepository;

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


    @GetMapping("/")
    public String homePageShow() {
        return "index"; }

    @GetMapping("/login")
    public String loginPageShow() { return "login"; }

    @GetMapping("/register")
    public String registerPageShow() { return "register"; }

    @GetMapping("/stage-result")
    public String stagePageShow() { return "stageResult"; }

}
