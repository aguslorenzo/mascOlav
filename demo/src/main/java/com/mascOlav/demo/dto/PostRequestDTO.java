package com.mascOlav.demo.dto;

import com.mascOlav.demo.model.PostType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostRequestDTO {
    private String petName;
    private String description;
    private String area;
    private LocalDateTime dateTimeLost;
    private Integer reward;
    private String petPhoto;
    private PostType type; // LOST | FOUND
    private String ownerName;
    private String ownerPhone;
    private String ownerEmail;
}
