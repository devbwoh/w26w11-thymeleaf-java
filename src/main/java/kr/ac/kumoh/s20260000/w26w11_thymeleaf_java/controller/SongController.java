package kr.ac.kumoh.s20260000.w26w11_thymeleaf_java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SongController {
    @GetMapping("/songs/random")
    String getRandomSong() {
        return "random";
    }
}
