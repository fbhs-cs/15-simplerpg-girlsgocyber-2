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
        out.println("What would you like to do:");
        out.println("0 [Throw Spell]");
        out.println("1 [Regenerate Mana]");
        out.println("2 [Attack with weapon]");
        int choice = s.nextInt();

    }
}