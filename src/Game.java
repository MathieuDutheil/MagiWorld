import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);

    public void createCharacters() {
        for (int i = 1 ; i < 3; i++ ) {
            System.out.println("Création du personnage du joueur " + i );
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
            int nbCharacter = sc.nextInt();

            System.out.println("Niveau du personnage ?");
            int levelCharacter = sc.nextInt();
            int lifeCharacter = levelCharacter * 5;

            System.out.println("Force du personnage ?");
            int strenghtCharacter = sc.nextInt();

            System.out.println("Agilité du personnage ?");
            int agilityCharacter = sc.nextInt();

            System.out.println("Intelligence du personnage ?");
            int intelligenceCharacter = sc.nextInt();

            switch (nbCharacter) {
                case 1:
                    if ( i == 1 ) {
                    Warrior warrior1 = new Warrior(levelCharacter, lifeCharacter, strenghtCharacter, agilityCharacter, intelligenceCharacter);
                    warrior1.declareWarrior1();

                } else {
                    Warrior warrior2 = new Warrior (levelCharacter,lifeCharacter,strenghtCharacter,agilityCharacter,intelligenceCharacter);
                    warrior2.declareWarrior2();
                }
                    break;

                case 2:
                    if ( i == 1 ) {
                        Rogue rogue1 = new Rogue(levelCharacter, lifeCharacter, strenghtCharacter, agilityCharacter, intelligenceCharacter);
                        rogue1.declareRogue1();

                    } else {
                        Rogue rogue2 = new Rogue (levelCharacter,lifeCharacter,strenghtCharacter,agilityCharacter,intelligenceCharacter);
                        rogue2.declareRogue2();
                    }
                    break;

                case 3:
                    if ( i == 1 ) {
                        Mage mage1 = new Mage(levelCharacter, lifeCharacter, strenghtCharacter, agilityCharacter, intelligenceCharacter);
                        mage1.declaremage1();
                    } else {
                        Mage mage2 = new Mage(levelCharacter, lifeCharacter, strenghtCharacter, agilityCharacter, intelligenceCharacter);
                        mage2.declareRogue2();
                    }
                    break;

                default:
                    System.out.println("Vous n'avez pas choisi de classe parmi les choix proposés");
            }
        }
    }

    public void runGame() {
        this.createCharacters();
    }
}
