package com.mascOlav.demo.dto;

import lombok.Data;

@Data
public class VetDTO {
    private String name;
    private String address;
    private Double latitude;
    private Double longitude;
    private String phone;
    private String schedule;
}
