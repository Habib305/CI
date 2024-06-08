package com.habib.ci.repositories;

import com.habib.ci.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}