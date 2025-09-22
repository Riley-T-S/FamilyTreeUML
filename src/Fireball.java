public class Fireball {

    private String name;
    private int damage;
    private int range;
    private int manaCost;

    Fireball(String name) {
        this.name = name;
        this.damage = 25;
        this.range = 60;
        this.manaCost = 10;
    }

    void cast() {
        System.out.printf("%s is cast. It does %d damage, reaches %d ft, and uses %d mana.", name, damage, range, manaCost);
    }
}
