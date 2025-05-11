package Strategy_Design_Pattern;

public class SwordAttack implements AttackStrategy{

    @Override
    public void attack() {
        System.out.println("Attack with sword");
    }
}
