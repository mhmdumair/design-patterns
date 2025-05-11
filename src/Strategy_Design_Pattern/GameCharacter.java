package Strategy_Design_Pattern;

public class GameCharacter {

    private AttackStrategy attackStrategy;

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void attack(){
        attackStrategy.attack();
    }
}
