package org.example.observer;

public interface ISubject {
    void subscribe(String stock, IObserver observer);
    void unsubscribe(String stock, IObserver observer);
    void notifyObservers(String stock, double price);
}
