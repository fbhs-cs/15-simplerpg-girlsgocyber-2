public class Paladin extends Character {
    private Spell spell;
    private Weapon weapon;
    public Paladin(String name) {
        super(name, new String[] {"Blunt","Dark"},1);
        weapon = new Sword(8,.2);
        spell = new Lightningbolt();
    }

    public void chooseAction(Character in) {
        
    }

}