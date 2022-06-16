package com.example.demo.service;

import com.example.demo.domain.Board;
import com.example.demo.domain.Comment;
import com.example.demo.domain.CommentDto;
import com.example.demo.repository.BoardRepository;
import com.example.demo.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final BoardRepository boardRepository;

    public void makeComment(Integer id, CommentDto commentDto) {
        Board board = boardRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException("해당 게시물이 존재하지 않습니다."));

        Comment comment = Comment.makeComment(board, commentDto);
        commentRepository.save(comment);
    }
}
