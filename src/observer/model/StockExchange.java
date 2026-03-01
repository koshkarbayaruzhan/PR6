package org.example.observer.model;

import org.example.observer.*;

import java.util.*;

public class StockExchange implements ISubject {

    private final Map<String, List<IObserver>> observers = new HashMap<>();

    @Override
    public void subscribe(String stock, IObserver observer) {
        observers.computeIfAbsent(stock, k -> new ArrayList<>()).add(observer);
        System.out.println(observer + " подписался на " + stock);
    }

    @Override
    public void unsubscribe(String stock, IObserver observer) {
        if (observers.containsKey(stock)) {
            observers.get(stock).remove(observer);
        }
    }

    @Override
    public void notifyObservers(String stock, double price) {
        if (!observers.containsKey(stock)) return;

        for (IObserver o : observers.get(stock)) {
            o.update(stock, price);
        }
    }

    public void updatePrice(String stock, double price) {
        System.out.println("\nБиржа: " + stock + " = " + price);
        notifyObservers(stock, price);
    }
}
