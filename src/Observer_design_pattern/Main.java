package Observer_design_pattern;

//when one object (the subject) changes state,
// all its dependents (observers) are automatically notified and updated.
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(new Phone());
        weatherStation.addObserver(new Laptop());

        weatherStation.notifyObserver();
        weatherStation.setTemperature(30.1f);

    }
}
