package factory;

public class TestFactory {

    public static void main(String[] args) {
        EnemyFactory enemyFactory = new EnemyFactory();

        Enemy warrior = enemyFactory.createEnemy("warrior");
        warrior.attack();  // Output: Warrior attacks with a sword!

        Enemy mage = enemyFactory.createEnemy("mage");
        mage.attack();     // Output: Mage attacks with a spell!
    }
}
