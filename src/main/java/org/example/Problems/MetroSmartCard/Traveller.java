package org.example.Problems.MetroSmartCard;

import java.time.LocalDateTime;

class Traveller {
    Traveller(long id, String name) {
        this.id = id;
        this.name = name;
    }

    long id;
    String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class SmartCard {
    long id;
    double balance;
    Traveller traveller;

    public long getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Traveller getTraveller() {
        return traveller;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTraveller(Traveller traveller) {
        this.traveller = traveller;
    }
}

enum Stations {
    A1, A2, A3, A4, A5, A6, A7, A8, A9, A10;

    public int getDistance(Stations other) {
        return Math.abs(other.ordinal() - this.ordinal());
    }
}

class CardTrx {

    long id;
    SmartCard smartCard;
    Stations source;
    Stations destination;

    int distance;

    LocalDateTime startTime;
    LocalDateTime endTime;

    double balance;
    double fare;
    FareStrategy fareStrategy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public SmartCard getSmartCard() {
        return smartCard;
    }

    public void setSmartCard(SmartCard smartCard) {
        this.smartCard = smartCard;
    }

    public Stations getSource() {
        return source;
    }

    public void setSource(Stations source) {
        this.source = source;
    }

    public Stations getDestination() {
        return destination;
    }

    public void setDestination(Stations destination) {
        this.destination = destination;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public FareStrategy getFareStrategy() {
        return fareStrategy;
    }

    public void setFareStrategy(FareStrategy fareStrategy) {
        this.fareStrategy = fareStrategy;
    }
}