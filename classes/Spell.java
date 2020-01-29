public class Spell {
    int dmg;
    String dmgType;
    int manaReq;
    String SPELL_TYPE;

    
    public Spell(int damage, String damageType, int manaToCast) {
        dmg = damage;
        dmgType = damageType;
        manaReq = manaToCast;
    }

    
    /** 
     * 
     * @return int
     */
    public int getDmg() {
        return dmg;
    }

    
    /** 
     * @return String
     */
    public String getDmgType() {
        return dmgType;
    }

    
    /** 
     * @return int
     */
    public int getManaReq() {
        return manaReq;
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
    public void cast(Character player1, Character player2) {
        if(player1.getMana() >= manaReq) {
            if(player1.isWeakTo(dmgType)) {
                player1.takeDmg(dmg*2);
            }
            else {
                player1.takeDmg(dmg);
            }
        }
    }
}