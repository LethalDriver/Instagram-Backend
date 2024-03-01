package com.example.instagrambackend.repository;

import com.example.instagrambackend.domain.Comment;
import com.example.instagrambackend.domain.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CommentRepository extends PagingAndSortingRepository<Comment, Long> {
    Page<Comment> findAllCommentsByCommentedOn(Post post, Pageable pageable);
}
