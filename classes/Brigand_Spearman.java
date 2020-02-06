public class Brigand_Spearman extends Character {
    private Weapon weapon;
    public Brigand_Spearman(String name) {
        super(name,new String[] {"Piercing","Fire"},10);
        weapon = new Spear(5,.3);
        weapon.setWielder("Brigand Spearman");
        CLASS_NAME = "Brigand Spearman";
        this.setLevel(1);
        this.setHP(this.getMaxHP());
        this.setMana(0);
    }

    @Override
    public void chooseAction(Character in) {
        weapon.attack(in);
    }
}