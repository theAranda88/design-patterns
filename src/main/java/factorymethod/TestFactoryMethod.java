package factorymethod;

import factory.Enemy;

public class TestFactoryMethod {

    public static void main(String[] args) {

        Enemy warrior = new WarriorFactory().createEnemy();
        Enemy mage = new MageFactory().createEnemy();
        warrior.attack();
        mage.attack();
    }
}
//define una interfaz o clase abstracta con un metodo para crear objetos, delegando la creacion a subclases
//es mas flexible, ya que permite extender nuevas fábricas sin modificar el codigo existente.
//promueve el principio de "cerrado para modificación, abierto para extensión".
