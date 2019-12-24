abstract class Character {

    private int level;
    private int life;
    private int strength;
    private int agility;
    private int intelligence;
    private static int numPlayer = 0;

    public Character(int level, int life, int strength, int agility, int intelligence) {
        this.level = level;
        this.life = life;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;

        numPlayer++;
    }

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
