package com.mascOlav.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String petName;
    private String description;
    private String area;
    private LocalDateTime dateTimeLost; //the date and time the pet was last seen
    private Integer reward;
    private String petPhoto;

    @Enumerated(EnumType.STRING)
    private PostType type;

    @Enumerated(EnumType.STRING)
    private PostStatus status;

    private LocalDateTime datePosted; //the creation date of the post
    private String ownerName;
    private String ownerPhone;

    @Column(nullable = true)
    private String ownerEmail;
}
