public class Mage extends AbstractCharacter {

    public Mage(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
    }

    @Override
    public String toString() {
        return "Abracadabra je suis le Mage " + super.toString();
    }
}






    /*public String toString() {
        String str = "Abracadabra je suis le Mage " + super.toString();
        return str;
    }*/

    /*public void declaremage1() {
        System.out.println("Abracadabra je suis le Mage Joueur " + "1" + " niveau " + getLevel() + " je possède " + getLife() + " de vitalité, " + getStrength() + " de force, " + getAgility() + " d'agilité et " + getIntelligence() + " d'intelligence !");
    }

    public void declareRogue2() {
        System.out.println("Abracadabra je suis le Mage Joueur " + "2" + " niveau " + getLevel() + " je possède " + getLife() + " de vitalité, " + getStrength() + " de force, " + getAgility() + " d'agilité et " + getIntelligence() + " d'intelligence !");
    }*/

