public class Weapon {
    private int dmg;
    private String dmgType;
    private String WEAPON_TYPE;
    private double crit;

    public Weapon(int dmg, String dmgType, double crit) {
        this.dmg = dmg;
        this.dmgType = dmgType;
        this.crit = crit;
        WEAPON_TYPE = "Weapon";
    }

    public int attack(Character target) {
        int tempDmg = dmg;
        tempDmg *= Math.random()/2 + .5;
        for(String weakness : target.weakness) {
            if (weakness.equals(dmgType)) {
                return tempDmg*2;
            }
        }
        double critRoll = Math.random();
        if (critRoll < crit) {
            tempDmg *= 2;
        }
        return dmg;
    }

    public String getWeaponType() {
        return WEAPON_TYPE;
    }

    public String getDmgType() {
        return dmgType;
    }

    public int getDmg() {
        return dmg;
    }

    public double getCrit() {
        return crit;
    }



}