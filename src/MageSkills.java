import java.util.ArrayList;

public class MageSkills {
    ArrayList<Skills> spells = new ArrayList<>();

    public MageSkills() {



        spells.add (new Fireball("Fireball"));
        spells.add (new LightningBolt("Lightning Bolt"));

        System.out.println("Mage Skills include the following spells:" + spells);

    }

    public Skills get(int i){
        return spells.get(i);
    }
//    Fireball Skill = new Fireball("Fireball");
//    LightningBolt Skill2 = new LightningBolt("Lightning Bolt");
}
