package flyweight;

import flyweight.assets.Prefab;

public class Npc {

    private static final int MAX_HEALTH = 100;
    private static int id = 1;
    private String name;
    private int health;
    private Coordinates coordinates;
    private Prefab prefab;

    public Npc(Prefab prefabNew) {
        this.name = "NPC" + id;
        this.health = MAX_HEALTH;
        this.coordinates = Coordinates.getCoordinates();
        this.prefab = prefabNew;
        id++;
    }

    public  void  showNpc () {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println(coordinates);
        System.out.println("=== Prefab ===");
        System.out.println(prefab);
    }
}
