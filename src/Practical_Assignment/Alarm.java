package Practical_Assignment;

import java.time.LocalDateTime;

public class Alarm implements Device,MotionObserver,TimeObserver,TemperatureObserver{

    private String type;
    private String location;
    private boolean isAlarmOn;

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public void updateMotion(boolean motion) {

    }

    @Override
    public void updateTemp(double temp) {

    }

    @Override
    public void updateTime(LocalDateTime time) {

    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isAlarmOn() {
        return isAlarmOn;
    }

    public void on() {
        isAlarmOn = true;
    }

    public void off() {
        isAlarmOn = false;
    }
}
