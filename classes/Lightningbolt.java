public class Lightningbolt extends Spell {
    public Lightningbolt() {
        super(5,"Lightning",2,"Lightning Bolt");
    }

    int dmg = 5;
    int manaReq = 2;

    public void cast(Character caster, Character target) {
        if(caster.getMana() >= manaReq) {
            if(target.isWeakTo(dmgType)) {
                target.takeDmg(dmg*2);
                caster.useMana(manaReq);
                System.out.printf("%s used %s and dealt %d lightning damage to %s! (2x damage due to %s's weakness to %s)", caster.getName(), "Lightning Bolt", dmg*2, target.getName(), target.getName(), "lightning");
            }
            else {
                target.takeDmg(dmg);
                caster.useMana(manaReq);
                System.out.printf("%s used %s and dealt %d lightning damage to %s.", caster.getName(), "Lightning Bolt", dmg, target.getName(), target.getName(), "lightning");
            }
        }
    }
}