package hu.uni.eszterhazy;

public abstract class Messeger implements Observer{

    String state;
    private Subject subject;

    public Messeger(Subject subject) {
        this.subject = subject;
    }

    public String notifyObserver(){
        this.state = subject.getState();
        return displayMessage();
    }


     abstract String displayMessage();

}
