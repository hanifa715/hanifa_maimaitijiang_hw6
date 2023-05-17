public class GameEntity {
    private int health;
    private int damage;
    private WeaponType weapon;

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

    public WeaponType getWeaponType() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public String info(){
        return "Boss health: " + this.health + " " + "Boss damage: " + this.damage + " " + "Boss weapon: " + this.weapon;
    }
}
