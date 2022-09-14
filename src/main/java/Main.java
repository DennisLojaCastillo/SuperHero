import java.util.Scanner;

public class Main {
    private Database database;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        m.database = new Database();
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

    }

    public void addSuperhero() {
        System.out.println("Enter the superhero's real name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Enter the superhero's alias: ");
        String alias = scanner.nextLine();

        System.out.println("Enter the superhero's power: ");
        String power = scanner.nextLine();

        System.out.println("Enter the superhero's year of publication: ");
        int year = scanner.nextInt();

        System.out.println("Enter the superhero's strength: ");
        double strength = scanner.nextDouble();

        database.addSuperhero(name, alias, power, year, strength);
    }

    public void superheroList() {
        for (Superhero superhero : database.getHeroes()) {
            System.out.println(superhero);
        }
    }

}
