package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardResponseDto {
    private String subject;
    private String contents;
    private Integer commentCount;

    public static BoardResponseDto boardToResponseDto(Board board, Integer commentCount) {
        BoardResponseDto boardResponseDto = new BoardResponseDto();
        boardResponseDto.setContents(board.getContents());
        boardResponseDto.setSubject(board.getSubject());
        boardResponseDto.setCommentCount(commentCount);
        return boardResponseDto;
    }
}
