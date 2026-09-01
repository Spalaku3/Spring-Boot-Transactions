package com.example.Transactions.Service;

import com.example.Transactions.Repo.WalletRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    @Autowired
    private UserService userService;

    public void transfer(Long senderId, Long receiverId, Double amount) {
        userService.debit(senderId, amount);
        userService.credit(receiverId, amount);
    }
}
