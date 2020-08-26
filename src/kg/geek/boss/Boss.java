package kg.geek.boss;

public class Boss extends GameEntity {
    private Weapon weapon;



    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.println("Boss health:" + getHealth() + "\n Boss:" + getGamage()
                + "Weapon name:" + getWeapon().getNameOfWeapon()
                +"\n Weapon type:" + getWeapon().getTypeOfWeapon());
    }
}
