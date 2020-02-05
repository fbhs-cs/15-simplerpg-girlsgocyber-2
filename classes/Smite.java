public class Smite extends Spell {
    public Smite() {
        super(5,"Holy",3,"Smite");
    }

    int dmg = 5;
    int manaReq = 3;

    @Override
    public void cast(Character caster, Character target) {
        if(caster.getMana() >= manaReq) {
            if(target.isWeakTo(dmgType)) {
                target.takeDmg(dmg*2);
                caster.useMana(manaReq);
                System.out.printf("%s used %s and dealt %d holy damage to %s! (2x damage due to %s's weakness to %s)", caster.getName(), "Smite", dmg*2, target.getName(), target.getName(), "holy");
            }
            else {
                target.takeDmg(dmg);
                caster.useMana(manaReq);
                System.out.printf("%s used %s and dealt %d holy damage to %s.", caster.getName(), "Smite", dmg, target.getName(), target.getName(), "holy");
            }
        }
        else {
            System.out.println("Fizzle.");
        }
    }
}