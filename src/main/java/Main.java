import java.util.Scanner;

public class Main {
    private Database db;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        m.db = new Database();
        m.startProgram();
    }

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
        System.out.println("This is a list over your Superhero's\n");
        db.superheroList();
    }

    public void searchInput() {
        System.out.println("Enter name: ");
        String searchSC = scanner.nextLine();
        db.searchTool();
    }


}



