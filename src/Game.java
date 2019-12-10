import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);


    public void createCharacters() {

        int levelCharacter;
        int strenghtCharacter;
        int agilityCharacter;
        int intelligenceCharacter;
        int lifeCharacter;
        int nbCharacter;

        try {

            for (int i = 1; i < 3; i++) {


                System.out.println("Création du personnage du joueur " + i);


                do {

                    System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
                    nbCharacter = sc.nextInt();
                    if (nbCharacter < 1 || nbCharacter > 3) {
                        System.out.println("Veuillez choisir parmi les personnages proposés");
                    }

                } while (nbCharacter < 1 || nbCharacter > 3);


                do {

                    do {
                        System.out.println("Niveau du personnage ?");
                        levelCharacter = sc.nextInt();
                        if (levelCharacter < 1 || levelCharacter > 100) {
                            System.out.println("Le niveau du personnage doit être compris entre 1 et 100");
                        }
                    } while (levelCharacter < 1 || levelCharacter > 100);
                    lifeCharacter = levelCharacter * 5;


                    do {
                        System.out.println("Force du personnage ?");
                        strenghtCharacter = sc.nextInt();
                        if (strenghtCharacter < 0 || strenghtCharacter > 100) {
                            System.out.println("Attention la force du personnage doit être comprise entre 0 et 100");
                        }
                    } while (strenghtCharacter < 0 || strenghtCharacter > 100);


                    do {
                        System.out.println("Agilité du personnage ?");
                        agilityCharacter = sc.nextInt();
                        if (agilityCharacter < 0 || agilityCharacter > 100) {
                            System.out.println("Attention l'agilité du personnage doit être comprise entre 0 et 100");
                        }
                    } while (agilityCharacter < 0 || agilityCharacter > 100);


                    do {
                        System.out.println("Intelligence du personnage ?");
                        intelligenceCharacter = sc.nextInt();
                        if (intelligenceCharacter < 0 || intelligenceCharacter > 100) {
                            System.out.println("Attention l'intelligence du personnage doit être comprise entre 0 et 100");
                        }
                    } while (intelligenceCharacter < 0 || intelligenceCharacter > 100);


                    if (levelCharacter != strenghtCharacter + agilityCharacter + intelligenceCharacter) {
                        System.out.println("Attention le total force + agilité + intelligence doit être égal au niveau du joueur.");
                    }
                } while (levelCharacter != strenghtCharacter + agilityCharacter + intelligenceCharacter);


                switch (nbCharacter) {
                    case 1:
                        if (i == 1) {
                            Warrior player1 = new Warrior(levelCharacter, lifeCharacter, strenghtCharacter, agilityCharacter, intelligenceCharacter);
                            player1.declareWarrior1();

                        } else {
                            Warrior player2 = new Warrior(levelCharacter, lifeCharacter, strenghtCharacter, agilityCharacter, intelligenceCharacter);
                            player2.declareWarrior2();
                        }
                        break;

                    case 2:
                        if (i == 1) {
                            Rogue player1 = new Rogue(levelCharacter, lifeCharacter, strenghtCharacter, agilityCharacter, intelligenceCharacter);
                            player1.declareRogue1();

                        } else {
                            Rogue player2 = new Rogue(levelCharacter, lifeCharacter, strenghtCharacter, agilityCharacter, intelligenceCharacter);
                            player2.declareRogue2();
                        }
                        break;

                    case 3:
                        if (i == 1) {
                            Mage player1 = new Mage(levelCharacter, lifeCharacter, strenghtCharacter, agilityCharacter, intelligenceCharacter);
                            player1.declaremage1();
                        } else {
                            Mage player2 = new Mage(levelCharacter, lifeCharacter, strenghtCharacter, agilityCharacter, intelligenceCharacter);
                            player2.declareRogue2();
                        }
                        break;

                    default:
                        System.out.println("Vous n'avez pas choisi de classe parmi les choix proposés");
                }


            }

        } catch (InputMismatchException ie) {
            System.out.println("Vous devez saisir un nombre.");
        }
    }


    public void startFight() {


    }


    public void runGame() {
        createCharacters();


    }


}
