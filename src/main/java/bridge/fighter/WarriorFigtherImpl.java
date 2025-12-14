package bridge.fighter;

public class WarriorFigtherImpl implements Fighter{

    @Override
    public void attack() {
        System.out.println("Warrior attack!");
    }

    @Override
    public void protect() {
        System.out.println("Warrior protect!");
    }
}
