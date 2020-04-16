package hu.uni.eszterhazy;


public abstract class PaymentStrategy {

    //TEMPLATE METHOD
    void pay(double amount) {
        System.out.println("A payment has been initiated for " + amount);
        authenticate();
        sendMoney(amount);
        logout();
    }

    protected abstract void logout();

    protected abstract void sendMoney(double amount);

    protected abstract void authenticate();

}
