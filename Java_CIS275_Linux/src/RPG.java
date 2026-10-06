import java.util.Scanner;

public class RPG {

    public static int getHeroLineage(Scanner scr, String heroName) {
        //consts for hero's lineage
        final int ELF = 1, ORC = 2, HUMAN = 3;
        String strLineage;
        int lineage = -1; //dummy assignment so var has a value
        do {
            try {
                System.out.println("Enter your lineage: \n1-ELF, 2-ORC, 3-HUMAN");
                strLineage = scr.next();
                lineage = Integer.parseInt(strLineage);

                if (lineage == ELF) {
                    //say something about elves
                } else if (lineage == ORC) {
                    //orcs, comments
                } else if (lineage == HUMAN) {
                    //say something about us
                } else {
                    //error
                    System.out.println("Please enter 1,2 or 3");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Please enter 1,2 or 3");
            }
        } while ((lineage != ELF) && (lineage != ORC) && (lineage != HUMAN));
        return lineage;
    } //end of getHeroLineage

    public static int getHeroRole(Scanner scr, String heroName) {
        //consts for hero's role
        final int FIGHTER = 1, MAGE = 2, ROGUE = 3;
        String strRole;
        int role = -1;
        do {
            try {
                System.out.println("Enter your hero's role: 1-FIGHTER, 2-MAGE, 3-ROGUE");
                strRole = scr.next();
                role = Integer.parseInt(strRole);
                if (role == FIGHTER) {
                    //comments
                } else if (role == MAGE) {
                    //comments
                } else if (role == ROGUE) {
                    //comments
                } else {
                    System.out.println("Please enter 1,2 or 3");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Please enter 1,2 or 3");
            }
        } while ((role < 1) || (role > 3));
        return role;
    } //end getHeroRole

    public static String getHeroName(Scanner scr) {
        String heroName;
        System.out.println("Enter your name, hero");
        //capture the hero name and store in heroName
        heroName = scr.next();
        System.out.println(heroName + " eh? Sounds like a hero.");
        return heroName;
    } //end getHeroName

    public static void startGame() {
        //print the title of the game
        System.out.println("Welcome to Adventure RPG\nA CIS 240 original production");
        //print the opening story
        System.out.println("The Kingdom of Almaria is under attack");
    } //end startGame()

    public static void main(String[] args) {
        String heroName;
        //variables to store lineage and role
        int lineage = -1, role = -1;
        Scanner scr = new Scanner(System.in);

        //print the welcome message and story context
        startGame();

        //get hero name
        heroName = getHeroName(scr);

        //ask the user's lineage
        lineage = getHeroLineage(scr, heroName);

        //ask the user's role
        role = getHeroRole(scr, heroName);
    } // end main

}
