package com.Bank_AWS_ECS.BankAWS.service;

import com.Bank_AWS_ECS.BankAWS.dto.BankAccountDTO;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class BankServiceImplementation implements BankService {

    private final Map<Long, BankAccountDTO> accounts = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    @Override
    public BankAccountDTO createAccount(String ownerName) {
        Long id = idGenerator.getAndIncrement();
        BankAccountDTO account = new BankAccountDTO(id, ownerName, 0.0);
        accounts.put(id, account);
        return account;
    }

    @Override
    public BankAccountDTO getAccount(Long id) {
        return accounts.get(id);
    }

    @Override
    public BankAccountDTO deposit(Long id, double amount) {
        BankAccountDTO account = accounts.get(id);
        account.setBalance(account.getBalance() + amount);
        return account;
    }

    @Override
    public BankAccountDTO withdraw(Long id, double amount) {
        BankAccountDTO account = accounts.get(id);

        if (account.getBalance() < amount) {
            throw new RuntimeException("Insufficient funds");
        }

        account.setBalance(account.getBalance() - amount);
        return account;
    }
}