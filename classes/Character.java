import java.util.*;
public abstract class Character{
    protected static String CLASS_NAME;
    private String name;
    private int hp,xp,speed,mana;
    private String [] weaknesses;
    public Character(String nameIn, String[] weak, int speedIn){
        name = nameIn;
        weaknesses = weak;
        speed = speedIn;
    }

    
    /** 
     * @return int
     */
    public int getHP(){
        return this.hp;
    }

    
    /** 
     * @param in
     */
    public void setHP(int in){
        this.hp = in;
    }

    
    /** 
     * @param in
     */
    public void setLevel(int in){
        this.xp = in * in;
    }

    
    /** 
     * @param in
     */
    public void addXP(int in){
        this.xp += in;
    }

    
    /** 
     * @return int
     */
    public int getLevel(){
        return (int) Math.sqrt(xp);
    }

    
    /** 
     * @return int
     */
    protected int getMaxHP(){
        return this.getLevel() * 10;
    }

    
    /** 
     * @param in
     * @return boolean
     */
    public boolean isWeakTo(String in){
        return Arrays.asList(weaknesses).contains(in) ;
    }

    
    /** 
     * @return String
     */
    public String getName(){
        return this.name;
    }

    
    /** 
     * @param in
     */
    public void takeDmg(int in){
        this.hp -= in;
    }

    
    /** 
     * @return int
     */
    public int getMana(){
        return this.mana;
    }

    
    /** 
     * @param in
     */
    public void setMana(int in){
        this.mana = in;
    }

    
    /** 
     * @param in
     */
    public void useMana(int in){
        this.mana -= in;
    }

    public void addMana(int in){
        this.mana += in;
    }

    
    /** 
     * @return boolean
     */
    public boolean isAlive(){
        return this.hp > 0;
    }

    
    /** 
     * @return int
     */
    public int getSpeed(){
        return this.speed;
    }

    
    /** 
     * @param in
     */
    public abstract void chooseAction(Character in);

    
    /** 
     * @return String
     */
    public String toString(){
        return "Name: "+name+" HP: " + hp + " Level:" + this.getLevel()+" Speed: " + speed + " Weaknesses: "+Arrays.toString(weaknesses);
    }

}