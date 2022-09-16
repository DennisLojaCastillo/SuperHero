import java.util.Scanner;

public class searchTool {
    private Database db = new Database();
    Scanner scanner = new Scanner(System.in);

    public void startProgram() {
        int toolUserChoice = -1;

        System.out.println("Welcome to the Superhero search engine\n" +
                "________________________________");

        while (toolUserChoice != 9) {
            System.out.println("""
                    Search by:                   
                    1. Alias name
                    2. Real name
                    3. Power
                    4. Year
                    5. Strength
                    9. Back to menu
                    """);

            toolUserChoice = scanner.nextInt();
            scanner.nextLine(); // Håndtering af Scanner bug
            toolHandlingUserChoice(toolUserChoice);
        }
    }

    public void toolHandlingUserChoice(int userChoice) {
        if (userChoice == 1)
            searchByAlias(); //Crud operation
        else if (userChoice == 2)
            searchByName(); //Crud operation
        else if (userChoice == 3)
            searchByPower();
        else if (userChoice == 4)
            searchByYear();
        else if (userChoice == 5)
            searchByStrength();
    }


    public void searchByAlias() {

        System.out.println("Search Superhero by alias name: ");
        String findHero = scanner.nextLine();
        Superhero superhero = db.searchByAlias(findHero);
        if (superhero != null) {
            System.out.println("\nInformation\n" + superhero);
        } else {
            System.out.println("Found nothing with this name.");
        }
    }

    public void searchByName() {
        System.out.println("Search Superhero by real name: ");
        String findHero = scanner.nextLine();
        Superhero superhero = db.searchByName(findHero);
        if (superhero != null) {
            System.out.println("\nInformation\n" + superhero);
        } else {
            System.out.println("Found nothing with this name.");
        }

    }

    public void searchByPower() {

    }

    public void searchByYear() {

    }

    public void searchByStrength() {

    }
}
