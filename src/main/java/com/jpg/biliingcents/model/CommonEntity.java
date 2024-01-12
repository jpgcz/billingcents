package com.jpg.biliingcents.model;

import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;

@Data
public class CommonEntity {
    @Column(name = "is_active")
    protected Boolean isActive;

    @Column(name = "cr_dt")
    protected Date creationDate;

    @Column(name = "mo_dt")
    protected Date modificationDate;

    @Column(name = "user_id")
    private Integer userId;
}
