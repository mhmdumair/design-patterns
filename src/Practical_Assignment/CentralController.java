package Practical_Assignment;

import java.util.ArrayList;
import java.util.List;

public class CentralController {
    private static CentralController instance;
    private String mode;
    private List<Device> devices;
    private EventDispatcher eventDispatcher;

    private CentralController() {
        this.devices = new ArrayList<>();
    }

    public static CentralController getInstance() {
        if (instance == null) {
            instance = new CentralController();
        }
        return instance;
    }

    public void register(Device device) {
        devices.add(device);

        if (eventDispatcher == null) {
            System.out.println("EventDispatcher is not set.");
            return;
        }

        if (device instanceof SmartLight light) {
            eventDispatcher.register((TimeObserver) light);
            eventDispatcher.register((MotionObserver) light);
        }

        if (device instanceof Alarm alarm) {
            eventDispatcher.register((TimeObserver) alarm);
            eventDispatcher.register((MotionObserver) alarm);
            eventDispatcher.register((TemperatureObserver) alarm);
        }

        if (device instanceof Thermostats thermostat) {
            eventDispatcher.register((TemperatureObserver) thermostat);
        }
    }

    public void setMode(Mode mode) {
        mode.apply(devices);
    }

    public void applyMode(String mode) {
        this.mode = mode.toLowerCase();

        switch (this.mode) {
            case "energysaving":
                setMode(new EnergySavingMode());
                break;
            case "security":
                setMode(new SecurityMode());
                break;
            case "vacation":
                setMode(new VacationMode());
                break;
            default:
                System.out.println("Invalid mode selected: " + mode);
                break;
        }
    }

    public String getMode() {
        return mode;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public EventDispatcher getEventDispatcher() {
        return eventDispatcher;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.eventDispatcher = eventDispatcher;
    }
}
