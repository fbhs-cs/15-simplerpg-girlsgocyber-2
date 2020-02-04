import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Wizard extends Character{
    private Spell spell;
    private Weapon weapon;
    public Wizard(String name, Spell spell){
        super(name,new String []{"slashing","dark"},20);
        this.spell = spell;
        CLASS_NAME = "Wizard";
    }
    public void chooseAction(Character in){
        Scanner s = new Scanner(System.in);
        int choice = -1;
        try{
        out.println("What would you like to do:");
        out.println("0 [Throw Spell]");
        out.println("1 [Regenerate Mana]");
        out.println("2 [Attack with weapon]");
        choice = Integer.parseInt(s.nextLine().trim());
        if(choice > 2 || choice < 0){
            int dumb = 9/0;
        }
        }
        catch(Exception e){
            out.println("Sorry, That's not an option");
        }
        if(choice == 0){
            spell.cast(this, in);
        }
        else if(choice == 1){
            this.addMana(5);
        }
        else{
            weapon.attack(in);
        }

    }
}