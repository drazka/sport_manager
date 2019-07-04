package pl.sport.sport_manager.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import pl.sport.sport_manager.entity.Competition;
import pl.sport.sport_manager.entity.CyclistType;
import pl.sport.sport_manager.entity.Stage;
import pl.sport.sport_manager.entity.StageRanking;
import pl.sport.sport_manager.repository.CompetitionRepository;
import pl.sport.sport_manager.repository.CyclistTypeRepository;
import pl.sport.sport_manager.repository.StageRankingRepository;
import pl.sport.sport_manager.repository.StageRepository;

import java.util.List;


@Controller
public class ResultsController {

    @Autowired
    private StageRankingRepository stageRankingRepository;

    @Autowired
    private StageRepository stageRepository;

    @Autowired
    private CyclistTypeRepository cyclistTypeRepository;

    @Autowired
    private CompetitionRepository competitionRepository;

    @ModelAttribute("competition")
    public Competition findCompetition() {return competitionRepository.findById(1L);}

    @ModelAttribute("allStages")
    public List<Stage> findAllStages() {return stageRepository.findAll();
    }

    @ModelAttribute("lastStage")
    public Stage findLastStage() {return stageRepository.findLastEnded();
    }

    @GetMapping("/stages-result")
    public String stagesPageShow() { return "stagesResult"; }


    @GetMapping("/stage-result/{id}")
    public String stagePageShow(@PathVariable long id, Model model) {
        Stage stage = stageRepository.findById(id);
        System.out.println("---------------------NAME------------");
        System.out.println(stage.getName());
        System.out.println("---------------------END------------");
        CyclistType cyclistType1 = cyclistTypeRepository.findById(1L);
        CyclistType cyclistType2 = cyclistTypeRepository.findById(2L);
        CyclistType cyclistType3 = cyclistTypeRepository.findById(3L);
        List<StageRanking> stageRankingListYoung = stageRankingRepository
                .findStageRankingsByStageAndCyclistType(stage, cyclistType1);
        List<StageRanking> stageRankingListSpeed = stageRankingRepository
                .findStageRankingsByStageAndCyclistType(stage, cyclistType2);
        List<StageRanking> stageRankingListMount = stageRankingRepository
                .findStageRankingsByStageAndCyclistType(stage, cyclistType3);
        model.addAttribute("stage", stage);
        model.addAttribute("stageRankingListYoung", stageRankingListYoung);
        model.addAttribute("stageRankingListSpeed", stageRankingListSpeed);
        model.addAttribute("stageRankingListMount", stageRankingListMount);
        return "stageResult"; }

}
