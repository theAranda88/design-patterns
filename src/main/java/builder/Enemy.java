package builder;

public class Enemy {

    private String name;
    private String type;
    private int health;
    private int damage;
    private int endurace;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getEndurace() {
        return endurace;
    }

    public void setEndurace(int endurace) {
        this.endurace = endurace;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                ", endurace=" + endurace +
                '}';
    }

    public static EnemyBuilder builder() {
        return new EnemyBuilder();
    }
}
