package com.se.kmbss.controller;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.se.kmbss.service.BoardService;
import com.se.kmbss.mapper.BoardResponse;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService BoardService;
    
    // @GetMapping(".do")
    // public String openBoardWrite(Model model){
    //     return "notice_board";
    // }

    @GetMapping("notice_board.do")
    public String openBoardList(Model model){
        List<BoardResponse> posts=BoardService.findAll();
        model.addAttribute("Board", posts);
        return "notice_board";
    }
    
}

