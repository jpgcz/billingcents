package com.jpg.biliingcents.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MovementDto {
    private String movName;

    private String note;

    private Float total;

    private Integer accountId;

    private Integer catId;

    private String movType;

    protected Date creationDate;
}
