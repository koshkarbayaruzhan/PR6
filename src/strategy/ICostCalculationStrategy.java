package org.example.strategy;

import org.example.strategy.model.TripRequest;

public interface ICostCalculationStrategy {
    double calculate(TripRequest request);
}
