public class Warrior extends Character {


    public Warrior(int level, int life, int strength, int agility, int intelligence) {
        super(level, life, strength, agility, intelligence);
    }

    public void declareWarrior1() {
        System.out.println("Woarg je suis le Guerrier Joueur " + "1" + " niveau " + getLevel() + " je possède " + getLife() + " de vitalité, " + getStrength() + " de force, " + getAgility() + " d'agilité et " + getIntelligence() + " d'intelligence !");
    }

    public void declareWarrior2() {
        System.out.println("Woarg je suis le Guerrier Joueur " + "2" + " niveau " + getLevel() + " je possède " + getLife() + " de vitalité, " + getStrength() + " de force, " + getAgility() + " d'agilité et " + getIntelligence() + " d'intelligence !");
    }

    @Override
    public String toString() {
        return "Blablabla" ;
    }
}
