package bridge.enemy;

import bridge.fighter.Fighter;
import bridge.fighter.MageFigtherImpl;

public class Mage extends Enemy {

    public Mage() {
        setFighter(new MageFigtherImpl());
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public Fighter getFighter() {
        return super.getFighter();
    }

    @Override
    public Enemy setFighter(Fighter fighter) {
        return super.setFighter(fighter);
    }

    public void attack() {
        System.out.println("Mage: ");
        getFighter().attack();
    }

    public void protect() {
        System.out.println("Mage: ");
        getFighter().protect();
    }


}
