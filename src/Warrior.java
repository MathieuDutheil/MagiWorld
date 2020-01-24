import java.sql.SQLOutput;

public class Warrior extends AbstractCharacter {

    public Warrior(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
        this.setWarScream("Woarg");
        this.setAttributes("le");
        this.setClass("Guerrier");
        this.setBasicAttackName("Coup d'Épée");
        this.setSpecialAttackName("Coup de Rage");

    }


    @Override
    public AbstractCharacter basicAttack(AbstractCharacter contender) {
        super.basicAttack(contender);
        System.out.println(this.getStrength() + " dommages.");
        contender.setLife(contender.getLife() - this.getStrength());
        System.out.println("Joueur " + (Game.getContender() + 1) + " perd " + this.getStrength() + " points de vie");
        return contender;
    }

    @Override
    public AbstractCharacter specialAttack(AbstractCharacter contender) {
        super.specialAttack(contender);
        System.out.println(" et inflige "+ (this.getStrength()*2) + " dommages.");
        contender.setLife(contender.getLife() - (this.getStrength()*2));
        System.out.println("Joueur " + (Game.getIndexPlayer()+1)+ " perd " + (this.getStrength()/2) + " points de vie.");
        this.setLife((this.getLife() - this.getStrength()/2));

        return contender;
    }
}
