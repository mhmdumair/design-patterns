package Practical_Assignment;

public class Thermostats implements Device, TemperatureObserver {

    private String type;
    private String location;
    private boolean isOn;
    private double temperature;

    public Thermostats(String location) {
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
    public void updateTemp(double temp) {
        if (temp > 30) {
            On();
            setTemperature(22);
            System.out.println("Thermostat ON at " + location + " | Cooling to 22°C");
        }
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
