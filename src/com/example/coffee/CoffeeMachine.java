package com.example.coffee;

class CoffeeMachine {

    private double pay;

    void setPay(double money)
    {
        this.pay = money;
    }

    void startWork()
    {
        System.out.println("Coffee costs: 5,5 UAH.");
        System.out.println("");
        System.out.println("Please, enter money: ");
    }

    void moneyEnough(double pay)
    {
        if (pay > 5.5 || pay == 5.5) {
            dispenseCoffee();
            System.out.println("Your change is " + issueChange(pay) + " UAH.");
        }
            else {
            System.out.println("Money not enough!");
        }
    }

    private void dispenseCoffee()
    {
        System.out.println("Coffee is served!");
    }

    private double issueChange(double payment)
    {
        double change;
        change = payment - 5.5;
        return change;
    }

}































   
