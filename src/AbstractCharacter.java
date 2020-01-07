abstract class AbstractCharacter {

    private int level;
    private int life;
    private int strength;
    private int agility;
    private int intelligence;
    private static int numPlayer = 0;
    String CriDeGuerre;
    String Joueur;

    public AbstractCharacter(int strength, int agility, int intelligence) {

        numPlayer++;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.level = strength + agility + intelligence;
        this.life = level * 5;
        this.Joueur = "Joueur " + numPlayer;


    }

    @Override
    public String toString() {
        return CriDeGuerre + Joueur + " niveau " + level + " je possède " + life + " de vitalité, " + strength + " de force, " + agility + " d'agilité et " + intelligence + " d'intelligence !";
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
