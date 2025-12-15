package bridge.enemy;

import bridge.fighter.Fighter;
import bridge.fighter.WarriorFigtherImpl;

public class Warrior extends Enemy {

    public Warrior() {
        setFighter(new WarriorFigtherImpl());
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
        System.out.println("Warrior: ");
        getFighter().attack();
    }

    public void protect() {
        System.out.println("Warrior: ");
        getFighter().protect();
    }
}
