public class Mage {
    // Mage needs access to MageSkills
    private String name;
    private int health;
    private int mana;
    protected MageSkills skills;

    //Mage Constructor
    Mage(String name) {
        this.name = name;
        this.health = 80;
        this.mana = 150;
        skills = new MageSkills();
    }

    void spawn() {
        System.out.printf("%s spawns in. %s has %d health and %d mana.%n", name, name, health, mana);
    }

}
