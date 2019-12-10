abstract class Character {


    private int level;
    private int life;
    private int strength;
    private int agility;
    private int intelligence;


    public Character(int level, int life, int strength, int agility, int intelligence) {
        this.level = level;
        this.life = life;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }


    public int getLevel() {
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
    }

    public String toString(){
        return " niveau " + getLevel() + " je possède " + getLife() + " de vitalité, " + getStrength() + " de force, " + getAgility() + " d'agilité et " + getIntelligence() + " d'intelligence !";
    }

    public void basicAttack() {

    }

    public void specialAttack() {

    }
}