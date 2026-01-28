package com.Bank_AWS_ECS.BankAWS.dto;

public class TransactionDTO {

    private double amount;

    public TransactionDTO() {}

    public TransactionDTO(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}