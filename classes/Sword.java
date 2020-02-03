public class Sword extends Weapon {
    public Sword(int dmg, double crit) {
        super(dmg, "Slashing", crit);
        WEAPON_TYPE = "Sword";
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
        System.out.println("You swing your sword");
        return tempDmg;
    }
    
}