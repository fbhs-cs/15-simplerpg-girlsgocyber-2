public class testCharacter {

    public static void testGetHP() {
        Character testHero = new Character("Bob", new String [] {"Water"}, 50);
        // Character testGoblin = new Character("Goblin", new String [] {"Fire"}, 30);
        System.out.println(testHero.getHP());
    }

    public static void testSetHP() {
        Character testHero = new Character("Bob", new String [] {"Water"}, 50);
        testHero.setHP(99);
        System.out.println(testHero.getHP());
    }

    public static void testSetLevel() {
        Character testHero = new Character("Bob", new String [] {"Water"}, 50);
        testHero.setLevel(99);
        System.out.println(testHero.getLevel());
    }

    public static void testGetLevel() {
        Character testHero = new Character("Bob", new String [] {"Water"}, 50);
        System.out.println(testHero.getLevel());
    }

    public static void testAddXP() {
        Character testHero = new Character("Bob", new String [] {"Water"}, 50);
        testHero.addXP(99999);
        System.out.println(testHero.getLevel());
    }

    public static void testIsWeakTo() {
        Character testHero = new Character("Bob", new String [] {"Water"}, 50);
        System.out.println(testHero.isWeakTo("Water"));
    }

    public static void testGetName() {
        Character testHero = new Character("Bob", new String [] {"Water"}, 50);
        System.out.println(testHero.getName());
    }

    public static void testTakeDmg() {
        Character testHero = new Character("Bob", new String [] {"Water"}, 50);
        testHero.setHP(100);
        testHero.takeDmg(99);
        System.out.println(testHero.getHP());
    }

    public static void testGetMana() {
        Character testHero = new Character("Bob", new String [] {"Water"}, 50);
        System.out.println(testHero.getMana());
    }

    public static void testSetMana() {
        Character testHero = new Character("Bob", new String [] {"Water"}, 50);
        testHero.setMana(10);
        System.out.println(testHero.getMana());
    }

    public static void testUseMana() {
        Character testHero = new Character("Bob", new String [] {"Water"}, 50);
        testHero.setMana(100);
        testHero.useMana(99);
        System.out.println(testHero.getMana());
    }

    public static void testIsAlive() {
        Character testHero = new Character("Bob", new String [] {"Water"}, 50);
        testHero.setHP(10);
        testHero.takeDmg(100);
        System.out.println(testHero.isAlive());
    }

    public static void testGetSpeed() {
        Character testHero = new Character("Bob", new String [] {"Water"}, 50);
        System.out.println(testHero.getSpeed());
    }

    public static void main(String[] args) {
        testAddXP();
        testGetHP();
        testGetLevel();
        testGetMana();
        testGetName();
        testGetSpeed();
        testIsAlive();
        testIsWeakTo();
        testSetHP();
        testSetLevel();
        testSetMana();
        testTakeDmg();
        testUseMana();
    }
}