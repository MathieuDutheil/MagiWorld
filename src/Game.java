import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    private static int nbPlayers = 0;
    private final static int maxPlayers = 4;


    public void createCharacters() {

        int levelCharacter;
        int strenghtCharacter;
        int agilityCharacter;
        int intelligenceCharacter;
        int classCharacter;


        for (nbPlayers = 0; nbPlayers < maxPlayers; nbPlayers++) {

            do {
                int player = nbPlayers + 1;
                System.out.println("Création du personnage du joueur " + player);

                classCharacter = declareCarac("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)", 1, 3);
                levelCharacter = declareCarac("Niveau du personnage ?", 1, 100);
                strenghtCharacter = declareCarac("Force du personnage ?", 0, 100);
                agilityCharacter = declareCarac("Agilité du personnage ?", 0, 100);
                intelligenceCharacter = declareCarac("Intelligence du personnage ?", 0, 100);

                if (levelCharacter != strenghtCharacter + agilityCharacter + intelligenceCharacter) {
                    System.out.println("Attention le total force + agilité + intelligence doit être égal au niveau du joueur, recommencez la saisie.");
                }
            } while (levelCharacter != strenghtCharacter + agilityCharacter + intelligenceCharacter);


            AbstractCharacter[] characterList = new AbstractCharacter[maxPlayers];

            switch (classCharacter) {
                case 1:
                    characterList[nbPlayers] = new Warrior(strenghtCharacter, agilityCharacter, intelligenceCharacter);
                    break;
                case 2:
                    characterList[nbPlayers] = new Rogue(strenghtCharacter, agilityCharacter, intelligenceCharacter);
                    break;
                case 3:
                    characterList[nbPlayers] = new Mage(strenghtCharacter, agilityCharacter, intelligenceCharacter);
            }
            System.out.println(characterList[nbPlayers]);

        }

    }

    public int declareCarac(String intro, int lowLimit, int highLimit) {

        int carac = 0;
        try {
            do {
                System.out.println(intro);
                carac = sc.nextInt();
                if (carac < lowLimit || carac > highLimit) {
                    System.out.println("Attention cette caractéristique du personnage doit être comprise entre " + lowLimit + " et " + highLimit + ", recommencez la saisie.");
                }
            } while (carac < lowLimit || carac > highLimit);
        } catch (InputMismatchException e) {
            System.out.println("Merci de saisir un chiffre.");
            sc.nextLine();
        }
        return carac;
    }

    public void runGame() {
        createCharacters();

    }

}

