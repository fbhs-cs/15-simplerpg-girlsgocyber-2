public class Skeleton extends Character {
    private Weapon weapon;
    public Skeleton() {
        super("Skeleton",new String[] {"blunt","holy"},10);
        weapon = new Sword(6,.1);
    }

    @Override
    public void chooseAction(Character in) {
        weapon.attack(in);
    }
}