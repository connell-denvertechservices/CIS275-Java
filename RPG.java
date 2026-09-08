import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {
        String heroName; 
        //variable to store lineage and role
        int lineage, role;

        //consts for hero's lineage and role
        final int ELF=1,ORD=2,HUMAN=3;//lineage
        final int FIGHTER=1,MAGE=2, ROGUE=3;//role

        Scanner scr = new Scanner(System.in);
        //print the title of the game
        System.out.println("Welcome to Adventure RPG\nA CIS 240 original production");
        //print the opening story
        System.out.println("The Kingdom of Almaria is under attack");
        //ask the user's name
        System.out.print("Enter your name, hero");

        //capture the hero name and store in heroName
        heroName = scr.next();
        System.out.println(heroName + " eh? Sounds like a hero.");

        //ask the user's lineage
        System.out.println("Enter your lineage: \n1-ELF, 2-ORC, 3-HUMAN");
        lineage = scr.nextInt();
        //placeholder for evaluting the chouce
        //ask the user's role
        System.out.println("Enter your hero's role: \1-FIGHTER, 2-MAGE, 3-ROGUE");
        role = scr.nextInt();

    }
} // end main



