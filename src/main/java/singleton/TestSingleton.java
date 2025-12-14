package singleton;

public class TestSingleton {

    public static void main(String[] args) {
        Player player1 = Player.getInstance("Gandalf");
        Player player2 = Player.getInstance("Auron");
        System.out.println("player1 == player2: " + (player1 == player2));
        System.out.println(player1);
        System.out.println(player2);
    }
}
