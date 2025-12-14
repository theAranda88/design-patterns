package factorymethod;

import factory.Enemy;

public class Warrior implements Enemy {

    @Override
    public void attack() {
        System.out.println("Warrior attacks with a sword!");
    }
}
