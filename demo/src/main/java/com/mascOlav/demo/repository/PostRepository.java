package com.mascOlav.demo.repository;

import com.mascOlav.demo.model.Post;
import com.mascOlav.demo.model.PostStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByStatus(PostStatus status);
}
