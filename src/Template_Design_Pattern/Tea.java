package Template_Design_Pattern;

public class Tea extends Beverage{

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Pour milk and sugar");
    }
}
