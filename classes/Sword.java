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
            if (getWielder().equals("Player")) {
                System.out.printf("You critifcally hit!/n");
            }
            else {
                System.out.printf("The %s critically hit!\n",getWielder());
            }
            tempDmg *= 2;
        }
        if(getWielder().equals("Player")) {
            System.out.printf("You swing your sword\n");
        }
        else {
            System.out.printf("The %s swings a sword at you!",getWielder());
        }
        return tempDmg;
    }
    
}