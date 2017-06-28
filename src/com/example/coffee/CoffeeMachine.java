package com.example.coffee;

class CoffeeMachine implements CoffeeMachineOn {

    private double money;

    void setPay(double money)
    {
        this.money = money;
    }

    private void displayTheStartMessage()
    {
        System.out.println("Coffee costs: 5,5 UAH.");
        System.out.println("");
        System.out.println("Please, enter money: ");
    }

    private void toCheckIsEnoughMoney(double money)
    {
        if (money > 5.5 || money == 5.5) {
            Coffee coffee = new Coffee();
            coffee.mlOut();
            System.out.println("Your change is " + countTheChange(money) + " UAH.");
        }
            else {
            System.out.println("Money not enough!");
        }
    }


    private double countTheChange(double payment)
    {
        double change;
        change = payment - 5.5;
        return change;
    }

    public void startTheCoffeeMachine()
    {
        displayTheStartMessage();
        toCheckIsEnoughMoney(Main.moneyDeposited());
    }

}
