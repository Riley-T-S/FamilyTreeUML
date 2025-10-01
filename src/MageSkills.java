import java.util.ArrayList;

public class MageSkills {
    ArrayList<Skills> spells = new ArrayList<>();

    public MageSkills() {
        //Add spells to list
        spells.add (new Fireball("Fireball"));
        spells.add (new LightningBolt("Lightning Bolt"));
        spells.add (new IceStorm( "Ice Storm"));

        //Print out spell list
        System.out.println("Mage Skills include the following spells:" + spells);

    }

        public Skills get(int i) {return spells.get(i);
        }

    @Override
    public String toString() {
        return "Mage Skills: " + String.join(", ", ArrayList(MageSkills), spells);
    }
//    Fireball Skill = new Fireball("Fireball");
//    LightningBolt Skill2 = new LightningBolt("Lightning Bolt");
}
