package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String contents;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;

    public static Comment makeComment(Board board, CommentDto commentDto) {
        Comment comment = new Comment();
        comment.contents = commentDto.getContents();
        comment.board = board;

        return comment;
    }
}
