package com.se.kmbss.controller;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.se.kmbss.service.BoardService;
import com.se.kmbss.mapper.BoardRequest;
import com.se.kmbss.mapper.BoardResponse;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService BoardService;

    // @PostMapping("notice_detailpage")
    // public String uploadBoard(final BoardRequest params){
    //     BoardService.uploadBoard(params);
    //     return "redirect:/notice_board";
    // }

    // @GetMapping("notice_detailpage")
    // public String openBoardWrite(@RequestParam(value = "board_idn", required = false) final int board_idn,Model model){
    //     if(board_idn != 0){
    //         BoardResponse post = BoardService.find_by_id(board_idn);
    //         model.addAttribute("post", post);
    //     }
    //     return "notice_detailpage";
    // }

    // @GetMapping("notice_board.do")
    // public String openBoardList(Model model){
    //     List<BoardResponse> posts=BoardService.findAll();
    //     model.addAttribute("posts", posts);
    //     return "notice_board";
    // }
    
}

