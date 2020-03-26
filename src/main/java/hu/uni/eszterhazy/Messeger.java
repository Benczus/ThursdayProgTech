package hu.uni.eszterhazy;

public abstract class Messeger implements Observer{

    String messege;
    Subject subject;



    public String notifyObserver(String messege){
        this.messege =messege;
        return displayMessage();
    }


     abstract String displayMessage();

}
