package com.example.instagrambackend.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.example.instagrambackend.domain.User;
import org.springframework.data.domain.Page;

public interface UserRepository extends PagingAndSortingRepository <User, Long>{
    User findByUsername(String username);
    User findByEmail(String email);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
