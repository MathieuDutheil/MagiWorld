import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);

    public void createCharacters() {
        System.out.println("Création du personnage du joueur 1");
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        int nbCharacter1 = sc.nextInt();
        System.out.println("Niveau du personnage ?");
        int levelCharacter1 = sc.nextInt();
        int lifeCharacter1 = levelCharacter1*5;
        System.out.println("Force du personnage ?");
        int strenghtCharacter1 = sc.nextInt();
        System.out.println("Agilité du personnage ?");
        int agilityCharacter1 = sc.nextInt();
        System.out.println("Intelligence du personnage ?");
        int intelligenceCharacter1 = sc.nextInt();

        switch (nbCharacter1) {
            case 1:
                System.out.println("Woarg je suis le Guerrier Joueur 1 niveau " + levelCharacter1 + " je possède " + lifeCharacter1 + " de vitalité, " + strenghtCharacter1 + " de force, " + agilityCharacter1 + " d'agilité et " + intelligenceCharacter1 + " d'intelligence !");
                break;
                /* miss Character create */
            case 2:
                System.out.println("Mouahahaha je suis le Rôdeur Joueur 1 niveau " + levelCharacter1 + " je possède " + lifeCharacter1 + " de vitalité, " + strenghtCharacter1 + " de force, " + agilityCharacter1 + " d'agilité et " + intelligenceCharacter1 + " d'intelligence !");
                break;
                /* miss Character create */
            case 3:
                System.out.println("Abracadabra je suis le Mage Joueur 1 niveau " + levelCharacter1 + " je possède " + lifeCharacter1 + " de vitalité, " + strenghtCharacter1 + " de force, " + agilityCharacter1 + " d'agilité et " + intelligenceCharacter1 + " d'intelligence !");
                break;
            default:
                System.out.println("Vous n'avez pas choisi de classe parmi les choix proposés");
        }



    }

    public void runGame() {
        this.createCharacters();
    }
}
