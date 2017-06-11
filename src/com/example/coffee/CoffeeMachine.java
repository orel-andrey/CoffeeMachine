package com.example.coffee;

class CoffeeMachine {

    private double pay;

    void setPay(double money)
    {
        this.pay = money;
    }

    void textOut()
    {
        System.out.println("Coffee costs: 5,5 UAH.");
        System.out.println("");
        System.out.println("Please, enter money: ");
    }

    void moneyEnough(double pay)
    {
        if (pay > 5.5 || pay == 5.5) {

            Coffee coffee = new Coffee();
            coffee.mlOut();
            System.out.println("Your change is " + changeCalculator(pay) + " UAH.");
        }
            else {
            System.out.println("Money not enough!");
        }
    }

    private double changeCalculator (double payment)
    {
        double change;
        change = payment - 5.5;
        return change;
    }

}






























