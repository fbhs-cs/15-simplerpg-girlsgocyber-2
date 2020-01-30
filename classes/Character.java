import java.util.*;
class Character{
    private static String CLASS_NAME;
    private String name;
    private int hp,xp,speed,mana;
    private String [] weaknesses;
    public Character(String nameIn, String[] weak, int speedIn){
        name = nameIn;
        weaknesses = weak;
        speed = speedIn;
    }

    public int getHP(){
        return this.hp;
    }

    public void setHP(int in){
        this.hp = in;
    }

    public void setLevel(int in){
        this.xp = in * in;
    }

    public void addXP(int in){
        this.xp += in;
    }

    public int getLevel(){
        return (int) Math.sqrt(xp);
    }

    private int getMaxXP(){
        return this.getLevel() * 10;
    }

    public boolean isWeakTo(String in){
        return Arrays.asList(weaknesses).contains(in) ;
    }

    public String getName(){
        return this.name;
    }

    public void takeDmg(int in){
        this.hp -= in;
    }

    public int getMana(){
        return this.mana;
    }

    public void setMana(int in){
        this.mana = in;
    }

    public void useMana(int in){
        this.mana -= in;
    }

    public boolean isAlive(){
        return this.hp > 0;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void chooseAction(Character in){

    }

    public String toString(){
        return "";
    }

}