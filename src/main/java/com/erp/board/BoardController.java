package com.erp.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	BoardService service;
	
	@Autowired
	public BoardController(BoardService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping("/board/list.do")
	public String list(Model model) {
		List<BoardDTO> boardList = service.boardList();
		System.out.println(boardList);
		model.addAttribute("boardList", boardList);
		return "board/list";
	}
//	@RequestMapping("/board/list.do")
//	public String list(Model model) {
//		List<BoardDTO> boardList = service.boardList();
//		System.out.println(boardList);
//		model.addAttribute("boardList", boardList);
//		return "board/list";
//	}
}
