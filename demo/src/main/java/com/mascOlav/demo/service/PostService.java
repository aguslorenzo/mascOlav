package com.mascOlav.demo.service;

import com.mascOlav.demo.dto.PostRequestDTO;
import com.mascOlav.demo.model.Post;
import com.mascOlav.demo.model.PostStatus;
import com.mascOlav.demo.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    //create a post
    public Post createPost(PostRequestDTO postDto){
        Post post = new Post();
        post.setPetName(postDto.getPetName());
        post.setDescription(postDto.getDescription());
        post.setArea(postDto.getArea());
        post.setDateTimeLost(postDto.getDateTimeLost());
        post.setReward(postDto.getReward());
        post.setPetPhoto(postDto.getPetPhoto());
        post.setType(postDto.getType());
        post.setOwnerName(postDto.getOwnerName());
        post.setOwnerPhone(postDto.getOwnerPhone());
        post.setOwnerEmail(postDto.getOwnerEmail());
        post.setStatus(PostStatus.PENDING);
        post.setDatePosted(LocalDateTime.now());
        return postRepository.save(post);
    }

    //moderator edits post status
    public Post updatePostStatus(Long id, PostStatus status){
        Post post = postRepository.findById(id).orElseThrow();
        post.setStatus(status);
        return postRepository.save(post);
    }

    //delete a post
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

    //find post by status
    public List<Post> findByStatus(PostStatus status){
        return postRepository.findByStatus(status);
    }
    //find all posts
    public Iterable<Post> findAll(){
        return postRepository.findAll();
    }
}
