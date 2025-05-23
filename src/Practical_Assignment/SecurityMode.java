package Practical_Assignment;

import java.util.List;

public class SecurityMode implements Mode {

    @Override
    public void apply(List<Device> devices) {
        for (Device device : devices) {
            if (device instanceof SecurityCamara cam) {
                cam.onRecording();
            }
        }
    }
}
