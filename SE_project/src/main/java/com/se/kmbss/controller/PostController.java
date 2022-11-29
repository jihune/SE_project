package com.se.kmbss.controller;

import com.se.kmbss.domain.PostRequest;
import com.se.kmbss.domain.PostResponse;
import com.se.kmbss.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("GR_NOTICE")
    public String GR_NOTICE()
    {
        return "GR_NOTICE";
    }



    @PostMapping("GR_Notice")
    public String GR_Notice(final PostRequest params) {
        postService.savePost(params);
        return "redirect:/GR_Notice";
    }
    //게시글 작성 페이지
    @GetMapping("/GR_NOTICE_Write")
    public String GR_NOTICE_Write(@RequestParam(value = "id", required = false) final Long id, Model model) {
        if (id != null) {
            PostResponse post = postService.findPostById(id);
            model.addAttribute("post", post);
        }
        return "GR_NOTICE_Write";
    }



}
