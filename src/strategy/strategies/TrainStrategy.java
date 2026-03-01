package org.example.strategy.strategies;

import org.example.strategy.ICostCalculationStrategy;
import org.example.strategy.model.*;

public class TrainStrategy implements ICostCalculationStrategy {

    @Override
    public double calculate(TripRequest r) {
        double base = r.distance * 12;

        if (r.serviceClass == ServiceClass.BUSINESS) base *= 1.3;
        if (r.luggage) base += 2000;
        if (r.childDiscount) base *= 0.6;
        if (r.pensionerDiscount) base *= 0.75;

        return base * r.passengers;
    }
}
