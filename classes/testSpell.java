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

    public static void testCast() {
        Spell testSpell = new Spell(5, "Fire", 3, "testSpell");
        Character testHero = new Character("Bob", new String [] {"Water"}, 50);
        Character testGoblin = new Character("Goblin", new String [] {"Fire"}, 30);
        testHero.setHP(20);
        testHero.setMana(4);
        testGoblin.setHP(12);
        System.out.printf("Hero's Mana: %d\n", testHero.getMana());
        System.out.printf("Goblin's health: %d\n", testGoblin.getHP());
        testSpell.cast(testHero, testGoblin);
        System.out.printf("Goblin's health after cast: %d\n", testGoblin.getHP());
        System.out.printf("Hero's Mana after cast: %d\n", testHero.getMana());
    }

    public static void main(String[] args) {
        // testGetDmg();
        // testGetDmgType();
        // testGetManaReq();
        // testGetName();
        // testToString();
        testCast();
    }
}