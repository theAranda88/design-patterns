package factory;

public class TestFactory {

    public static void main(String[] args) {
        EnemyFactory enemyFactory = new EnemyFactory();

        Enemy warrior = enemyFactory.createEnemy("warrior");
        warrior.attack();  // Output: Warrior attack!

        Enemy mage = enemyFactory.createEnemy("mage");
        mage.attack();     // Output: Mage attack!
    }
}
//patrón que crea mecanismo para instanciar o crear obj de una clase padre,
//lo q permite alterar el tipo de objeto creado