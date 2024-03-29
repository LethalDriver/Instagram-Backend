package com.example.instagrambackend.domain;

import org.springframework.data.neo4j.core.schema.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Node("User")
public class User implements UserDetails {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    @Relationship(type = "FOLLOWS", direction = Relationship.Direction.OUTGOING)
    private List<User> isFollowing;
    @Relationship(type = "FOLLOWS", direction = Relationship.Direction.INCOMING)
    private List<User> followers;
    @Relationship(type = "MAKES_POST", direction = Relationship.Direction.OUTGOING)
    private List<Post> posts;
    @Relationship(type = "LIKES", direction = Relationship.Direction.OUTGOING)
    private List<Post> likedPosts;
    @Relationship(type = "COMMENTS", direction = Relationship.Direction.OUTGOING)
    private List<Comment> comments;
    @Relationship(type = "HAS_FEED", direction = Relationship.Direction.OUTGOING)
    private Feed feed;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
