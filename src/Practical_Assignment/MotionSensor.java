package Practical_Assignment;

public class MotionSensor implements Sensor{

    private boolean isSensed ;
    private String location;
    private EventDispatcher eventDispatcher;


    @Override
    public void detect() {

    }

    @Override
    public String getType() {
        return null;
    }

    public boolean isSensed() {
        return isSensed;
    }

    public void setSensed(boolean sensed) {
        isSensed = sensed;
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
