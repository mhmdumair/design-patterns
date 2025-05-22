package Practical_Assignment;

import java.time.LocalDateTime;

public class SecurityCamara implements Device,TimeObserver,MotionObserver{

    private String type;
    private String location;
    private boolean isOn;
    private boolean isRecording;
    private boolean isCamaraLightOn;


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
    public void updateTime(LocalDateTime time) {

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
    }
    public void offRecording() {
        isRecording = false;
    }

    public boolean isCamaraLightOn() {
        return isCamaraLightOn;
    }

    public void onCamaraLightOn() {
        isCamaraLightOn = true;
    }
    public void offCamaraLightOn() {
        isCamaraLightOn = false;
    }
}
