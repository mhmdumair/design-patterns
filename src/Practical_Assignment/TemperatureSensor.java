package Practical_Assignment;

public class TemperatureSensor implements Sensor{
    private int temp;
    private EventDispatcher eventDispatcher;

    @Override
    public void detect() {

    }

    @Override
    public String getType() {
        return null;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public EventDispatcher getEventDispatcher() {
        return eventDispatcher;
    }

    public void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.eventDispatcher = eventDispatcher;
    }
}
