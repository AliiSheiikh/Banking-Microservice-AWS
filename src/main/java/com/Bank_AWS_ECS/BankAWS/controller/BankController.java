package com.Bank_AWS_ECS.BankAWS.controller;

import com.Bank_AWS_ECS.BankAWS.dto.BankAccountDTO;
import com.Bank_AWS_ECS.BankAWS.dto.TransactionDTO;
import com.Bank_AWS_ECS.BankAWS.service.BankService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
public class BankController {

    private final BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    // Create account
    @PostMapping
    public BankAccountDTO createAccount(@RequestParam String ownerName) {
        return bankService.createAccount(ownerName);
    }

    // Get account
    @GetMapping("/{id}")
    public BankAccountDTO getAccount(@PathVariable Long id) {
        return bankService.getAccount(id);
    }

    // Deposit
    @PostMapping("/{id}/deposit")
    public BankAccountDTO deposit(
            @PathVariable Long id,
            @RequestBody TransactionDTO dto
    ) {
        return bankService.deposit(id, dto.getAmount());
    }

    // Withdraw
    @PostMapping("/{id}/withdraw")
    public BankAccountDTO withdraw(
            @PathVariable Long id,
            @RequestBody TransactionDTO dto
    ) {
        return bankService.withdraw(id, dto.getAmount());
    }
}