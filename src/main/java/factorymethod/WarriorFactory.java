package factorymethod;

import factory.Enemy;
import factory.Warrior;

public class WarriorFactory extends EnemyFactory{

    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }
}
