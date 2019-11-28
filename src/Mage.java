public class Mage extends Character {

    public Mage(int level, int life, int strength, int agility, int intelligence) {
        super(level, life, strength, agility, intelligence);
    }

    public void declaremage1() {
        System.out.println("Abracadabra je suis le Mage Joueur " + "1" + " niveau " + getLevel() + " je possède " + getLife() + " de vitalité, " + getStrength() + " de force, " + getAgility() + " d'agilité et " + getIntelligence() + " d'intelligence !");
    }

    public void declareRogue2() {
        System.out.println("Abracadabra je suis le Mage Joueur " + "2" + " niveau " + getLevel() + " je possède " + getLife() + " de vitalité, " + getStrength() + " de force, " + getAgility() + " d'agilité et " + getIntelligence() + " d'intelligence !");
    }
}
