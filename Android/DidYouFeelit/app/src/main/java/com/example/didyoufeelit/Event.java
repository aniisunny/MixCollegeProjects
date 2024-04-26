package com.example.didyoufeelit;

public class Event {

    protected String title;
    protected String magnitude;
    protected String numberOfPeople;

    public Event(String title, String magnitude, String numberOfPeople) {
        this.title = title;
        this.magnitude = magnitude;
        this.numberOfPeople = numberOfPeople;
    }
}
