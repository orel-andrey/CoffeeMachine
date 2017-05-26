package com.example.coffee;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main (String [] args) {
        double cost = 5.5;
        double money;
        money = acceptMoney();

        if (money == cost) {
            dispenseCoffee();
        }
        else if (money > cost) {
            System.out.println("Your change is " + issueChange(money) + " UAH");
            System.out.println("");
            dispenseCoffee();
        }
        else notify("Money not enough.");

    }
    public static double acceptMoney () {
        Scanner input = new Scanner(System.in);
        double payAmount;
        System.out.println("Coffee costs 5,5 UAH.");
        System.out.println("");
        System.out.println("Please, enter money: ");
        payAmount = input.nextDouble();
        return payAmount;
    }

    public static void dispenseCoffee () {
        System.out.println("Coffee is served!");
    }

    public static void notify (String message) {
        System.out.println(message);
    }

    public static double issueChange (double payment) {
        double change;
        change = payment - 5.5;
        return change;
    }

}
