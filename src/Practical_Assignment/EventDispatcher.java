package Practical_Assignment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EventDispatcher {

    private List<TimeObserver> timeObservers;
    private List<MotionObserver> motionObservers;
    private List<TemperatureObserver> temperatureObservers;

    public EventDispatcher() {
        this.motionObservers = new ArrayList<>();
        this.temperatureObservers = new ArrayList<>();
        this.timeObservers = new ArrayList<>();
    }

    public void register(TemperatureObserver temperatureObserver) {
        temperatureObservers.add(temperatureObserver);
    }

    public void register(TimeObserver timeObserver) {
        timeObservers.add(timeObserver);
    }

    public void register(MotionObserver motionObserver) {
        motionObservers.add(motionObserver);
    }

    public void updateTime(LocalDateTime time) {
        for (TimeObserver observer : timeObservers) {
            observer.updateTime(time);
        }
    }

    public void updateMotion(String location) {
        for (MotionObserver observer : motionObservers) {
            observer.updateMotion(location);
        }
    }

    public void updateTemp(double temp) {
        for (TemperatureObserver observer : temperatureObservers) {
            observer.updateTemp(temp);
        }
    }

    public List<TimeObserver> getTimeObservers() {
        return timeObservers;
    }

    public List<MotionObserver> getMotionObservers() {
        return motionObservers;
    }

    public List<TemperatureObserver> getTemperatureObservers() {
        return temperatureObservers;
    }
}
