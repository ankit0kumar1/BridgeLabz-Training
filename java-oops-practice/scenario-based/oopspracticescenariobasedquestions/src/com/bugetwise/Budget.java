package com.bugetwise;

import java.time.LocalDate;
import java.util.*;

abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;
    protected Map<String, Double> categoryLimits;
    protected List<Transaction> transactions;

    protected Budget(double income, double limit, Map<String, Double> categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    // Encapsulated expense addition
    public void addExpense(double amount, String category) {
        transactions.add(
            new Transaction(amount, "EXPENSE", LocalDate.now(), category)
        );
    }

    public void addIncome(double amount) {
        transactions.add(
            new Transaction(amount, "INCOME", LocalDate.now(), "GENERAL")
        );
    }

    protected double getTotalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getType().equals("EXPENSE")) {
                total += t.getAmount();
            }
        }
        return total;
    }

    // Operator usage
    public double calculateNetSavings() {
        return income - getTotalExpenses();
    }
}
