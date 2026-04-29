package com.mascOlav.demo.dto;

import com.mascOlav.demo.model.PostStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostResponseDTO {
    private Long id;
    private String petName;
    private String description;
    private String area;
    private LocalDateTime dateTimeLost;
    private Integer reward;
    private String petPhoto;
    private PostStatus status;
    private LocalDateTime datePosted;
    private String ownerName;
    private String ownerPhone;
    private String ownerEmail;
}
