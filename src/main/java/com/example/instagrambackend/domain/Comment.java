package com.example.instagrambackend.domain;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.Date;

@Node
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Date commentedAt;
    @Relationship(type = "COMMENTS", direction = Relationship.Direction.INCOMING)
    private User commentedBy;
    @Relationship(type = "COMMENTS_ON", direction = Relationship.Direction.OUTGOING)
    private Post commentedOn;
}
