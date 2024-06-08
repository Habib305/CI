package com.habib.ci.services;

import com.habib.ci.entities.Post;
import com.habib.ci.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
