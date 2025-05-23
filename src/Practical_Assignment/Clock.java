package Practical_Assignment;

import java.time.LocalDateTime;

public class Clock implements Sensor {

    private LocalDateTime time;
    private EventDispatcher eventDispatcher;

    @Override
    public void detect() {
        setTime(LocalDateTime.now()); // this will notify the dispatcher
    }

    @Override
    public String getType() {
        return "Clock";
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
        if (eventDispatcher != null) {
            eventDispatcher.updateTime(time);
        }
    }

    public EventDispatcher getEventDispatcher() {
        return eventDispatcher;
    }

    public void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.eventDispatcher = eventDispatcher;
    }
}
