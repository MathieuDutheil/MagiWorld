public class Rogue extends AbstractCharacter {

    public Rogue(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
        this.setWarScream("Mouahahaha");
        this.setAttributes("le");
        this.setClass("Rôdeur");
        this.setBasicAttackName("Tir à l'Arc");
        this.setSpecialAttackName("Concentration");

    }

    @Override
    public AbstractCharacter basicAttack(AbstractCharacter contender) {
        super.basicAttack(contender);
        System.out.println(this.getAgility() + " dommages.");
        contender.setLife(contender.getLife() - this.getAgility());
        System.out.println("Joueur " + (Game.getContender() + 1) + " perd " + this.getAgility() + " points de vie");
        return contender;
    }

    @Override
    public AbstractCharacter specialAttack(AbstractCharacter contender) {
        super.specialAttack(contender);
        System.out.println(" et gagne " + (this.getLife() / 2) + " d'agilité.");
        this.setAgility((getAgility() + this.getLife() / 2));
        return contender;
    }
}


