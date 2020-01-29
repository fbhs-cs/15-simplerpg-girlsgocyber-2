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

    public int getDmg() {
        return dmg;
    }

    public String getDmgType() {
        return dmgType;
    }

    public int getManaReq() {
        return manaReq;
    }

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