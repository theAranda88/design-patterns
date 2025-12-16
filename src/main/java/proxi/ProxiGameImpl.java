package proxi;

import java.sql.Date;

public class ProxiGameImpl implements Game{

    private  Stats stats;
    private  GameImpl gameImpl;

    public ProxiGameImpl(GameImpl gameImpl) {
        this.gameImpl = gameImpl;
    }

    public Stats getStats() {
        return stats;
    }

    public ProxiGameImpl setStats(Stats stats) {
        this.stats = stats;
        return this;
    }

    public GameImpl getGameImpl() {
        return gameImpl;
    }

    public ProxiGameImpl setGameImpl(GameImpl gameImpl) {
        this.gameImpl = gameImpl;
        return this;
    }

    @Override
    public void save(String name) {
        stats.setLastSave(new Date(System.currentTimeMillis()));
        gameImpl.setStats(stats);
        gameImpl.save(name);
    }

    @Override
    public Stats load(String name) {
        Stats stats = gameImpl.load(name);
        setStats(stats);
        return stats;
    }
}
