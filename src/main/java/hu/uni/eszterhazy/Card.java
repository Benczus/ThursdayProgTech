package hu.uni.eszterhazy;

public class Card
{
    private String cardNum;
    private String ownerName;
    private String expDate;
    private int cvc;


    private Card(String cardNum, String ownerName, String expDate, int cvc) {
        this.cardNum = cardNum;
        this.ownerName = ownerName;
        this.expDate = expDate;
        this.cvc = cvc;
    }

    public static class CardBuilder{
        private String cardNum;
        private String ownerName;
        private String expDate;
        private int cvc;

        public CardBuilder(String ownerName) {
            this.ownerName = ownerName;
            this.cardNum= new String();
            for (int i = 0; i <15 ; i++) {
                this.cardNum=this.cardNum.concat(Math.rint());
            }
        }

        public void setCardNum(String cardNum) {
            this.cardNum = cardNum;
        }

        public void setExpDate(String expDate) {
            this.expDate = expDate;
        }

        public void setCvc(int cvc) {
            this.cvc = cvc;
        }
    }
}
