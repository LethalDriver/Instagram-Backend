package com.example.instagrambackend.domain;

import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class Feed {
    private Long id;
    @Relationship(type = "HAS_FEED", direction = Relationship.Direction.INCOMING)
    private User owner;
    @Relationship(type = "HAS_POST", direction = Relationship.Direction.OUTGOING)
    private List<Post> posts;
}
