class Drain extends Spell{
    public Drain() {
        super(5, "Dark", 2, "Drain");
    }

    int dmg = 5;
    int manaReq = 2;

    public void cast(Character caster, Character target) {
        if(caster.getMana() >= manaReq) {
            if(target.isWeakTo(dmgType)) {
                target.takeDmg(dmg*2);
                caster.heal(dmg);
                caster.useMana(manaReq);
                System.out.printf("%s used %s and dealt %d dark damage to %s and gained %d life! (2x damage due to %s's weakness to %s)", caster.getName(), "Drain", dmg*2, target.getName(),dmg , target.getName(), "dark");
            }
            else {
                target.takeDmg(dmg);
                caster.heal(dmg / 2);
                caster.useMana(manaReq);
                System.out.printf("%s used %s and dealt %d dark damage to %s and gained %d life.", caster.getName(), "Drain", dmg, target.getName(),dmg /2);
            }
        }
        else {
            System.out.println("Fizzle.");
        }
    }
}