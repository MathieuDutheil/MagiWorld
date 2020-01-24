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
        contender.setLife(contender.getLife() - this.getStrength());
        System.out.println(this.getStrength() + " dommages.");
        System.out.println("Joueur " + (Game.getContender() + 1) + " perd " + this.getStrength() + " points de vie");
        return contender;
    }

    @Override
    public void specialAttack() {
        int rageSmash = (this.getStrength() * 2);
        this.setStrength((this.getStrength() / 2));


    }
}
