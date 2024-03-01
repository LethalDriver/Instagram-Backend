package com.example.instagrambackend.repository;

import com.example.instagrambackend.domain.Post;
import com.example.instagrambackend.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
    Page<Post> findAllByPostedBy(User username, Pageable pageable);
    Page<Post> findAllByPostedByIsIn(List<User> users, Pageable pageable);
    Page<Post> findAllByPostedByIsNot(User user, Pageable pageable);

}
