package abstractfactory.factory;

import abstractfactory.armor.Armor;
import abstractfactory.armor.HeavyArmor;
import abstractfactory.armor.Robe;
import abstractfactory.weapon.Axe;
import abstractfactory.weapon.Weapon;
import abstractfactory.weapon.WizardStaff;
import factory.Enemy;
import factory.Mage;

public class MageFactory extends EnemyAbstractFactory{


    @Override
    public Enemy createEnemy() {
        return new Mage();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }

    @Override
    public Weapon createWeapon() {
        return new WizardStaff();
    }
}
