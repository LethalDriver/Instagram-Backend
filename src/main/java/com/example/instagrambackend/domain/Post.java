package com.example.instagrambackend.domain;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.Date;
import java.util.List;

@Node
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private String imageUri;
    private String caption;
    private Date postedAt;
    @Relationship(type = "LIKES", direction = Relationship.Direction.INCOMING)
    private List<User> likes;
    @Relationship(type = "MAKES_POST", direction = Relationship.Direction.INCOMING)
    private User postedBy;
    @Relationship(type = "COMMENTS_ON", direction = Relationship.Direction.INCOMING)
    private List<Comment> comments;
}
