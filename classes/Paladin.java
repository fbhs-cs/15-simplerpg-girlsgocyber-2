import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Paladin extends Character {
    private Spell spell;
    private Weapon weapon;
    public Paladin(String name) {
        super(name, new String[] {"Blunt","Dark"},1);
        weapon = new Sword(8,.2);
        spell = new Lightningbolt();
    }

    public void chooseAction(Character in){
        Scanner s = new Scanner(System.in);
        int choice = -1;
        try{
        out.println("What would you like to do:");
        out.println("1 [Throw Spell]");
        out.println("2 [Attack with weapon]");
        choice = Integer.parseInt(s.nextLine().trim());
        if(choice > 1 || choice < 0){
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
            weapon.attack(in);
        }
    }
}