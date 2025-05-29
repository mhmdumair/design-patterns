package Practical_Assignment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SmartLight implements Device, TimeObserver, MotionObserver {
    private String type;
    private boolean isOn;
    private String location;

    private List<Event> events = new ArrayList<>();

    public SmartLight(String location) {
        this.location = location;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public void updateTime(LocalDateTime time) {
        boolean inEventTime = false;

        for (Event event : events) {
            if (!time.isBefore(event.getStartTime()) && !time.isAfter(event.getEndTime())) {
                inEventTime = true;
                on();
                System.out.println("Event: " + event.getDescription());
                break;
            }
        }

        if (!inEventTime) {
            off();
        }
    }


    @Override
    public void updateMotion(String detectedLocation) {
        if (this.location != null && this.location.equalsIgnoreCase(detectedLocation)) {
            on();
        }
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isOn() {
        return isOn;
    }

    public void on() {
        isOn = true;
        System.out.println("Light ON at " + location);
    }

    public void off() {
        isOn = false;
        System.out.println("Light OFF at " + location);
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void removeEvent(Event event) {
        events.remove(event);
    }

    public void dimLight(){
        isOn = true;
        System.out.println("Lights dimmed at "+location);
    }
}
