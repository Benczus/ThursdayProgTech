package hu.uni.eszterhazy;

import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Card
{
    private String cardNum;
    private String ownerName;
    private LocalDate expDate;
    private int cvc;

    public String getCardNum() {
        return cardNum;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public int getCvc() {
        return cvc;
    }

    private Card(String cardNum, String ownerName, LocalDate expDate, int cvc) {
        this.cardNum = cardNum;
        this.ownerName = ownerName;
        this.expDate = expDate;
        this.cvc = cvc;
    }

    public static class CardBuilder{
        private String cardNum;
        private String ownerName;
        private LocalDate expDate;
        private int cvc;

        public CardBuilder(String ownerName) {
            this.ownerName = ownerName;
            generateCardAttributes();
        }

        public CardBuilder setCardNum(String cardNum) {
            this.cardNum = cardNum;
            return this;
        }

        public CardBuilder setExpDate(LocalDate expDate) {
            this.expDate = expDate;
            return this;
        }

        public CardBuilder setCvc(int cvc) {
            this.cvc = cvc;
            return this;
        }

        private void generateCardAttributes(){
            this.cardNum= "";
            for (int i = 0; i <15 ; i++) {
                this.cardNum=this.cardNum.concat(String.valueOf(ThreadLocalRandom.current().nextInt(0, 9)));
            }
            this.expDate = LocalDate.now().plusYears(2);
            this.cvc= ThreadLocalRandom.current().nextInt(100, 999);
        }

        public Card build(){
             return (new Card(this.cardNum, this.ownerName, this.expDate, this.cvc));
        }

    }
}
