package bridge.fighter;

import bridge.enemy.Mage;
import bridge.enemy.Warrior;

public class TestBridge {
    public static void main(String[] args) {
        System.out.println("=============WARRIOR FIGHTER==============");
        Warrior warrior = new Warrior();
        warrior.attack();
        warrior.protect();
        warrior.setFighter(new MageFigtherImpl());
        warrior.attack();
        warrior.protect();

        System.out.println("=============MAGE FIGHTER==============");
        Mage mage = new Mage();
        mage.attack();
        mage.protect();
        mage.setFighter(new WarriorFigtherImpl());
        mage.attack();
        mage.protect();
    }
}
