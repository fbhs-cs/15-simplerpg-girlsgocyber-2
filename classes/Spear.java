public class Spear extends Weapon {
    public Spear(int dmg, double crit) {
        super(dmg, "Piercing", crit);
        WEAPON_TYPE = "Spear";
    }

    public int attack(Character target) {
        int tempDmg = this.getDmg();
        tempDmg *= Math.random()/2 + .5;
        if (target.isWeakTo(this.getDmgType())) {
            tempDmg *= 2;
        }
        double critRoll = Math.random();
        if (critRoll < this.getCrit()) {
            System.out.println("You critically hit!");
            tempDmg *= 2;
        }
        System.out.println("You swing your Spear");
        return tempDmg;
    }
    
}