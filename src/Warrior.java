public class Warrior extends AbstractCharacter {

    public Warrior(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
        this.setWarScream("Woarg");
        this.setAttributes("le");
        this.setClass("Guerrier");
    }

    @Override
    public int basicAttack() {
        return this.getStrength();
    }

    @Override
    public int specialAttack() {
        int rageSmash = (this.getStrength()*2);
        this.setStrength((getStrength()/2));

        return (rageSmash);
    }
}
