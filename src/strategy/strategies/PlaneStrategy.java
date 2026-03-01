package org.example.strategy.strategies;

import org.example.strategy.ICostCalculationStrategy;
import org.example.strategy.model.*;

public class PlaneStrategy implements ICostCalculationStrategy {

    @Override
    public double calculate(TripRequest r) {
        double base = r.distance * 25;

        if (r.serviceClass == ServiceClass.BUSINESS) base *= 1.6;
        if (r.luggage) base += 5000;
        if (r.childDiscount) base *= 0.5;
        if (r.pensionerDiscount) base *= 0.7;

        return base * r.passengers;
    }
}
