package com.Bank_AWS_ECS.BankAWS.dto;

public class BankAccountDTO {
    private Long id;
    private String ownerName;
    private double balance;

    public BankAccountDTO() {}

    public BankAccountDTO(Long id, String ownerName, double balance) {
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}