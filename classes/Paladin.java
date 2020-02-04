import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Paladin extends Character {
    private Spell spell;
    private Weapon weapon;
    public Paladin(String name,Weapon weapon) {
        super(name, new String[] {"Blunt","Dark"},1);
        this.weapon = weapon;
        spell = new Lightningbolt();
    }

    @Override
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