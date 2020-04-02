package hu.uni.eszterhazy;

import java.time.LocalDate;

public class InternetPaymentStrategy implements PaymentStrategy {

    Card card;

    public InternetPaymentStrategy(Card card) {
        this.card = card;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment initiated through the internet  with "+ amount +" amount");
    }
}
