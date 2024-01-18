package com.study.board.controller;

import com.study.board.entity.Board;
import com.study.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// 스프링에게 여기가 컨트롤러임을 알려주는 annotate
@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write") // http:/localhost:8080/board/write
    public String boardWriteForm() {
        return "boardwrite"; // 어떤 view 파일로 보낼지 입력
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(Board board, Model model) {
        boardService.write(board);

        model.addAttribute("message", "글 작성이 완료되었습니다.");
        model.addAttribute("searchUrl", "/board/list");
        return "message";
    }

    @GetMapping("/board/list")
    public String boardList(Model model) {
        // boardService.boardList에서 반환된 리스트를 list라는 이름으로 받아서 넘긴다!
        model.addAttribute("list", boardService.boardList());
        return "boardlist";
    }

    // http:/localhost:8080/board/view?id=1 : get 방식
    @GetMapping("/board/view")
    public String boardView(Model model, Integer id) {
        // 넘겨주기만 함, 출력하는 건 타임리프로 !
        model.addAttribute("board", boardService.boardView(id));
        return "boardview";
    }

    // http:/localhost:8080/board/delete?id=1 : id 번호에 따른 값 삭제
    @GetMapping("/board/delete")
    public String boardDelete(Integer id){
        boardService.boardDelete(id);
        return "redirect:/board/list";
    }

    // PathVariable : id 값이 인식되어 integer 형식의 id로 들어온다는 것
    @GetMapping("/board/modify/{id}")
    public String boardModify(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("board", boardService.boardView(id));
        return "boardmodify";
    }

    @PostMapping("/board/update/{id}")
    public String boardUpdate(@PathVariable("id") Integer id, Board board, Model model) {
        // Query String과 annotaion 사용해서 받아오는 방법
        // Board 객체를 생성하여 기존에 있던 글을 검색해 담음
        Board boardTemp = boardService.boardView(id);
        // 기존에 있던 내용을 덮어 씌움
        boardTemp.setTitle(board.getTitle());
        boardTemp.setContent(board.getContent());

        boardService.write(boardTemp);

        // 수정 완료했습니다 메세지 출력
        String address = "/board/view?id="+id;
        model.addAttribute("message", "글 수정이 완료되었습니다.");
        model.addAttribute("searchUrl", address);
//        return "redirect:/board/list";
//        return "redirect:/board/view?id={id}";
        return "message";
    }
}
