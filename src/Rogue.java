public class Rogue extends AbstractCharacter {

    public Rogue(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Mouahahaha je suis le Rôdeur " + super.toString();
    }
}











    /*public String toString() {
        String str = "Mouahahaha je suis le Rôdeur " + super.toString();
        return str;
    }*/

   /* public void declareRogue1() {
        System.out.println("Mouahahaha je suis le Rôdeur Joueur " + "1" + " niveau " + getLevel() + " je possède " + getLife() + " de vitalité, " + getStrength() + " de force, " + getAgility() + " d'agilité et " + getIntelligence() + " d'intelligence !");
    }

    public void declareRogue2() {
        System.out.println("Mouahahaha je suis le Rôdeur Joueur " + "2" + " niveau " + getLevel() + " je possède " + getLife() + " de vitalité, " + getStrength() + " de force, " + getAgility() + " d'agilité et " + getIntelligence() + " d'intelligence !");
    }*/

