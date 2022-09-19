import java.util.Scanner;

public class UserInterface {

    private Database db = new Database();
    Scanner scanner = new Scanner(System.in);

    //------------------------------------------------------------------------------------------------
    public void startProgram() {
        int userChoice = -1;

        System.out.println(ConsoleColors.CYAN + "Welcome to the Superhero-Program\n" +
                "________________________________");

        while (userChoice != 9) {
            System.out.println(ConsoleColors.CYAN + """                  
                    1. Add new Superhero
                    2. Superhero List
                    3. Search Superhero
                    4. Edit Superhero List
                    9. End Program
                    """ + ConsoleColors.RESET);

            userChoice = readInteger();
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
        else if (userChoice == 4)
            editToolHandlingUserChoice();
    }

    //------------------------------------------------------------------------------------------------

    public void addSuperhero() {
        System.out.println(ConsoleColors.BLUE + "Enter the superhero's real name: ");
        String name = scanner.nextLine();

        System.out.println(ConsoleColors.BLUE + "Enter the superhero's alias: ");
        String alias = scanner.nextLine();

        System.out.println(ConsoleColors.BLUE + "Enter the superhero's power: ");
        String power = scanner.nextLine();

        /*System.out.println(ConsoleColors.BLUE +"Enter the superhero's year of publication: ");
        int year = readInteger();*/
        System.out.println(ConsoleColors.BLUE + "Enter the superhero's year of publication: ");
        /*int year = readInteger();*/
        int year = 0;
        String input; //= scanner.nextLine();
        boolean wrongUserInput = true;
        while (wrongUserInput) {
            try {
                input = scanner.nextLine();
                year = Integer.parseInt(input);
                wrongUserInput = false;
            } catch (NumberFormatException e) {
                //Fejlhåndtering
                System.out.println("You need to enter a number");
                //year = Integer.parseInt(input);
            }
        }
        // Hvis try lykkedes ryger vi forbi catch!
        System.out.println(ConsoleColors.BLUE + "Enter the superhero's strength power: (Range is from 1-10) \n*OBS You need to tab with comma (,)*" + ConsoleColors.RESET);
        double strength = scanner.nextDouble();

        db.addSuperhero(name, alias, power, year, strength);
    }

    //------------------------------------------------------------------------------------------------

    public void superheroList() {
        if (db.getHeros().size() == 0) {
            System.out.println(ConsoleColors.RED + "\nThere's no Superhero registered...\n" + ConsoleColors.RESET);
        } else {
            System.out.println(ConsoleColors.GREEN_BRIGHT + "List of Superhero's registered\n" + ConsoleColors.RESET);
            for (Superhero superhero : db.getHeros()) {
                System.out.println(ConsoleColors.BLUE + superhero + ConsoleColors.RESET);
            }
        }
    }

    //------------------------------------------------------------------------------------------------

    public void startSearchTool() {

        int searchUserChoice = -1;

        System.out.println("\nWelcome to the Superhero Search Engine\n" +
                "________________________________");

        while (searchUserChoice != 9) {
            System.out.println("""
                      Search by:               
                    1. Alias name
                    2. Real name
                    3. Power      
                                 
                    9. Back to menu
                    """);

            searchUserChoice = scanner.nextInt();
            scanner.nextLine(); // Håndtering af Scanner bug
            toolHandlingUserChoice(searchUserChoice);
        }
    }

    //-----------------------------------

    private void toolHandlingUserChoice(int searchUserChoice) {
        if (searchUserChoice == 1)
            searchByAlias(); //Crud operation
        else if (searchUserChoice == 2)
            searchByName(); //Crud operation
        else if (searchUserChoice == 3)
            searchByPower();
    }

    //-----------------------------------

    public void searchByAlias() {

        System.out.println("Search Superhero by alias name: ");
        String findHero = scanner.nextLine();
        Superhero superhero = db.searchByAlias(findHero);
        if (superhero != null) {
            System.out.println("\nInformation\n" + superhero);
        } else {
            System.out.println(ConsoleColors.RED + "\nFound nothing with this name.\n" + ConsoleColors.RESET);
        }
    }

    public void searchByName() {
        System.out.println("Search Superhero by real name: ");
        String findHero = scanner.nextLine();
        Superhero superhero = db.searchByName(findHero);
        if (superhero != null) {
            System.out.println("\nInformation\n" + superhero);
        } else {
            System.out.println(ConsoleColors.RED + "\nFound nothing with this name.\n" + ConsoleColors.RESET);
        }

    }

    public void searchByPower() {
        System.out.println("Search Superhero by superpower: ");
        String findHero = scanner.nextLine();
        Superhero superhero = db.searchByPower(findHero);
        if (superhero != null) {
            System.out.println("\nInformation\n" + superhero);
        } else {
            System.out.println(ConsoleColors.RED + "\nFound nothing with this name.\n" + ConsoleColors.RESET);
        }
    }

    //------------------------------------------------------------------------------------------------

    public void editToolHandlingUserChoice() {

        int editUserChoice = -1;

        System.out.println("\nWelcome to the Superhero Edit Tool\n" +
                "________________________________");

        while (editUserChoice != 9) {
            System.out.println("""               
                    1. Edit Superhero              
                    9. Back to menu
                    """);

            editUserChoice = scanner.nextInt();
            scanner.nextLine(); // Håndtering af Scanner bug
            editToolHandlingUserChoice(editUserChoice);
        }
    }

    //-----------------------------------

    private void editToolHandlingUserChoice(int editUserChoice) {
        if (editUserChoice == 1)
            editTool(); //Crud operation
    }

    public void editTool() {
        for (int i = 0; i < db.getHeros().size(); i++) {
            System.out.println(i + 1 + " Superhero: \n" + db.getHeros().get(i));
        }

        //Brugerdialog for redigere i oplysninger.
        //-----------------------------------

        System.out.println("Enter Superhero number to edit informations:");
        int numb = scanner.nextInt();
        scanner.nextLine();

        Superhero editHero = db.getHeros().get(numb - 1); //Index starter fra 0
        System.out.println("Edit Person: " + editHero);

        System.out.println("Edit data and press ENTER. If data is not to be edited press ENTER");


        System.out.println("Real name: " + editHero.getName());
        System.out.println("Please enter the new NAME below");
        String newName = scanner.nextLine();
        if (!newName.isEmpty()) {
            editHero.setName(newName);
        }
        System.out.println("Alias name: " + editHero.getAlias());
        System.out.println("Please enter the new ALIAS name below");
        String newAlias = scanner.nextLine();
        if (!newAlias.isEmpty()) {
            editHero.setAlias(newAlias);
        }

        System.out.println("Super Power: " + editHero.getPower());
        System.out.println("Please enter the new SUPER POWER below");
        String newPower = scanner.nextLine();
        if (!newPower.isEmpty()) {
            editHero.setPower(newPower);
        }

        System.out.println("Year of publication: " + editHero.getYear());
        System.out.println("Please enter the new YEAR below");
        String newYear = scanner.nextLine();
        if (!newYear.isEmpty()) {
            editHero.setYear(Integer.parseInt(newYear));
        }

        System.out.println("Strength: " + editHero.getStrength());
        System.out.println("Please enter the new STRENGTH below *OBS! You need to make a DOT (.) instead of COMMA");
        String newStrength = scanner.nextLine();
        if (!newStrength.isEmpty()) {
            editHero.setStrength(Double.parseDouble(newStrength));
        }


    }

    //------------------------------------------------------------------------------------------------

    public int readInteger() {
        while (!scanner.hasNextInt()) {
            String errorMsg = scanner.next();
            System.out.println(ConsoleColors.RED + "Error! You can't enter \"" + errorMsg + "\" Enter a number." + ConsoleColors.RESET);
        }
        int result = scanner.nextInt();
        return result;
    }
}



/* public void searchByYear() {
        System.out.println("Search Superhero by year: ");
        String findHero = scanner.nextLine();
        Superhero superhero = db.searchByYear(Integer.parseInt(findHero));
        if (superhero != null) {
            System.out.println("\nInformation\n" + superhero);
        } else {
            System.out.println("\nFound nothing with this name.\n");
        }
    }

    public void searchByStrength() {
        System.out.println("Search Superhero by strength: ");
        String findHero = scanner.nextLine();
        Superhero superhero = db.searchByStrength(findHero);
        if (superhero != null) {
            System.out.println("\nInformation\n" + superhero);
        } else {
            System.out.println("\nFound nothing with this name.\n");
        }
    }*/ //Metoder

/*else if (searchUserChoice == 4)
            searchByYear();
        else if (searchUserChoice == 5)
            searchByStrength();*/ // toolHandlingUserChoice