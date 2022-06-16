package com.example.demo.service;

import com.example.demo.domain.*;
import com.example.demo.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public void save(BoardDto boardDto) {
        boardRepository.save(Board.makeBoard(boardDto));
    }

    public List<BoardResponseDto> getBoard() {
        List<Board> boardList = boardRepository.findAll();
        List<BoardResponseDto> boardResponseDtos = new ArrayList<>();

        for(Board board : boardList) {
            Integer commentCount = board.getCommentList().size();
            BoardResponseDto boardResponseDto = BoardResponseDto.boardToResponseDto(board, commentCount);
            boardResponseDtos.add(boardResponseDto);
        }
        return boardResponseDtos;
    }
}
