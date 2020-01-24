import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    private final static int MAX_PLAYERS = 2;
    AbstractCharacter[] characterList = new AbstractCharacter[MAX_PLAYERS];

    public void createCharacters() {

        int levelCharacter;
        int strenghtCharacter;
        int agilityCharacter;
        int intelligenceCharacter;
        int classCharacter;

        //  for (AbstractCharacter.getNbPlayers(); AbstractCharacter.getNbPlayers() < maxPlayers; AbstractCharacter.getNbPlayers()) {
        do {

            do {
                System.out.println("Création du personnage du joueur " + (AbstractCharacter.getNbPlayers() + 1));
                classCharacter = askAnInt("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)", 1, 3);
                levelCharacter = askAnInt("Niveau du personnage ?", 1, 100);
                strenghtCharacter = askAnInt("Force du personnage ?", 0, 100);
                agilityCharacter = askAnInt("Agilité du personnage ?", 0, 100);
                intelligenceCharacter = askAnInt("Intelligence du personnage ?", 0, 100);

                if (levelCharacter != strenghtCharacter + agilityCharacter + intelligenceCharacter) {
                    System.out.println("Attention le total force + agilité + intelligence doit être égal au niveau du joueur, recommencez la saisie.");
                }
            } while (levelCharacter != strenghtCharacter + agilityCharacter + intelligenceCharacter);


            switch (classCharacter) {
                case 1:
                    characterList[AbstractCharacter.getNbPlayers()] = new Warrior(strenghtCharacter, agilityCharacter, intelligenceCharacter);
                    break;
                case 2:
                    characterList[AbstractCharacter.getNbPlayers()] = new Rogue(strenghtCharacter, agilityCharacter, intelligenceCharacter);
                    break;
                case 3:
                    characterList[AbstractCharacter.getNbPlayers()] = new Mage(strenghtCharacter, agilityCharacter, intelligenceCharacter);
            }
            System.out.println(characterList[(AbstractCharacter.getNbPlayers() - 1)]);
            System.out.println(AbstractCharacter.getNbPlayers());

        } while (AbstractCharacter.getNbPlayers() < MAX_PLAYERS);

    }

    public int askAnInt(String intro, int lowLimit, int highLimit) {

        int carac = 0;
        boolean isNonNumericalOutput;
        do {
            try {
                isNonNumericalOutput=false;
                System.out.println(intro);
                carac = sc.nextInt();
                if (carac < lowLimit || carac > highLimit) {
                    System.out.println("Attention cette caractéristique du personnage doit être comprise entre " + lowLimit + " et " + highLimit + ", recommencez la saisie.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Merci de saisir un chiffre.");
                isNonNumericalOutput = true;
                sc.nextLine();
            }

        } while (carac < lowLimit || carac > highLimit || isNonNumericalOutput);

        return carac;
    }

    public void runGame() {
        createCharacters();

    }

}

