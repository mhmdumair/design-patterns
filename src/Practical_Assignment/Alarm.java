package Practical_Assignment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Alarm implements Device, MotionObserver, TimeObserver, TemperatureObserver {

    private String type;
    private String location;
    private boolean isAlarmOn;
    private List<Event> events = new ArrayList<>();

    public Alarm(String location) {
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
    public void updateMotion(String motionLocation) {
        if (this.location.equalsIgnoreCase(motionLocation)) {
            on();
        }
    }

    @Override
    public void updateTemp(double temp) {
        if (temp > 35) {
            on();
        }
    }

    @Override
    public void updateTime(LocalDateTime time) {

        for (Event event : events) {
            if (!time.isBefore(event.getStartTime()) && !time.isAfter(event.getEndTime())) {
                on();
                System.out.println("Event: " + event.getDescription());
                break;
            }
        }
    }


    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isAlarmOn() {
        return isAlarmOn;
    }

    public void on() {
        if (!isAlarmOn) {
            isAlarmOn = true;
            System.out.println("Alarm ON at " + location);
        }
    }

    public void off() {
        isAlarmOn = false;
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void removeEvent(Event event) {
        events.remove(event);
    }
}
