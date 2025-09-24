public class LightningBolt extends Skills{

    private String name;
    private int damage;
    private int range;
    private int manaCost;

    LightningBolt(String name) {
        this.name = name;
        this.damage = 50;
        this.range = 60;
        this.manaCost = 25;
    }

    public void use() {
        System.out.printf("%s is cast. It does %d damage, reaches %d ft, and uses %d mana.%n", name, damage, range, manaCost);
    }
}

