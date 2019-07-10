package pl.sport.sport_manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sport.sport_manager.entity.GameTeam;
import pl.sport.sport_manager.repository.GameTeamRepository;


import java.util.List;

@Controller
public class GameController {

    @Autowired
    GameTeamRepository gameTeamRepository;

    @GetMapping("/createTeam")
    public String stagesPageShow(long id, Model model) {
        List<GameTeam> gameTeamList = gameTeamRepository.findAllByUserId(1L);
        model.addAttribute("gameTeamList", gameTeamList);
        return "/game/teamCreate"; }
}

