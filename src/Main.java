public class Main {
    public static void main(String[] args) {

        Mage magicUser = new Mage("Rune");
        magicUser.skills.get(0).use();
        magicUser.skills.get(1).use();
        magicUser.skills.get(2).use();

    }
}
