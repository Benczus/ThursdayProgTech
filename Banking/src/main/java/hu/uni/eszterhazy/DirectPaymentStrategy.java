package hu.uni.eszterhazy;

import java.util.UUID;

public class DirectPaymentStrategy implements PaymentStrategy {

    int PIN;
    UUID sessionID;

    public DirectPaymentStrategy(int PIN, UUID sessionID) {
        this.PIN = PIN;
        this.sessionID = sessionID;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment initiated directly with "+ amount +" amount");
    }
}
