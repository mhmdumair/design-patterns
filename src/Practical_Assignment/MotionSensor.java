package Practical_Assignment;

public class MotionSensor implements Sensor {

    private boolean isSensed;
    private String location;
    private EventDispatcher eventDispatcher;

    public MotionSensor(String location) {
        this.location = location;
    }

    @Override
    public void detect() {
        if (eventDispatcher != null) {
            eventDispatcher.updateMotion(location);
        }
    }

    @Override
    public String getType() {
        return "MotionSensor";
    }

    public boolean isSensed() {
        return isSensed;
    }

    public void setSensed(boolean sensed) {
        this.isSensed = sensed;
        if (eventDispatcher != null) {
            eventDispatcher.updateMotion(location);
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public EventDispatcher getEventDispatcher() {
        return eventDispatcher;
    }

    public void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.eventDispatcher = eventDispatcher;
    }
}
