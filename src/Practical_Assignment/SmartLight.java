package Practical_Assignment;

import java.time.LocalDateTime;

public class SmartLight implements Device,TimeObserver,MotionObserver{
    private String type;
    private boolean isOn;
    private String location;
    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public void updateTime(LocalDateTime time) {

    }

    @Override
    public void updateMotion(boolean motion) {

    }

    public void setType(String type) {
        this.type = type;
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

    public void setLocation(String location) {
        this.location = location;
    }
}
