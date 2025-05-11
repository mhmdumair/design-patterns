package Strategy_Design_Pattern;

//It helps you change the behavior (strategy)
// of an object at runtime without modifying its code
public class Main {
    public static void main(String[] args) {
        GameCharacter hero = new GameCharacter();
        hero.setAttackStrategy(new SwordAttack());
        hero.attack();

        hero.setAttackStrategy(new BowAttack());
        hero.attack();


    }
}
