package com.groovy.mysqldb;

import com.groovy.mysqldb.service.BoardService;
import com.groovy.mysqldb.vo.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

    @GetMapping("/hello")
    public String Hello() {

        return "boards/hello";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("cnt", service.boardCount());
        model.addAttribute("test", service.boardList());
        return "boards/hello";
    }

    // 상세
    @GetMapping("/{bno}")
    public String getOneBoard(@PathVariable(name = "bno")int bno, Model model) {
        Board board = service.getOneBoard(bno);
        model.addAttribute("board", board);

        return "boards/boardDetail";
    }

    // 게시판 페이징
    @GetMapping("/page/{page}")
    public String getBoard(@PathVariable(name = "page")int page, Model model) {
        List<Board> list = service.getBoard(page);
        model.addAttribute("list", list);
        return "boards/board";
    }

    // 게시판 수정
    @ResponseBody
    @PutMapping("/{bno}")
    public void updateBoard(@RequestBody Board board, Model model) {
        int result = service.updateBoard(board);
    }

    // 게시판 조회수증가
    @ResponseBody
    @PutMapping("/updateCounts/{bno}")
    public void updateCounts(@PathVariable(name = "bno")int bno) {
        int result = service.updateCounts(bno);
    }

    // 게시판 삭제
    @ResponseBody
    @DeleteMapping("/{bno}")
    public void deleteBoard(@PathVariable(name = "bno")int bno, Model model) {
        int result = service.deleteBoard(bno);
    }
}
