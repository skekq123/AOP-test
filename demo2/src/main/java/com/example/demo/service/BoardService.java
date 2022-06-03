package com.example.demo.service;

import com.example.demo.domain.Board;
import com.example.demo.domain.BoardDto;
import com.example.demo.domain.User;
import com.example.demo.domain.UserDto;
import com.example.demo.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public void save(BoardDto boardDto) {
        boardRepository.save(Board.makeBoard(boardDto));
    }

    public List<Board> getBoard() {
        return boardRepository.findAll();
    }
}
