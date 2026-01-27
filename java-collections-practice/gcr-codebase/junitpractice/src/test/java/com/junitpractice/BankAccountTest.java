package com.junitpractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setup() {
        account = new BankAccount(1000.0);
    }

    // Deposit test
    @Test
    void testDeposit() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    // Withdraw test
    @Test
    void testWithdraw() {
        account.withdraw(200.0);
        assertEquals(800.0, account.getBalance());
    }

    // Insufficient balance should fail
    @Test
    void testWithdrawInsufficientFunds() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(2000.0));
        assertEquals(1000.0, account.getBalance()); // balance unchanged
    }

    // Invalid deposit should fail
    @Test
    void testDepositInvalidAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10));
    }

    // Invalid withdraw should fail
    @Test
    void testWithdrawInvalidAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(0));
    }
}
