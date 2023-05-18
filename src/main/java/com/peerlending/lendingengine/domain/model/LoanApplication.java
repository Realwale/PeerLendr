package com.peerlending.lendingengine.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "loan_apps")
public class LoanApplication {


    @Id
    private Long id;

    private double amount;

    @ManyToOne
    private User borrower;

    private Duration repaymentTerm;

    private double interestRate;

}
