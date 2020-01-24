public class Mage extends AbstractCharacter {

    public Mage(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
        this.setWarScream("Abracadabra");
        this.setAttributes("le");
        this.setClass("Mage");
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
