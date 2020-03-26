package hu.uni.eszterhazy;

import java.util.ArrayList;
import java.util.UUID;

public class Account implements Subject {

    private ArrayList<Observer> observers;
    private double balance;
    private String ownerName;
    private UUID id;

    public Account(double balance, String ownerName) {
        this.balance = balance;
        this.ownerName = ownerName;
        id= UUID.randomUUID();
        observers= new ArrayList<>();
    }

    @Override
    public void subscribeObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer obs: observers) {
            System.out.println(obs.notifyObserver(message));
        }
    }

    public void withdraw(Double amount){
        this.balance-=amount*calculateBankingFee();
        notifyObservers("Withdraw");


    }

    private Double calculateBankingFee() {
        return null;
    }


}
