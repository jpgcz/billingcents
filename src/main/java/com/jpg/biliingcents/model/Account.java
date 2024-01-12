package com.jpg.biliingcents.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "Account")
public class Account extends CommonEntity{
    @Id
    @GeneratedValue
    @Column(name = "account_id")
    private Integer accountId;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "bank")
    private String bank;

    @Column(name = "initial_amount")
    private String initialAmount;

    @Column(name = "current_amount")
    private String currentAmount;
}
