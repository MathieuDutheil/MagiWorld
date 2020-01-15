abstract class AbstractCharacter {

    private int level;
    private int life;
    private int strength;
    private int agility;
    private int intelligence;
    private String CriDeGuerre;
    private String Classe;
    private String Joueur;
    private String Attributes;
    private static int numPlayer = 0;





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
        return CriDeGuerre + "je suis " + Attributes + " " + Classe + " " + Joueur + " niveau " + level + " je possède " + life + " de vitalité, " + strength + " de force, " + agility + " d'agilité et " + intelligence + " d'intelligence !";
    }

    protected void setCriDeGuerre(String criDeGuerre) {
        CriDeGuerre = criDeGuerre;
    }

    protected void setClasse(String classe) {
        Classe = classe;
    }

    protected void setAttributes(String attributes) {
        Attributes = attributes;
    }

}

    /*public void basicAttack() {

    }

    public void specialAttack() {

    }*/
