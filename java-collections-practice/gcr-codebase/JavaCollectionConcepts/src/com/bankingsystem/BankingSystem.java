package com.bankingsystem;

import java.util.*;
public class BankingSystem {

    // HashMap: AccountNumber -> Balance
    private Map<Long, Double> accounts = new HashMap<>();

    // Queue: process withdrawal requests
    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    // Create account
    public void createAccount(long accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
    }

    // Deposit money
    public void deposit(long accountNumber, double amount) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found: " + accountNumber);
            return;
        }
        accounts.put(accountNumber, accounts.get(accountNumber) + amount);
    }

    // Add withdrawal request into Queue
    public void requestWithdrawal(long accountNumber, double amount) {
        withdrawalQueue.offer(new WithdrawalRequest(accountNumber, amount));
    }

    // Process withdrawals in FIFO order
    public void processWithdrawals() {
        System.out.println("\n--- Processing Withdrawals (Queue FIFO) ---");

        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest req = withdrawalQueue.poll();

            if (!accounts.containsKey(req.accountNumber)) {
                System.out.println("Rejected: Account not found -> " + req.accountNumber);
                continue;
            }

            double balance = accounts.get(req.accountNumber);

            if (balance >= req.amount) {
                accounts.put(req.accountNumber, balance - req.amount);
                System.out.println("Success: " + req.amount + " withdrawn from " + req.accountNumber);
            } else {
                System.out.println("Rejected: Insufficient balance for " + req.accountNumber
                        + " (Balance=" + balance + ", Requested=" + req.amount + ")");
            }
        }
    }

    // TreeMap: Sort customers by balance
    public void displayCustomersSortedByBalance() {
        System.out.println("\n--- Customers Sorted by Balance (TreeMap) ---");

        // balance -> list of accounts (because multiple accounts can have same balance)
        Map<Double, List<Long>> sorted = new TreeMap<>();

        for (Map.Entry<Long, Double> entry : accounts.entrySet()) {
            long accNo = entry.getKey();
            double bal = entry.getValue();

            sorted.computeIfAbsent(bal, b -> new ArrayList<>()).add(accNo);
        }

        for (Map.Entry<Double, List<Long>> entry : sorted.entrySet()) {
            double bal = entry.getKey();
            for (long accNo : entry.getValue()) {
                System.out.println("Account: " + accNo + " | Balance: " + bal);
            }
        }
    }

    // Display all accounts
    public void displayAccounts() {
        System.out.println("\n--- Accounts (HashMap) ---");
        System.out.println(accounts);
    }
    
    public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();

        // Create accounts (HashMap)
        bank.createAccount(101, 5000);
        bank.createAccount(102, 12000);
        bank.createAccount(103, 8000);
        bank.createAccount(104, 12000);

        bank.displayAccounts();

        // Add withdrawal requests (Queue)
        bank.requestWithdrawal(101, 2000);
        bank.requestWithdrawal(102, 15000); // insufficient
        bank.requestWithdrawal(103, 3000);
        bank.requestWithdrawal(999, 1000);  // invalid account

        // Process withdrawals FIFO
        bank.processWithdrawals();
        
     // Final state
        bank.displayAccounts();

        // Show customers sorted by balance (TreeMap)
        bank.displayCustomersSortedByBalance();
    }
}
