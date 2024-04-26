package com.example.soonami;

public class Event {

    protected String title;
    protected long time;
    protected int tsunamiAlert;

    public Event(String title, long time, int tsunamiAlert) {
        this.title = title;
        this.time = time;
        this.tsunamiAlert = tsunamiAlert;
    }
}
