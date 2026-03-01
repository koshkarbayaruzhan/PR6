package org.example.strategy.strategies;

import org.example.strategy.ICostCalculationStrategy;
import org.example.strategy.model.*;

public class BusStrategy implements ICostCalculationStrategy {

    @Override
    public double calculate(TripRequest r) {
        double base = r.distance * 6;

        if (r.luggage) base += 1000;
        if (r.childDiscount) base *= 0.7;
        if (r.pensionerDiscount) base *= 0.8;

        return base * r.passengers;
    }
}
