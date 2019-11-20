import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);

    public void createCharacters() {
        for (int i=1; i<3; i++) {
            System.out.println("Création du personnage du joueur " + i);
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
                    System.out.println("Woarg je suis le Guerrier Joueur " + i + " niveau " + levelCharacter + " je possède " + lifeCharacter + " de vitalité, " + strenghtCharacter + " de force, " + agilityCharacter + " d'agilité et " + intelligenceCharacter + " d'intelligence !");
                    break;
                /* miss Character create */
                case 2:
                    System.out.println("Mouahahaha je suis le Rôdeur Joueur " + i + " niveau " + levelCharacter + " je possède " + lifeCharacter + " de vitalité, " + strenghtCharacter + " de force, " + agilityCharacter + " d'agilité et " + intelligenceCharacter + " d'intelligence !");
                    break;
                /* miss Character create */
                case 3:
                    System.out.println("Abracadabra je suis le Mage Joueur " + i + " niveau " + levelCharacter + " je possède " + lifeCharacter + " de vitalité, " + strenghtCharacter + " de force, " + agilityCharacter + " d'agilité et " + intelligenceCharacter + " d'intelligence !");
                    break;
                /* miss Character create */
                default:
                    System.out.println("Vous n'avez pas choisi de classe parmi les choix proposés");
            }
        }
    }

    public void runGame() {
        this.createCharacters();
    }
}
