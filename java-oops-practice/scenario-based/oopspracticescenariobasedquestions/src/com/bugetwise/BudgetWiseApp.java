package com.bugetwise;

import java.util.*;


public class BudgetWiseApp {
    public static void main(String[] args) {

        Map<String, Double> limits = new HashMap<>();
        limits.put("Food", 5000.0);
        limits.put("Travel", 3000.0);

        Budget budget = new MonthlyBudget(30000, 20000, limits);

        budget.addExpense(4500, "Food");
        budget.addExpense(3500, "Travel");

        budget.generateReport();
        budget.detectOverspend();
    }
}

