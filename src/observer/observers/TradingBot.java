package org.example.observer.observers;

import org.example.observer.IObserver;

public class TradingBot implements IObserver {

    private final double buyLimit;

    public TradingBot(double buyLimit) {
        this.buyLimit = buyLimit;
    }

    @Override
    public void update(String stock, double price) {
        if (price < buyLimit)
            System.out.println("BOT: покупаю " + stock + " по " + price);
        else
            System.out.println("BOT: пропускаю " + stock);
    }

    @Override
    public String toString() {
        return "TradingBot";
    }
}
