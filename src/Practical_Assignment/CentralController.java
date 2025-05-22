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

    public void register(Device device){

    }

    public void applyMode(String mode){

    }

    public void setMode(Mode mode){

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
}

