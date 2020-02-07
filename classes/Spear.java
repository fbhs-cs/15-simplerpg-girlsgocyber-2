public class Spear extends Weapon {
    public Spear(int dmg, double crit) {
        super(dmg, "Piercing", crit);
        WEAPON_TYPE = "Spear";
    }

    public void attack(Character target) {
        int tempDmg = this.getDmg();
        tempDmg *= Math.random()/2 + .5;
        if (target.isWeakTo(this.getDmgType())) {
            tempDmg *= 2;
        }
        double critRoll = Math.random();
        if (critRoll < this.getCrit()) {
            if (getWielder().equals("Player")) {
                System.out.printf("You critically hit!\n");
            }
            else {
                System.out.printf("The %s critically hit!\n",getWielder());
            }
            tempDmg *= 2;
        }
        if(getWielder().equals("Player")) {
            System.out.printf("You thrust your spear!\n");
        }
        else {
            System.out.printf("The %s stabs you with a spear!\n",getWielder());
        }
        target.takeDmg(tempDmg);
    }
    
}