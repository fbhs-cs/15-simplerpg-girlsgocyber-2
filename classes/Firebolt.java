public class Firebolt extends Spell {
    public Firebolt() {
        super(5, "Fire", 2, "Firebolt");
    }

    int dmg = 5;
    int manaReq = 2;

    public void cast(Character caster, Character target) {
        if(caster.getMana() >= manaReq) {
            if(target.isWeakTo(dmgType)) {
                target.takeDmg(dmg*2);
                caster.useMana(manaReq);
                System.out.printf("%s used %s and dealt %d fire damage to %s! (2x damage due to %s's weakness to %s)", caster.getName(), "Firebolt", dmg*2, target.getName(), target.getName(), "fire");
            }
            else {
                target.takeDmg(dmg);
                caster.useMana(manaReq);
                System.out.printf("%s used %s and dealt %d fire damage to %s.", caster.getName(), "Firebolt", dmg, target.getName(), target.getName(), "fire");
            }
        }
        else {
            System.out.println("Fizzle.")
        }
    }
}