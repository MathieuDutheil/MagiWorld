public class Rogue extends Character {

    public Rogue(int level, int life, int strength, int agility, int intelligence) {
        super(level, life, strength, agility, intelligence);
    }


    public void declareRogue1() {
        System.out.println("Mouahahaha je suis le Rôdeur Joueur " + "1" + " niveau " + getLevel() + " je possède " + getLife() + " de vitalité, " + getStrength() + " de force, " + getAgility() + " d'agilité et " + getIntelligence() + " d'intelligence !");
    }

    public void declareRogue2() {
        System.out.println("Mouahahaha je suis le Rôdeur Joueur " + "2" + " niveau " + getLevel() + " je possède " + getLife() + " de vitalité, " + getStrength() + " de force, " + getAgility() + " d'agilité et " + getIntelligence() + " d'intelligence !");
    }
}
