package decorator.decorator;

import decorator.Enemy;
import decorator.race.Elf;
import decorator.race.Human;

public class Tetsdecorator {
    public static void main(String[] args) {

        System.out.println("=======HUMAN WARRIOR=============");
        Enemy humanWarrior = new WarriorEnemyDecorator(new Human());
        humanWarrior.attack();

        System.out.println("=======HUMAN WARRIOR MAGE=============");
        Enemy humanWarriorMage = new WarriorEnemyDecorator(new MageEnemyDecorator(new Human()));
        humanWarriorMage.attack();

        System.out.println("=======ELF WARRIOR MAGE ASSASIN =============");
        Enemy elfWarriorMageAssasin = new AssasinEnemyDecorator(
                new MageEnemyDecorator(
                        new WarriorEnemyDecorator(
                                new Elf()
                        )
                )
        );
        elfWarriorMageAssasin.attack();
    }
}
