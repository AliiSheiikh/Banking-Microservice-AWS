package com.Bank_AWS_ECS.BankAWS.service;

import com.Bank_AWS_ECS.BankAWS.dto.BankAccountDTO;

public interface BankService {

        BankAccountDTO createAccount(String ownerName);
        BankAccountDTO getAccount(Long id);
        BankAccountDTO deposit(Long id, double amount);
        BankAccountDTO withdraw(Long id, double amount);
    }


