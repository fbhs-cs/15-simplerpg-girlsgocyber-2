public class Weapon {
    private int dmg; //dmg weapon can do
    private String dmgType; //
    private String WEAPON_TYPE;
    private double crit;

    /**
     * Constructs a Weapon object
     * @param dmg - amount of (potential) damage
     * @param dmgType - type of damage weapon deals
     * @param crit - chance of landing a critical hit
     */
    public Weapon(int dmg, String dmgType, double crit) {
        this.dmg = dmg;
        this.dmgType = dmgType;
        this.crit = crit;
        WEAPON_TYPE = "Weapon";
    }

    /**
     * Determines the damage dealt by rolling damage then seeing if the
     * attack crit, then checking if enemy is weak.
     * Base damage does 50% - 100% of dmg. If enemy is weak or attack
     * crit double where needed.
     * @param target
     * @return dmg output based on enemy weakness and crit chance.
     */
    public int attack(Character target) {
        int tempDmg = dmg;
        tempDmg *= Math.random()/2 + .5;
        if (target.isWeakTo(dmgType)) {
            tempDmg *= 2;
        }
        double critRoll = Math.random();
        if (critRoll < crit) {
            tempDmg *= 2;
        }
        return tempDmg;
    }

    /**
     * returns WEAPON_TYPE
     * @return WEAPON_TYPE
     */
    public String getWeaponType() {
        return WEAPON_TYPE;
    }

    /**
     * returns weapons damage type
     * @return dmgType
     */
    public String getDmgType() {
        return dmgType;
    }

    /**
     * returns damage of the weapon
     * @return dmg
     */
    public int getDmg() {
        return dmg;
    }

    /**
     * returns crit chance
     * @return crit
     */
    public double getCrit() {
        return crit;
    }

    
    /**
     * returns weapons type, amount of damage, and damage type
     */
    public String toString() {
        return WEAPON_TYPE + ": " + dmg + " " + dmgType;
    }



}