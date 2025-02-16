package com.se.kmbss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.se.kmbss.mapper.MainMapper;
import com.se.kmbss.service.MainService;
import com.se.kmbss.service.BoardService;
import com.se.kmbss.service.CommentService;
import com.se.kmbss.mapper.BoardPaging;
import com.se.kmbss.mapper.BoardRequest;
import com.se.kmbss.mapper.BoardResponse;
import com.se.kmbss.mapper.CommentRequest;
import com.se.kmbss.mapper.CommentResponse;

/**
 * 기본적인 html 페이지를 연결해 주는 곳이다.
 * 추후 Mapper 통해서 쿼리문 사용 DB와 연결
 */

@Controller
public class MainController {

	@Autowired
	BoardService BoardService;
	@Autowired
	MainService service;
	// @Autowired
	// BoardRequest BoardRequest;

	@Autowired
	MainMapper mapper;

	@Autowired
	CommentService commentService;

	@GetMapping
	public String index(Model model) {
		return "index";
	}

	@GetMapping("index")
	public String index() {
		return "index";
	}

	@GetMapping("notice_board")
	public String notice_board(@ModelAttribute("params")final BoardPaging params, Model model) {
		//params.setCount(BoardService.count());
		List<BoardResponse> posts=BoardService.find_all(params);
        model.addAttribute("posts", posts);
        return "notice_board";
	}

	@GetMapping("write_board")
	public String write_board() {
		return "write_board";
	}

	@PostMapping("write_board")
	public String uploadBoard(final BoardRequest params){
		BoardService.uploadBoard(params);
		return "redirect:notice_board";
	}

	@GetMapping("notice_detailpage")
	public String notice_detailpage(int boardidn, Model model) {
		BoardResponse post = BoardService.find_by_id(boardidn);
		List<CommentResponse> comment = commentService.find_by_boardidn(boardidn);
		BoardService.uploadviewcnt(boardidn);
		model.addAttribute("post", post);
		model.addAttribute("comment", comment);
		return "notice_detailpage";
	}

	@PostMapping("uploadcomment")
	public String uploadcomment(final CommentRequest params){
		commentService.uploadcomment(params);
		return "redirect:notice_detailpage?boardidn="+params.getBoardidn();
	}

	// @GetMapping("search_board")
	// public String searcboard(final BoardSearch params, Model model) {
	// 	List<BoardResponse> posts=BoardService.find_all(params);
	// 	model.addAttribute("posts", posts);
	// 	return "redirect:notice_board";
	// }

	@GetMapping("my_boards")
	public String my_boards() {
		return "my_boards";
	}

	@GetMapping("private_board")
	public String private_board() {
		return "private_board";
	}

	@GetMapping("create_study")
	public String create_study() {
		return "create_study";
	}

	@GetMapping("setting")
	public String setting() {
		return "setting";
	}

	@GetMapping("security_question")
	public String security_question(){return "security_question";}

	@GetMapping("password_change")
	public String password_change(){return "password_change";}

	@GetMapping("notice_setting")
	public String notice_setting(){return "notice_setting";}

	@GetMapping("lock_setting")
	public String lock_setting(){return "lock_setting";}

	@GetMapping("nickname_change")
	public String nickname_change(){return "nickname_change";}

	@GetMapping("stopwatch")
	public String stopwatch(){return "stopwatch";}
	
	@GetMapping("group_chat")
	public String group_chat() {
		return "group_chat";
	}
	@GetMapping("my_page")
	public String my_page() {
		return "my_page";
	}

	@GetMapping("persenal_location_set")
	public String persenal_location_set() {
		return "persenal_location_set";
	}

	@GetMapping("group_info")
	public String group_info() {
		return "group_info";
	}

	@GetMapping("group_reader_change")
	public String group_reader_change() {
		return "group_reader_change";
	}

	@GetMapping("group_name_change")
	public String group_name_change() {
		return "group_name_change";
	}

	@GetMapping("recruits_number_change")
	public String recruits_number_change() {
		return "recruits_number_change";
	}

	@GetMapping("groupmember_drop")
	public String groupmember_drop() {
		return "groupmember_drop";
	}

	@GetMapping("group_blockuser")
	public String group_blockuser() {
		return "group_blockuser";
	}
}
