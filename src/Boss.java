public class Boss extends GameEntity {
    private Weapon bossweapon;

    public Weapon getBossWeapon() {

        return bossweapon;
    }

    public void setBossWeapon(Weapon bossweapon) {

        this.bossweapon = bossweapon;
    }
    public String printInfo() {

        return super.info();
    }
}
