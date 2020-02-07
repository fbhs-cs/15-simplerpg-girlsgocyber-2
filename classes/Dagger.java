public class Dagger extends Weapon {
    public Dagger(int dmg, double crit) {
        super(dmg, "Piercing", crit);
        WEAPON_TYPE = "Dagger";
    }
    @Override
    public int attack(Character target) {
        int tempDmg = this.getDmg();
        tempDmg *= Math.random()/2 + .5;
        if (target.isWeakTo(this.getDmgType())) {
            tempDmg *= 2;
        }
        double critRoll = Math.random();
        if (critRoll < this.getCrit()) {
            if (getWielder().equals("Player")) {
                System.out.printf("You critifcally hit!\n");
            }
            else {
                System.out.printf("The %s critically hit!\n",getWielder());
            }
            tempDmg *= 2;
        }
        if(getWielder().equals("Player")) {
            System.out.printf("You stab them\n");
        }
        else {
            System.out.printf("The %s stabs at you!",getWielder());
        }
        return tempDmg;
    }
    
}