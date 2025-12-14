package abstractfactory.factory;

import abstractfactory.armor.Armor;
import abstractfactory.weapon.Weapon;
import factory.Enemy;

public abstract class EnemyAbstractFactory {

    public abstract Enemy createEnemy();
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}
