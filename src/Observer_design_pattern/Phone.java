package Observer_design_pattern;

public class Phone implements Observer{

    @Override
    public void update(float temperature) {
        System.out.println(String.format("Phone : %f",temperature));
    }
}
