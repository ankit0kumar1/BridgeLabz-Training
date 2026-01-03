package com.ewalletapplication;

public class EWalletApp {

    public static void main(String[] args) {

        User u1 = new User(1, "Ankit", new PersonalWallet(100));
        User u2 = new User(2, "Sanchit", new BusinessWallet());

        u1.getWallet().loadMoney(1000);
        u2.getWallet().loadMoney(5000);

        u1.getWallet().transferTo(u2, 300);
        u2.getWallet().transferTo(u1, 1000);

        System.out.println("\nBalances:");
        System.out.println("Ankit: ₹" + u1.getWallet().getBalance());
        System.out.println("Sanchit: ₹" + u2.getWallet().getBalance());

        System.out.println("\nAnkit Transactions:");
        u1.getWallet().showTransactions();
    }
}
