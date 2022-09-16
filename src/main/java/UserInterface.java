import java.util.Scanner;

public class UserInterface {
    private Database db = new Database();

    Scanner scanner = new Scanner(System.in);
    public void startProgram() {
        int userChoice = -1;

        System.out.println("Welcome to the Superhero-Program\n" +
                "________________________________");

        while (userChoice != 9) {
            System.out.println("""                  
                    1. Add new Superhero
                    2. Superhero List
                    3. Search Superhero
                    9. End Program
                    """);

            userChoice = scanner.nextInt();
            scanner.nextLine(); // Håndtering af Scanner bug
            handlingUserChoice(userChoice);

        }
    }

    public void handlingUserChoice(int userChoice) {
        if (userChoice == 1)
            addSuperhero(); //Crud operation
        else if (userChoice == 2)
            superheroList(); //Crud operation
        else if (userChoice == 3)
            startSearchTool();

    }

    public void addSuperhero() {
        System.out.println("Enter the superhero's real name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the superhero's alias: ");
        String alias = scanner.nextLine();

        System.out.println("Enter the superhero's power: ");
        String power = scanner.nextLine();

        System.out.println("Enter the superhero's year of publication: ");
        int year = scanner.nextInt();

        System.out.println("Enter the superhero's strength: ");
        double strength = scanner.nextDouble();

        db.addSuperhero(name, alias, power, year, strength);
    }

    public void superheroList() {

        if (db.getHeros().size() == 0) {
            System.out.println("There's no Superhero registered...\n");
        } else {
            System.out.println("List of Superhero's registered\n");
            System.out.println(db.getHeros().size());
            for (Superhero superhero : db.getHeros()) {
                System.out.println(superhero);
            }
        }
    }

    public void startSearchTool() {

        int searchUserChoice = -1;

        System.out.println("Welcome to the Superhero Search Engine\n" +
                "________________________________");

        while (searchUserChoice != 9) {
            System.out.println("""
                      Search by:                   
                    1. Alias name
                    2. Real name
                    3. Power
                    4. Year
                    5. Strength
                    9. Back to menu
                    """);

            searchUserChoice = scanner.nextInt();
            scanner.nextLine(); // Håndtering af Scanner bug
            toolHandlingUserChoice(searchUserChoice);
        }
    }

    private void toolHandlingUserChoice(int searchUserChoice) {
        if (searchUserChoice == 1)
            searchByAlias(); //Crud operation
        else if (searchUserChoice == 2)
            searchByName(); //Crud operation
        else if (searchUserChoice == 3)
            searchByPower();
        else if (searchUserChoice == 4)
            searchByYear();
        else if (searchUserChoice == 5)
            searchByStrength();
    }

    public void searchByAlias() {

        System.out.println("Search Superhero by alias name: ");
        String findHero = scanner.nextLine();
        Superhero superhero = db.searchByAlias(findHero);
        if (superhero != null) {
            System.out.println("\nInformation\n" + superhero);
        } else {
            System.out.println("\nFound nothing with this name.\n");
        }
    }

    public void searchByName() {
        System.out.println("Search Superhero by real name: ");
        String findHero = scanner.nextLine();
        Superhero superhero = db.searchByName(findHero);
        if (superhero != null) {
            System.out.println("\nInformation\n" + superhero);
        } else {
            System.out.println("\nFound nothing with this name.\n");
        }

    }

    public void searchByPower() {

    }

    public void searchByYear() {

    }

    public void searchByStrength() {

    }

}

