package Practical_Assignment;

import java.util.List;

public class EnergySavingMode implements Mode {

    @Override
    public void apply(List<Device> devices) {
        for (Device device : devices) {
            if (device instanceof SmartLight light) {
                light.dimLight();
            } else if (device instanceof Thermostats thermostat) {
                thermostat.setTemperature(25);
            }
        }
    }
}
