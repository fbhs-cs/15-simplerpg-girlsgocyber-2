import static java.lang.System.*;
class testWeapon{
    public static void main(String [] args){
        Weapon s = new Weapon(10,"Fire",.6);
        Character c = new Character("Alex", new String[] {"Fire"}, 60);
        Character e = new Character("Kyle", new String[] {"Water"}, 50);
        out.println(s.attack(e));
        out.println(s.getWeaponType());
        out.println(s.getDmgType());
        out.println(s.getDmg());
        out.println(s.getCrit());
        out.println(s);
        out.println(c);
    }
}