package com.household;

public abstract class Household {
    /**
     * All households earn income and pay 20% of their incomes in taxes;
     * Households will differ in how and how much money they make,
     * as well as how much net income is generated
     */
    double taxRate = 0.20;
    boolean hasPets = true;
    int netWorth = 0;
    int paycheck;

    // earn gross income
    public void earnIncome(int paycheck){
        this.paycheck = paycheck;
    }

    // pay taxes
    public int paysTaxes() {
        return (int) ((int) paycheck*taxRate);
    }

    // get net income
    public int netIncome() {
        int netIncome = paycheck - paysTaxes();
        netWorth += netIncome;
        return netIncome;
    }

    public String introduce() {
        String about = String.format("This household earned $%d and paid $%d in taxes" +
                " so now it has a net worth of $%d.", paycheck,paysTaxes(),netWorth);
        return about;
    }
}
