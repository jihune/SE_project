package com.se.kmbss.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.se.kmbss.service.BoardService;

@Controller
@RequiredArgsConstructor
public class BoardController {
    
    private final BoardService BoardService;

    @GetMapping
    public String openBoardWrite(Model model){
        return "Board/Write";
    }

}
