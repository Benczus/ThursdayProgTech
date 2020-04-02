package hu.uni.eszterhazy;

public class PaypalPaymentStrategy implements PaymentStrategy {

    String emailAddress;
    String password;

    public PaypalPaymentStrategy(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment initiated through Paypal with "+ amount +" amount");
    }
}
