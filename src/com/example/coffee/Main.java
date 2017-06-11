package com.example.coffee;

import java.util.Scanner;

public class Main {

    private static double pay()
    {
        Scanner input = new Scanner(System.in);
        double pay = input.nextDouble();

        CoffeeMachine money = new CoffeeMachine();
        money.setPay(pay);
        return pay;
    }

    public static void main(String[] args)
    {
        CoffeeMachine coffee = new CoffeeMachine();
        coffee.textOut();
        coffee.moneyEnough(pay());
        



    }
}
