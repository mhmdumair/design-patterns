package Strategy_Design_Pattern;

public class BowAttack implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Attack with Bow");
    }
}
