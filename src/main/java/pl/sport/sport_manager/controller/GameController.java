package pl.sport.sport_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

    @GetMapping("/createTeam")
    public String stagesPageShow() { return "/game/teamCreate"; }
}