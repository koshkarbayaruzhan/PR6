package org.example.main;

import org.example.strategy.*;
import org.example.strategy.model.*;
import org.example.strategy.strategies.*;

import org.example.observer.model.StockExchange;
import org.example.observer.observers.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== TRAVEL SYSTEM ===");

        TravelBookingContext context = new TravelBookingContext();

        TripRequest trip = new TripRequest(
                1000,
                ServiceClass.BUSINESS,
                2,
                false,
                true,
                true
        );

        context.setStrategy(new PlaneStrategy());
        System.out.println("Самолет: " + context.calculatePrice(trip));

        context.setStrategy(new TrainStrategy());
        System.out.println("Поезд: " + context.calculatePrice(trip));

        context.setStrategy(new BusStrategy());
        System.out.println("Автобус: " + context.calculatePrice(trip));

        System.out.println("\n=== STOCK EXCHANGE ===");

        StockExchange exchange = new StockExchange();

        Trader t1 = new Trader("Aruzhan");
        TradingBot bot = new TradingBot(450);

        exchange.subscribe("AAPL", t1);
        exchange.subscribe("AAPL", bot);

        exchange.updatePrice("AAPL", 480);
        exchange.updatePrice("AAPL", 430);
    }
}
