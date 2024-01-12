package com.jpg.biliingcents.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MovementDto {
    private Integer movName;

    private Integer note;

    private Integer total;

    private Integer accountId;

    private Integer catId;

    private Integer movType;

    protected Date creationDate;
}
