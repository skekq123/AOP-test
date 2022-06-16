package com.example.demo.controller;

import com.example.demo.domain.CommentDto;
import com.example.demo.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @PostMapping("/make/comment/{id}")
    public void makeComment(@PathVariable Integer id, @RequestBody CommentDto commentDto) {
        commentService.makeComment(id ,commentDto);
    }
}
