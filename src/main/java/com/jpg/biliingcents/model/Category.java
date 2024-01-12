package com.jpg.biliingcents.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Category")
public class Category extends CommonEntity {
    @Id
    @GeneratedValue
    @Column(name = "cat_id")
    private Integer catId;

    @Column(name = "cat_name")
    private String catName;
}
