public class Wizard extends Character{
    private Spell spell;
    private Weapon weapon;
    public Wizard(String name, Spell spell){
        super(name,new String []{"slashing"},20);
        this.spell = spell;
        CLASS_NAME = "Wizard";
    }
    public void chooseAction(Character in){

    }
}