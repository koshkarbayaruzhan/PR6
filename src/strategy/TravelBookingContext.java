package org.example.strategy;

import org.example.strategy.model.TripRequest;

public class TravelBookingContext {

    private ICostCalculationStrategy strategy;

    public void setStrategy(ICostCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculatePrice(TripRequest request) {
        if (strategy == null) {
            throw new IllegalStateException("Стратегия не выбрана");
        }
        return strategy.calculate(request);
    }
}
