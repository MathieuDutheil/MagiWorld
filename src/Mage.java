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
        System.out.println(this.getIntelligence() + " dommages.");
        contender.setLife(contender.getLife() - this.getIntelligence());
        System.out.println("Joueur " + (Game.getContender() + 1) + " perd " + this.getIntelligence() + " points de vie");
        return contender;
    }

    @Override
    public AbstractCharacter specialAttack(AbstractCharacter contender) {
        super.specialAttack(contender);
        System.out.println(" et gagne " + (this.getIntelligence() * 2) + " en vitalité.");
        this.setLife((this.getLife() + this.getIntelligence() * 2));
        if (this.getLife() > ((this.getStrength() + this.getAgility() + this.getIntelligence()) * 5)) {
            this.setLife(((this.getStrength() + this.getAgility() + this.getIntelligence()) * 5));
            System.out.println("Votre vie ne peut pas dépasser " + ((this.getStrength() + this.getAgility() + this.getIntelligence()) * 5) + ".");
        }

        return contender;
        // Manque limite  : Attention, il ne peut pas avoir plus de vie qu’il n’en avait au départ.

    }
}
