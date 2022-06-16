package com.example.demo.controller;

import com.example.demo.domain.Board;
import com.example.demo.domain.BoardDto;
import com.example.demo.domain.BoardResponseDto;
import com.example.demo.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/make/board")
    public void makeBoard(@RequestBody BoardDto boardDto) {
        boardService.save(boardDto);
    }

    @GetMapping("/get/board")
    public List<BoardResponseDto> getBoard() {
        return boardService.getBoard();
    }
}
