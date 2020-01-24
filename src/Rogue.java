public class Rogue extends AbstractCharacter {

    public Rogue(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
        this.setWarScream("Mouahahaha");
        this.setAttributes("le");
        this.setClass("Rôdeur");
    }

    @Override
    int basicAttack() {

        return 0;
    }

    @Override
    int specialAttack() {

        return 0;
    }
}


