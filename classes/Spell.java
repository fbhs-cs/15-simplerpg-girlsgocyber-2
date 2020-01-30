public class Spell {
    int dmg;
    String dmgType;
    int manaReq;
    String name;
    String SPELL_TYPE;

    
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
     * Casts a spell if the caster (player1) has enough
     * mana. If the enemy has a weakness to the damage 
     * type, the spell damage is doubled. Reduces the 
     * HP of the target by the total spell damage.
     * 
     * @param player1
     * @param player2
     */
    // public void cast(Character player1, Character player2) {
    //     if(player1.getMana() >= manaReq) {
    //         if(player1.isWeakTo(dmgType)) {
    //             player1.takeDmg(dmg*2);
    //         }
    //         else {
    //             player1.takeDmg(dmg);
    //         }
    //     }
    // }
}