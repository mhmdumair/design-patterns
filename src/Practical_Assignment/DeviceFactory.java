package Practical_Assignment;

public class DeviceFactory {

    public Device createDevice(String device,String location) {
        if (device == null) return null;

        switch (device.toLowerCase()) {
            case "light":
                return new SmartLight(location);
            case "camara":
                return new SecurityCamara(location);
            case "alarm":
                return new Alarm(location);
            case "thermostat":
                return new Thermostats(location);
            default:
                System.out.println("Unknown device type: " + device);
                return null;
        }
    }
}
