public class Sword extends Weapon {
    public Sword(int dmg, double crit) {
        super(dmg, "Slashing", crit);
        WEAPON_TYPE = "Sword";
    }
}