package com.bugetwise;

import java.util.Map;
import java.util.HashMap;

class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, double limit, Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("📅 Monthly Budget Report");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + getTotalExpenses());
        System.out.println("Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        Map<String, Double> spent = new HashMap<>();

        for (Transaction t : transactions) {
            if (t.getType().equals("EXPENSE")) {
                spent.put(
                    t.getCategory(),
                    spent.getOrDefault(t.getCategory(), 0.0) + t.getAmount()
                );
            }
        }

        for (String category : spent.keySet()) {
            if (spent.get(category) >
                categoryLimits.getOrDefault(category, Double.MAX_VALUE)) {
                System.out.println("Overspend detected in " + category);
            }
        }
    }
}
