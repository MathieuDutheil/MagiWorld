import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    // List<Character> player = new ArrayList<>();

    public void createCharacters() {

        int levelCharacter;
        int strenghtCharacter = 0;
        int agilityCharacter = 0;
        int intelligenceCharacter = 0;
        //    int lifeCharacter;
        int nbCharacter = 0;

        //    try {

        for (int i = 1; i < 3; i++) {


                System.out.println("Création du personnage du joueur " + i);
            try {
                do {
                    System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
                    nbCharacter = sc.nextInt();
                    if (nbCharacter < 1 || nbCharacter > 3) {
                        System.out.println("Veuillez choisir parmi les personnages proposés");
                    }
                } while (nbCharacter < 1 || nbCharacter > 3);
            } catch (InputMismatchException e) {
                System.out.println("Dodo L'asticot");
            }

                do {

                    do {
                        System.out.println("Niveau du personnage ?");
                        levelCharacter = sc.nextInt();
                        if (levelCharacter < 1 || levelCharacter > 100) {
                            System.out.println("Le niveau du personnage doit être compris entre 1 et 100, recommencez la saisie.");
                        }
                    } while (levelCharacter < 1 || levelCharacter > 100);


                    System.out.println("Force du personnage ?");
                    strenghtCharacter = declareCarac();

                    System.out.println("Agilité du personnage ?");
                    agilityCharacter = declareCarac();

                    System.out.println("Intelligence du personnage ?");
                    intelligenceCharacter = declareCarac();


                    if (levelCharacter != strenghtCharacter + agilityCharacter + intelligenceCharacter) {
                        System.out.println("Attention le total force + agilité + intelligence doit être égal au niveau du joueur, recommencez la saisie.");
                    }

                } while (levelCharacter != strenghtCharacter + agilityCharacter + intelligenceCharacter);
                




            switch (nbCharacter) {
                case 1:
                    if (i == 1) {
                        Warrior player1 = new Warrior(strenghtCharacter, agilityCharacter, intelligenceCharacter);
                        System.out.println(player1);


                    } else {
                        Warrior player2 = new Warrior(strenghtCharacter, agilityCharacter, intelligenceCharacter);
                        System.out.println(player2);
                    }
                    break;

                case 2:
                    if (i == 1) {
                        Rogue player1 = new Rogue(strenghtCharacter, agilityCharacter, intelligenceCharacter);
                        System.out.println(player1);

                    } else {
                        Rogue player2 = new Rogue(strenghtCharacter, agilityCharacter, intelligenceCharacter);
                        System.out.println(player2);
                    }
                    break;

                case 3:
                    if (i == 1) {
                        Mage player1 = new Mage(strenghtCharacter, agilityCharacter, intelligenceCharacter);
                        System.out.println(player1);
                    } else {
                        Mage player2 = new Mage(strenghtCharacter, agilityCharacter, intelligenceCharacter);
                        System.out.println(player2);
                    }
                    break;

                default:
                    System.out.println("Vous n'avez pas choisi de classe parmi les choix proposés");
            }
        }


    }

    //  } catch (InputMismatchException ie) {
    //     System.out.println("Vous devez saisir un nombre.");





   /* public void startFight() {


    }*/

    public int declareCarac() {

        int carac;
        do {
            carac = sc.nextInt();
            if (carac < 0 || carac > 100) {
                System.out.println("Attention cette caractéristique du personnage doit être comprise entre 0 et 100, recommencez la saisie.");
            }
        } while (carac < 0 || carac > 100);
        return carac;

    }


    public void runGame() {
        createCharacters();


    }

}

