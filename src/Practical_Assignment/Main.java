package Practical_Assignment;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        EventDispatcher dispatcher = new EventDispatcher();

        // Create sensors
        Clock clock = new Clock();
        clock.setEventDispatcher(dispatcher);

        MotionSensor motionSensor = new MotionSensor("Living Room");
        motionSensor.setEventDispatcher(dispatcher);

        TemperatureSensor temperatureSensor = new TemperatureSensor();
        temperatureSensor.setEventDispatcher(dispatcher);

        DeviceFactory factory = new DeviceFactory();

        SmartLight light = (SmartLight) factory.createDevice("light","Living Room");
        light.setType("SmartLight");

        Alarm alarm = (Alarm) factory.createDevice("alarm","Living Room");
        alarm.setType("Alarm");

        SecurityCamara camara = (SecurityCamara) factory.createDevice("camara","Living Room");
        camara.setType("SecurityCamara");

        Thermostats thermostat = (Thermostats) factory.createDevice("thermostat","Living Room");
        thermostat.setType("Thermostats");

        CentralController controller = CentralController.getInstance();
        controller.setEventDispatcher(dispatcher);

        controller.register(light);
        controller.register(alarm);
        controller.register(camara);
        controller.register(thermostat);

        System.out.println("\n--- Simulating Sensor Inputs ---");
        System.out.println("___________________________________________");
        System.out.println("Time changes");

        Event lightEvent = new Event();
        lightEvent.setStartTime(LocalDateTime.now().minusMinutes(5));
        lightEvent.setEndTime(LocalDateTime.now().plusMinutes(30));
        lightEvent.setDescription("Evening Light On");
        light.addEvent(lightEvent);

        Event alarmEvent = new Event();
        alarmEvent.setStartTime(LocalDateTime.now().minusMinutes(1));
        alarmEvent.setEndTime(LocalDateTime.now().plusMinutes(10));
        alarmEvent.setDescription("Security Check");
        alarm.addEvent(alarmEvent);

        Event camEvent = new Event();
        camEvent.setStartTime(LocalDateTime.now().minusMinutes(1));
        camEvent.setEndTime(LocalDateTime.now().plusMinutes(20));
        camEvent.setDescription("Record Motion");
        camara.onRecording();
        camara.addEvent(camEvent);
        clock.detect();

        System.out.println("___________________________________________");
        System.out.println("Motion changes");
        motionSensor.detect();

        System.out.println("___________________________________________");
        System.out.println("Temperature changes");
        temperatureSensor.setTemp(32);

        System.out.println("\n--- Applying Security Mode ---");
        controller.applyMode("security");

    }
}

