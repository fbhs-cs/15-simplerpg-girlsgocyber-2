public class Brigand_Spearman extends Character {
    private Weapon weapon;
    public Brigand_Spearman() {
        super("Brigand Spearman",new String[] {"Piercing","Fire"},10);
        weapon = new Spear(5,.3);
        weapon.setWielder("Brigand Spearman");
    }

    @Override
    public void chooseAction(Character in) {
        weapon.attack(in);
    }
}