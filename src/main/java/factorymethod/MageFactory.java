package factorymethod;

import factory.Enemy;
import factory.Mage;

public class MageFactory extends EnemyFactory{

    @Override
    public Enemy createEnemy() {
        return new Mage();
    }
}
