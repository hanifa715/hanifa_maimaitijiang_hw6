public class Weapon {
    private String weaponType;
    private String weaponName;
    public Weapon(String weaponType,String weaponName) {
        this.weaponType = weaponType;
        this.weaponName = weaponName;
    }
    public String getWeaponType() {
        return weaponType;
    }
    public String getWeaponName() {
        return weaponName;
    }
    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }
    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

}
