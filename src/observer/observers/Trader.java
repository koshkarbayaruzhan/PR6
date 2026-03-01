package org.example.observer.observers;

import org.example.observer.IObserver;

public class Trader implements IObserver {

    private final String name;

    public Trader(String name) {
        this.name = name;
    }

    @Override
    public void update(String stock, double price) {
        System.out.println("Трейдер " + name + " получил: " + stock + " = " + price);
    }

    @Override
    public String toString() {
        return "Trader[" + name + "]";
    }
}
