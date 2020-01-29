import java.util.*;
class Character{
    private static String CLASS_NAME;
    private String name;
    private int hp,xp,speed;
    private String [] weeknesses;
    public Character(String nameIn, String[] week, int speedIn){
        name = nameIn;
        weeknesses = week;
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
        return Arrays.asList(weeknesses).contains(in) ;
    }

    public String getName(){
        return this.name;
    }

    public void attack(Character in){

    }

    public void takeDmg(int in){
        this.hp -= in;
    }

    public boolean isAlive(){
        return this.hp > 0;
    }

}