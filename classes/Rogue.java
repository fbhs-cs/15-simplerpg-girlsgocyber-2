import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Rogue extends Character{
    private Weapon weapon;
    public Rogue(String name, Weapon wep) {
        super(name,new String []{"Slashing","Fire"},100);
        this.weapon = wep;
        weapon.setWielder("Player");
        CLASS_NAME = "Rogue";
        this.setLevel(1);
        this.setHP(this.getMaxHP());
        this.setMana(0);
    }
    public void chooseAction(Character in){
        Scanner s = new Scanner(System.in);
        out.println("What would you like to do:");
        out.println("1. [Attack with weapon]");
        int choice = s.nextInt();
        if (choice == 1) {
            in.takeDmg(weapon.attack(in));
        } else {
            System.out.println("The Rogue sharpens his dagger menacingly...");
        }

    }
}