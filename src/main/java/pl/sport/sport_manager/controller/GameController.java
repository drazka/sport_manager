package pl.sport.sport_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class GameController {

//    @Autowired
//    GameTeamRepository gameTeamRepository;

    @GetMapping("/createTeam")
    public String stagesPageShow(Model model) {
       // List<GameTeam> gameTeamList = gameTeamRepository.findAllByUserId(id);
        return "/game/teamCreate"; }
}

