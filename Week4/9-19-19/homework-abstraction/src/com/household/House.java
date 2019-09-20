package com.household;

public class House extends Household {
    public String introduce() {
        String about = String.format("This household earned $%d and paid $%d in taxes" +
                " so now it has a net worth of $%d.", paycheck,paysTaxes(),netWorth);
        return about;
    }
}
