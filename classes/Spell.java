public abstract class Spell {
    protected int dmg;
    protected String dmgType;
    protected int manaReq;
    protected String name;

    
    public Spell(int damage, String damageType, int manaToCast, String spellName) {
        dmg = damage;
        dmgType = damageType;
        manaReq = manaToCast;
        name = spellName;
    }

    
    /** 
     * Returns the amount of damage the base spell 
     * deals
     * 
     * @return int
     */
    public int getDmg() {
        return dmg;
    }

    
    /** 
     * Returns the type of damage the spell deals
     * 
     * @return String
     */
    public String getDmgType() {
        return dmgType;
    }

    
    /** 
     * Returns the amount of mana required by the spell
     * 
     * @return int
     */
    public int getManaReq() {
        return manaReq;
    }

    
    
    /** 
     * Returns the spell's name
     * 
     * @return String
     */
    public String getName() {
        return name;
    }

    
    /** 
     * Returns a formated string representation of the spell
     * 
     * @return String
     */
    public String toString() {
        return String.format("Name: %s, Damage: %d, Damage Type: %s, Mana Required: %d", name, dmg, dmgType, manaReq);
    }

    
    /** 
     * Casts a spell if the caster (caster) has enough
     * mana. If the enemy has a weakness to the damage 
     * type, the spell damage is doubled. Reduces the 
     * HP of the target by the total spell damage.
     * 
     * @param caster
     * @param target
     */
    public abstract void cast(Character caster, Character target);
}