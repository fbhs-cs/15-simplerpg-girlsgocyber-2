import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Barbarian extends Character{
    private Spell spell;
    private Weapon weapon = new Sword(5,.1);
    public Barbarian(String name){
        super(name,new String []{"Blunt","Lightning"},20);
        CLASS_NAME = "Barbarian";
        this.setLevel(1);
        this.setHP(this.getMaxHP());
        this.setMana(5);
        weapon.setWielder("barbarian");
    }
    @Override
    public void chooseAction(Character in){
        int choice =(int) (Math.random() * 3);
        if(choice == 0){
            in.takeDmg(weapon.attack(in));
        }
        else{
            choice = (int) (Math.random()*5);
            if(choice == 0){
                out.println("The Barbarian taunts you");
                out.println("Barbarian: You smell like fear");
            }
            else if(choice == 1){
                out.println("The Barbarian taunts you");
                out.println("Barbarian: I will eat you alive");
            }
            else if(choice == 2){
                out.println("The Barbarian taunts you");
                out.println("Barbarian: I will bath in your blood");
            }
            else if(choice == 3){
                out.println("The Barbarian taunts you");
                out.println("Barbarian: I'm gonna crush you like a grape");
            }
            else{
                out.println("The Barbarian taunts you");
                out.println("Barbarian: I love ducks, I meen DEATH!!!");
            }

        }

    }
}