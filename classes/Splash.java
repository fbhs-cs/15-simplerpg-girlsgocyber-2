public class Splash extends Spell {
    public Splash() {
        super(99999, "Unknown", 0, "Splash");
    }

    public void cast(Character caster, Character target) {
        if(caster.getMana() >= manaReq) {
            target.takeDmg(dmg);
            caster.useMana(manaReq);
            System.out.println("Splash!");
        }
    }
}