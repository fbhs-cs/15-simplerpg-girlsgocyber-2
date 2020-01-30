public class testSpell {

    public static void testGetDmg() {
        Spell testSpell = new Spell(5, "Fire", 3, "testSpell");
        System.out.println(testSpell.getDmg());
    }

    public static void testGetDmgType() {
        Spell testSpell = new Spell(5, "Fire", 3, "testSpell");
        System.out.println(testSpell.getDmgType());
    }

    public static void testGetManaReq() {
        Spell testSpell = new Spell(5, "Fire", 3, "testSpell");
        System.out.println(testSpell.getManaReq());
    }

    public static void testGetName() {
        Spell testSpell = new Spell(5, "Fire", 3, "testSpell");
        System.out.println(testSpell.getName());
    }

    public static void testToString() {
        Spell testSpell = new Spell(5, "Fire", 3, "testSpell");
        System.out.println(testSpell.toString());
    }

    public static void main(String[] args) {
        testGetDmg();
        testGetDmgType();
        testGetManaReq();
        testGetName();
        testToString();
    }
}