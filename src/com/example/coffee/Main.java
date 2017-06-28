package com.example.coffee;

import java.util.Scanner;

public class Main {

    static double moneyDeposited()
    {
        Scanner input = new Scanner(System.in);
        double inputMoney = input.nextDouble();

        CoffeeMachine money = new CoffeeMachine();
        money.setPay(inputMoney);
        return inputMoney;
    }

    public static void main(String[] args)
    {
        CoffeeMachineOn coffeeMachine = new CoffeeMachine();
        coffeeMachine.startTheCoffeeMachine();
    }
}
