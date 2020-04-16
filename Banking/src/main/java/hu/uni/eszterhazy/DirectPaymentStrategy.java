package hu.uni.eszterhazy;

import java.util.UUID;

public class DirectPaymentStrategy extends PaymentStrategy {

    int PIN;
    UUID sessionID;

    public DirectPaymentStrategy(int PIN, UUID sessionID) {
        this.PIN = PIN;
        this.sessionID = sessionID;
    }


    @Override
    protected void logout() {
        System.out.println("Direct Transaction ended with ID " + this.sessionID);
    }

    @Override
    protected void sendMoney(double amount) {
        System.out.println("Sent " + amount + " with ID" + sessionID);
    }

    @Override
    protected void authenticate() {
        //TODO AUTHENTICATE WITH PIN
        System.out.println("Direct Transaction began with ID " + this.sessionID);
    }
}
