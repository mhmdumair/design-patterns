package Practical_Assignment;

public class TemperatureSensor implements Sensor {

    private double temp;
    private EventDispatcher eventDispatcher;

    @Override
    public void detect() {
        if (eventDispatcher != null) {
            this.setTemp(temp);
        }
    }

    @Override
    public String getType() {
        return "TemperatureSensor";
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
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
