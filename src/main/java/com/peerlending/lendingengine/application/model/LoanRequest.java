package com.peerlending.lendingengine.application.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class LoanRequest {

    private double amount;

    private long borrowerId;

    private int daysToRepay;

    private double interestRate;

}
