abstract class AbstractCharacter {

    private int level;
    private int life;
    private int strength;
    private int agility;
    private int intelligence;
    private static int numPlayer = 0;

    public AbstractCharacter(int strength, int agility, int intelligence) {
        do {
            this.level = strength + agility + intelligence;
            this.life = level * 5;
        } while (level < 1 || level > 100 || strength  < 0 || strength > 100 || agility  < 0 || agility > 100 || intelligence < 0 || intelligence > 100 || level != strength + agility + intelligence);
        numPlayer++;
    }

    @Override
    public String toString() {
        return "Joueur " + numPlayer + " niveau " + level + " je possède " + life + " de vitalité, " + strength + " de force, " + agility + " d'agilité et " + intelligence + " d'intelligence !";
    }
}

    /*public int getLevel() {
        return level;
    }
    public int getLife() {
        return life;
    }
    public int getStrength() {
        return strength;
    }
    public int getAgility() {
        return agility;
    }
    public int getIntelligence() {
        return intelligence;
    }*/



    /*public void basicAttack() {

    }

    public void specialAttack() {

    }*/
