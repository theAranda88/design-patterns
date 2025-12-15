package decorator.decorator;

import decorator.Enemy;

public class AssasinEnemyDecorator extends EnemyDecorator{

    public AssasinEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Assasin Attack!!");
    }
}
