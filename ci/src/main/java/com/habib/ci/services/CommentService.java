package com.habib.ci.services;

import com.habib.ci.repositories.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.habib.ci.entities.Comment;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public Comment getCommentById(Long id) {
        return commentRepository.findById(id).orElse(null);
    }

    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }
}

