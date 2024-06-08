package com.habib.ci.controllers;

import com.habib.ci.entities.Comment;
import com.habib.ci.services.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @GetMapping
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }

    @GetMapping("/{id}")
    public Comment getCommentById(@PathVariable Long id) {
        return commentService.getCommentById(id);
    }

    @PostMapping
    public Comment createComment(@RequestBody Comment comment) {
        return commentService.createComment(comment);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) {
        commentService.deleteComment(id);
    }
}
