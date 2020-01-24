public class Mage extends AbstractCharacter {

    public Mage(int strength, int agility, int intelligence) {
        super(strength, agility, intelligence);
        this.setWarScream("Abracadabra");
        this.setAttributes("le");
        this.setClass("Mage");
        this.setBasicAttackName("Boule de Feu");
        this.setSpecialAttackName("Soin");

    }

    @Override
    public AbstractCharacter basicAttack(AbstractCharacter contender) {
        super.basicAttack(contender);
        contender.setLife(contender.getLife() - this.getIntelligence());
        System.out.println(this.getIntelligence() + " dommages.");
        System.out.println("Joueur " + (Game.getContender() + 1) + " perd " + this.getIntelligence() + " points de vie");
        return contender;
    }

    @Override
    public void specialAttack() {
        this.setLife((this.getLife()) + (this.getIntelligence() * 2));
// Manque limite  : Attention, il ne peut pas avoir plus de vie qu’il n’en avait au départ.

    }
}
