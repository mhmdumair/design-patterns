package Observer_design_pattern;

public class Laptop implements Observer{
    @Override
    public void update(float temperature) {
        System.out.println(String.format("Laptop : %f",temperature));
    }
}
