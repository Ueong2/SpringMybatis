package com.erp.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	@RequestMapping(value = "/board/write", method = RequestMethod.GET)
	public String writePage() {
		return "board/write";
	}
	
	@RequestMapping(value = "/board/write", method = RequestMethod.POST)
	public String write(BoardDTO board) {
		System.out.println("JSTL게시판 write => " + board);
		service.insert(board);
		return "redirect:/board/list.do";
	}
	
	@RequestMapping(value = "/board/delete")
	public String delete(String board_no) {
		System.out.println("JSTL게시판 delete => " + board_no);
		service.delete(board_no);
		return "redirect:/board/list.do";
	}
	
	@RequestMapping(value = "/board/read.do")
	public String read(String board_no, String state, Model model) {
		BoardDTO board = service.getBoardInfo(board_no);
		model.addAttribute("board", board);
		System.out.println("JSTL게시판 read => " + board);
		return "board/read";
	}
}
