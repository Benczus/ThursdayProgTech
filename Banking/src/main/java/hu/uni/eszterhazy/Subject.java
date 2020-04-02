package hu.uni.eszterhazy;

public interface Subject {
    void subscribeObserver(Observer observer);
    void unsubscribeObserver(Observer observer);
    void notifyObservers( );
    String getState();


}
