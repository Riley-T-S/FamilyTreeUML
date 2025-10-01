public class Main {
    public static void main(String[] args) {

        Mage magicUser = new Mage("Rune");

        magicUser.spawn();
        magicUser.skills.get(0).use();

    }
}
