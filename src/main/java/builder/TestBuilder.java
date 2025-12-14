package builder;

public class TestBuilder {

    public static void main(String[] args) {

        Enemy enemy = Enemy.builder()
                .name("Gandalf")
                .type("mago")
                .health(10)
                .damage(2)
                .endurace(5)
                .build();
        System.out.println(enemy);
    }
}
