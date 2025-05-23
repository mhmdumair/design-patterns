package Practical_Assignment;

public class TemperatureSensor implements Sensor {

    private int temp;
    private EventDispatcher eventDispatcher;

    @Override
    public void detect() {
        if (eventDispatcher != null) {
            eventDispatcher.updateTemp(temp);
        }
    }

    @Override
    public String getType() {
        return "TemperatureSensor";
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
        if (eventDispatcher != null) {
            eventDispatcher.updateTemp(temp);
        }
    }

    public EventDispatcher getEventDispatcher() {
        return eventDispatcher;
    }

    public void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.eventDispatcher = eventDispatcher;
    }
}
