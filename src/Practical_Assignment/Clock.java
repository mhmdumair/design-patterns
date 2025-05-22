package Practical_Assignment;

import java.time.LocalDateTime;

public class Clock implements Sensor{

    private LocalDateTime time;
    private EventDispatcher eventDispatcher;


    @Override
    public void detect() {

    }

    @Override
    public String getType() {
        return null;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public EventDispatcher getEventDispatcher() {
        return eventDispatcher;
    }

    public void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.eventDispatcher = eventDispatcher;
    }
}
