package Practical_Assignment;

public class Thermostats implements Device,TemperatureObserver{
    private String type;
    private String location;
    private boolean isOn;
    private double temperature;

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public void updateTemp(double temp) {

    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isOn() {
        return isOn;
    }

    public void On() {
        isOn = true;
    }

    public void Off() {
        isOn = false;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
