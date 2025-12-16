package flyweight;

public class Coordinates {

    private int posX, posY, posZ;

    public static Coordinates getCoordinates() {
        return new Coordinates();
    }

    @Override
    public String toString() {
        return "posX=" + posX +
                "posY=" + posY +
                "posZ=" + posZ;
    }
}
