package flyweight.assets;

import java.util.ArrayList;
import java.util.List;

public class Prefab {

    private static int id = 1;
    private String name;
    private List<Animation> animation = new ArrayList<>();
    private List<Texture> textures = new ArrayList<>();
    private List<Sound> sounds = new ArrayList<>();

    public Prefab(List<Animation> animation, List<Texture> textures, List<Sound> sounds) {
        this.name = "Prefab" + id ;
        this.animation = animation;
        this.textures = textures;
        this.sounds = sounds;
        id++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "name=" + name + '\n' +
                "animation=" + animation + '\n' +
                "textures=" + textures + '\n' +
                "sounds=" + sounds
                ;
    }
}
