package Template_Design_Pattern;

public abstract class Beverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    public void boilWater(){
        System.out.println("Boiling Water");
    }
    public void pourInCup(){
        System.out.println("Poured into Cup");
    }
    abstract void brew();
    abstract void addCondiments();
}
