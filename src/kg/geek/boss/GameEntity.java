package kg.geek.boss;

public class GameEntity {
    private int health;
    private int gamage;



    public GameEntity(int health, int gamage) {
        this.health = health;
        this.gamage = gamage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getGamage() {
        return gamage;
    }

    public void setGamage(int gamage) {
        this.gamage = gamage;
    }
}
