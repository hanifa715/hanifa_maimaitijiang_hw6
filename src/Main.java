public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(400);
        boss.setDamage(50);
        boss.setWeapon(WeaponType.GUN);

        System.out.println(boss.info());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(100);
        skeleton.setDamage(40);
        skeleton.setWeapon(WeaponType.KNIFE);
        skeleton.setNumberOfArrows(50);

        System.out.println(skeleton.info());

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(120);
        skeleton2.setDamage(20);
        skeleton2.setWeapon(WeaponType.KNIFE);
        skeleton2.setNumberOfArrows(20);

        System.out.println(skeleton2.info());
    }
}

