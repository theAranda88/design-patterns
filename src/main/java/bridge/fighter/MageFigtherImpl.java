package bridge.fighter;

public class MageFigtherImpl implements Fighter{
    @Override
    public void attack() {
        System.out.println("Mage attack!");
    }

    @Override
    public void protect() {
        System.out.println("Mage protect!");
    }
}
