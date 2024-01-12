package com.jpg.biliingcents.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "Movement")
public class Movement extends CommonEntity {
    @Id
    @GeneratedValue
    @Column(name = "mov_id")
    private Integer movId;

    @Column(name = "mov_name")
    private Integer movName;

    @Column(name = "note")
    private Integer note;

    @Column(name = "total")
    private Integer total;

    @Column(name = "account_id")
    private Integer accountId;

    @Column(name = "cat_id")
    private Integer catId;

    @Column(name = "debt_id")
    private Integer debtId;

    @Column(name = "mov_type")
    private Integer movType;
}
