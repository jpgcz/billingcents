package com.jpg.biliingcents.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "Debt")
public class Debt extends CommonEntity {
    @Id
    @GeneratedValue
    @Column(name = "debt_id")
    private Integer accountId;

    @Column(name = "debt_name")
    private String accountName;

    @Column(name = "description")
    private String description;

    @Column(name = "debt_initial")
    private Float debtInitial;

    @Column(name = "debt_total")
    private Float debtTotal;
}
