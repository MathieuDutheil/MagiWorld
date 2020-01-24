

abstract class AbstractCharacter {

    private int level;
    private int life;
    private int strength;
    private int agility;
    private int intelligence;
    private String WarScream;
    private String Class;
    private String Player;
    private String Attributes;
    private static int nbPlayers = 0;




    public AbstractCharacter(int strength, int agility, int intelligence) {
    //   if (strength < 0 || strength > 100 || agility < 0 || agility > 100 || intelligence < 0 || intelligence > 100)
    //   throw
    //   else {
        nbPlayers++;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.level = strength + agility + intelligence;
        this.life = level * 5;
        this.Player = "Joueur " + nbPlayers;
    }

    @Override
    public String toString() {
        return WarScream + " je suis " + Attributes + " " + Class + " " + Player + " niveau " + level + " je possède " + life + " de vitalité, " + strength + " de force, " + agility + " d'agilité et " + intelligence + " d'intelligence !";
    }

    public static int getNbPlayers() {
        return nbPlayers;
    }

    protected void setWarScream(String warScream) {
        WarScream = warScream;
    }

    protected void setClass(String aClass) {
        Class = aClass;
    }

    protected void setAttributes(String attributes) {
        Attributes = attributes;
    }

}

    /*public void basicAttack() {

    }

    public void specialAttack() {

    }*/
