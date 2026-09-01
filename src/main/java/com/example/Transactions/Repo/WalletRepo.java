package com.example.Transactions.Repo;


import com.example.Transactions.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepo extends JpaRepository<User, Long> {
}
