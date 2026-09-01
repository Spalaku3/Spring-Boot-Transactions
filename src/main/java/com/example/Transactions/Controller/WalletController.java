package com.example.Transactions.Controller;

import com.example.Transactions.Service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class WalletController {

    @Autowired
    private WalletService walletService;

    @PostMapping("/transfer")
    public String transfer(@RequestParam Long SenderId, @RequestParam Long ReceiverId, @RequestParam Double Amount) {
        try{
           walletService.transfer(SenderId, ReceiverId, Amount);
        } catch (Exception e) {
           return "Transfer failed: " + e.getMessage();
        }
        return  "Transfer successful";
    }

}
