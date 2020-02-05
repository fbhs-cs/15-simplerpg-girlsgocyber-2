public class Skeleton extends Character {
    private Weapon weapon;
    public Skeleton() {
        super("Skeleton",new String[] {"Blunt","Holy"},10);
        weapon = new Sword(6,.1);
        weapon.setWielder("skeleton");
    }

    @Override
    public void chooseAction(Character in) {
        weapon.attack(in);
    }
}