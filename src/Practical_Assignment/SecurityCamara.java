package Practical_Assignment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SecurityCamara implements Device, TimeObserver, MotionObserver {

    private String type;
    private String location;
    private boolean isOn;
    private boolean isRecording;
    private boolean isCamaraLightOn;
    private List<Event> events = new ArrayList<>();

    public SecurityCamara(String location) {
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
    public void updateMotion(String motionLocation) {
        if (this.location != null && this.location.equalsIgnoreCase(motionLocation)) {
            onCamaraLightOn();
        }
    }

    @Override
    public void updateTime(LocalDateTime time) {
        boolean inEvent = false;
        for (Event event : events) {
            if (!time.isBefore(event.getStartTime()) && !time.isAfter(event.getEndTime())) {
                inEvent = true;
                break;
            }
        }

        if (inEvent) {
            onRecording();
        } else {
            offRecording();
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

    public void on() {
        isOn = true;
    }

    public void off() {
        isOn = false;
    }

    public boolean isRecording() {
        return isRecording;
    }

    public void onRecording() {
        isRecording = true;
        System.out.println("Security Camera recording at " + location);
    }

    public void offRecording() {
        isRecording = false;
    }

    public boolean isCamaraLightOn() {
        return isCamaraLightOn;
    }

    public void onCamaraLightOn() {
        isCamaraLightOn = true;
        System.out.println("Camera light ON at " + location);
    }

    public void offCamaraLightOn() {
        isCamaraLightOn = false;
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void removeEvent(Event event) {
        events.remove(event);
    }
}
