package org.example.strategy.model;

public class TripRequest {

    public double distance;
    public ServiceClass serviceClass;
    public int passengers;
    public boolean childDiscount;
    public boolean pensionerDiscount;
    public boolean luggage;

    public TripRequest(double distance,
                       ServiceClass serviceClass,
                       int passengers,
                       boolean childDiscount,
                       boolean pensionerDiscount,
                       boolean luggage) {

        this.distance = distance;
        this.serviceClass = serviceClass;
        this.passengers = passengers;
        this.childDiscount = childDiscount;
        this.pensionerDiscount = pensionerDiscount;
        this.luggage = luggage;
    }
}
