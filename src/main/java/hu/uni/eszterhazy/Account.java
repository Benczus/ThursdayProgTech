package hu.uni.eszterhazy;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Account implements Subject {

    private ArrayList<Observer> observers;
    private double balance;
    private String ownerName;
    private UUID id;
    private List<Card> cards;



    public String getState() {
        return state;
    }

    private void setState(String state) {
        this.state = state;
    }

    private String state;


    public Account(double balance, String ownerName) {
        this.balance = balance;
        this.ownerName = ownerName;
        id= UUID.randomUUID();
        observers= new ArrayList<>();
        cards= new ArrayList<>();
    }

    public void addNewCard(Card card){ this.cards.add(card);}

    public void removeNewCard(Card card){ this.cards.remove(card);}

    public List<Card> getCards() {
        return cards;
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
    public void notifyObservers() {
        for (Observer obs: observers) {
            System.out.println(obs.notifyObserver());
        }
    }

    public void withdraw(Double amount){
        this.balance=calculateBankingFee();
        setState("Withdrawn");
        notifyObservers();
    }

    public void pay(Double amount, PaymentStrategy strategy){
        strategy.pay(amount);
    }


    private Double calculateBankingFee() {
        return 0.0;
    }


}
