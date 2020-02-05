import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Wizard extends Character{
    private Spell spell;
    private Weapon weapon = new Dagger(5,.1);
    public Wizard(String name, Spell spell){
        super(name,new String []{"slashing","dark"},20);
        this.spell = spell;
        CLASS_NAME = "Wizard";
        this.setLevel(1);
        this.setHP(this.getMaxHP());
        weapon.setWielder("Player");
        this.setMana(5);
    }
    public void chooseAction(Character in){
        Scanner s = new Scanner(System.in);
        int choice = -1;
        while(true){
        try{
        out.println("What would you like to do:");
        out.println("1 [Throw Spell]");
        out.println("2 [Regenerate Mana]");
        out.println("3 [Attack with weapon]");
        choice = Integer.parseInt(s.nextLine().trim());
        if(choice > 3 || choice < 1){
            int dumb = 9/0;
        }
        if(choice == 1){
            spell.cast(this, in);
            break;
        }
        else if(choice == 2){
            this.addMana(5);
            break;
        }
        else{
            in.takeDmg(weapon.attack(in));
            break;
        }
    }
        catch(Exception e){
            out.println("Sorry, That's not an option");
        }
    }  
}
}