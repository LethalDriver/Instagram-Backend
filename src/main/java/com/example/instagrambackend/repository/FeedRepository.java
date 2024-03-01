package com.example.instagrambackend.repository;

import com.example.instagrambackend.domain.Feed;
import com.example.instagrambackend.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface FeedRepository extends CrudRepository<Feed, Long> {
    Feed findByOwner(User user);
}
