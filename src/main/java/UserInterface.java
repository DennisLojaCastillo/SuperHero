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
            searchInput();
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
            for (Superhero superhero : db.getHeros()) {
                System.out.println(superhero);
            }
        }
    }

    public void searchInput() {
        System.out.println("Enter Superhero name: ");
        String findHero = scanner.nextLine();
        Superhero superhero = db.searchInput(findHero);
        if (superhero != null) {
            System.out.println("Information" + "\n" + superhero);
        } else {
            System.out.println("Found nothing with this name.");
        }
    }
}
