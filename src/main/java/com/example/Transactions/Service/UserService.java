package com.example.Transactions.Service;

import com.example.Transactions.Model.User;
import com.example.Transactions.Repo.WalletRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private WalletRepo walletRepo;

    public void debit(Long userId, Double amount) {
      User user =walletRepo.findById(userId).orElseThrow();
      user.setBalance(user.getBalance() - amount);
      walletRepo.save(user);

    }

    public void credit(Long userId, Double amount) {
        User user =walletRepo.findById(userId).orElseThrow();
        user.setBalance(user.getBalance() + amount);
        walletRepo.save(user);
    }
}
