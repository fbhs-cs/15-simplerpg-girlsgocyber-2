import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Paladin extends Character {
    private Spell spell;
    private Weapon weapon;
    public Paladin(String name,Weapon weapon) {
        super(name, new String[] {"Blunt","Dark"},1);
        CLASS_NAME = "Paladin";
        this.weapon = weapon;
        weapon.setWielder("Player");
        spell = new Smite();
        this.setLevel(1);
        this.setHP(this.getMaxHP());
        this.setMana(5);
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
        if(choice > 2 || choice < 0){
            int dumb = 9/0;
        }
        }
        catch(Exception e){
            out.println("Sorry, That's not an option");
        }
        if(choice == 1){
            spell.cast(this, in);
        }
        else if(choice == 2){
            weapon.attack(in);
        }
    }
}