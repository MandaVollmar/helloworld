package com.company;

public class Main {

    public static void main(String[] args) {

        double totalCost = (95 + (95 * .082));
        if (totalCost < 50) {
            System.out.println("Go for it!");
        } else if (totalCost > 50 && totalCost < 100 ) {
            System.out.println("Are you sure about this?");
        } else {
            System.out.println("I am hiding your credit card!");
        }
    }
}
