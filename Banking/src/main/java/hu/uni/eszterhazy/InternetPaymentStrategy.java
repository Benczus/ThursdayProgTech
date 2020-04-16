package hu.uni.eszterhazy;

public class InternetPaymentStrategy extends PaymentStrategy {

    Card card;

    public InternetPaymentStrategy(Card card) {
        this.card = card;
    }


    @Override
    protected void logout() {
        System.out.println("Internet Transaction ended with card " + this.card.getCardNum());
    }

    @Override
    protected void sendMoney(double amount) {
        System.out.println("Sent " + amount + " from card " + this.card.getCardNum());
    }

    @Override
    protected void authenticate() {
        //TODO AUTHENTICATE WITH CVC
        System.out.println("Internet Transaction began with card " + this.card.getCardNum());
    }
}
