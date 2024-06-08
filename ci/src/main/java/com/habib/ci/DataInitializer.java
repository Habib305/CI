package com.habib.ci;

import com.habib.ci.entities.Comment;
import com.habib.ci.entities.Post;
import com.habib.ci.repositories.CommentRepository;
import com.habib.ci.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@RequiredArgsConstructor
public class DataInitializer {

    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    @Bean
    CommandLineRunner initDatabase() {
        return args -> {
            Post post1 = new Post();
            post1.setTitle("First Post");
            post1.setContent("This is the content of the first post.");

            Post post2 = new Post();
            post2.setTitle("Second Post");
            post2.setContent("This is the content of the second post.");

            Comment comment1 = new Comment();
            comment1.setText("Great post!");
            comment1.setPost(post1);

            Comment comment2 = new Comment();
            comment2.setText("Very informative.");
            comment2.setPost(post1);

            Comment comment3 = new Comment();
            comment3.setText("Thanks for sharing.");
            comment3.setPost(post2);

            post1.setComments(Arrays.asList(comment1, comment2));
            post2.setComments(Arrays.asList(comment3));

            postRepository.save(post1);
            postRepository.save(post2);

            commentRepository.save(comment1);
            commentRepository.save(comment2);
            commentRepository.save(comment3);
        };
    }
}

