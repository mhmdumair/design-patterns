package Practical_Assignment;

import java.util.List;

public class VacationMode implements Mode {

    @Override
    public void apply(List<Device> devices) {
        for (Device device : devices) {
            if (device instanceof SmartLight light) {
                light.off();
            } else if (device instanceof SecurityCamara cam) {
                cam.onRecording();
            } else if (device instanceof Alarm alarm) {
                alarm.off();
            }
        }
    }
}
