package hu.uni.eszterhazy;

public class PaypalPaymentStrategy extends PaymentStrategy {

    String emailAddress;
    String password;

    public PaypalPaymentStrategy(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }


    @Override
    protected void logout() {
        System.out.println("Log out from user" + this.emailAddress);
    }

    @Override
    protected void sendMoney(double amount) {
        System.out.println("Sent " + amount + " from user " + this.emailAddress);
    }

    @Override
    protected void authenticate() {
        //TODO AUTHENTICATE WITH PAYPAL
        System.out.println("Authenticated to user " + this.emailAddress);
    }
}
