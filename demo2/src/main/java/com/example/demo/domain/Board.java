package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String subject;

    @Column(nullable = false)
    private String contents;

    @OneToMany(mappedBy = "board", fetch = FetchType.LAZY)
    private List<Comment> commentList = new ArrayList<>();

    public static Board makeBoard(BoardDto boardDto) {
        Board board = new Board();
        board.setSubject(boardDto.getSubject());
        board.setContents(boardDto.getContents());
        return board;
    }
}
