package factorymethod;

import factory.Enemy;

public class Mage implements Enemy {

    @Override
    public void attack() {
        System.out.println("Mage attacks with a spell!");
    }
}
