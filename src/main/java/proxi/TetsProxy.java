package proxi;

public class TetsProxy{
    public static void main(String[] args) {
        GameImpl gameImpl = new GameImpl();
        gameImpl.newGame("player1");
        ProxiGameImpl proxiGame = new ProxiGameImpl(gameImpl);
        proxiGame.load("player1");
        System.out.println(proxiGame.getStats());
        proxiGame.getStats().setKills(10);
        proxiGame.getStats().setDeaths(2);
        proxiGame.getStats().setLevel(10);
        proxiGame.save("player1");
        proxiGame.load("player1");
        System.out.println(proxiGame.getStats());
    }
}
