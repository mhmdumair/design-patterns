package Template_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        System.out.println("Preparing Tea");
        tea.prepareRecipe();
        System.out.println();

        Beverage coffee = new Coffee();
        System.out.println("Preparing Coffee");
        coffee.prepareRecipe();

    }
}
