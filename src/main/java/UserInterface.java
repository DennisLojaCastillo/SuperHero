import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private final Database db = new Database();
    Scanner scanner = new Scanner(System.in);

    //------------------------------------------------------------------------------------------------
    // Hovedmenu
    // Brugeren udvælger en funktion

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
                    5. Delete Superhero
                    9. End Program
                    """ + ConsoleColors.RESET);

            userChoice = readInteger();
            scanner.nextLine(); // Håndtering af Scanner bug
            handlingUserChoice(userChoice);
        }
    }

    // Brugeren vælger mellem 1 og 4 til en specifik metode.

    public void handlingUserChoice(int userChoice) {
        if (userChoice == 1)
            addToolHandlingUserChoice(); //Crud operation
        else if (userChoice == 2)
            superheroList(); //Crud operation
        else if (userChoice == 3)
            startSearchTool();
        else if (userChoice == 4)
            editToolHandlingUserChoice();
        else if (userChoice == 5)
            deleteToolHandlingUserChoice();
        else if (userChoice != 9) {
            System.out.println(ConsoleColors.RED + """
                                        
                    Could not handle input. Please try again
                    Choose menu item from 1-4
                    """ + ConsoleColors.RESET);
        }
    }

    //------------------------------------------------------------------------------------------------
    // Menu til oprettelse af Superhelt og giver brugeren et valg om gennemføre oprettelsen
    // eller gå tilbage til hovedmenu.
    public void addToolHandlingUserChoice() {

        int addUserChoice = -1;

        System.out.println("""

                Superhero add Tool
                ________________________________
                """);

        while (addUserChoice != 9) {
            System.out.println("""               
                    1. Add New Superhero
                    9. Back to menu
                    """);

            addUserChoice = readInteger();
            scanner.nextLine(); // Håndtering af Scanner bug
            addToolUserChoice(addUserChoice);
        }
    }

    //-----------------------------------

    private void addToolUserChoice(int addUserChoice) {
        if (addUserChoice == 1)
            addSuperhero(); //Crud operation
        else if (addUserChoice != 9) {
            System.out.println(ConsoleColors.RED + """
                                        
                    Could not handle input. Please try again
                    Choose menu item 1 or tab 9 back to menu
                    """ + ConsoleColors.RESET);
        }

    }

    //Oprettelsen af Superhelt
    public void addSuperhero() {
        System.out.println(ConsoleColors.BLUE + "Enter the superhero's real name: ");
        String name = scanner.nextLine();

        System.out.println(ConsoleColors.BLUE + "Enter the superhero's alias: ");
        String alias = scanner.nextLine();

        System.out.println(ConsoleColors.BLUE + "Enter the superhero's power: ");
        String power = scanner.nextLine();

        System.out.println(ConsoleColors.BLUE + "Enter the superhero's year of publication: ");
        int year = readInteger();

        // Hvis try lykkedes ryger vi forbi catch!
        System.out.println(ConsoleColors.BLUE + "Enter the superhero's strength power: " + ConsoleColors.RESET);
        double strength = readDouble();

        db.addSuperhero(name, alias, power, year, strength);

        System.out.println(ConsoleColors.GREEN_BOLD + """
                               
                Superhero Registered!
                """ + ConsoleColors.RESET);
    }

    //------------------------------------------------------------------------------------------------
    // Printer Superhelte liste ud.
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
    // Søgefunktion til Superhelte databasen.

    public void startSearchTool() {

        int searchUserChoice = -1;

        System.out.println("""

                Superhero Search Engine
                ________________________________
                """);

        while (searchUserChoice != 9) {
            System.out.println("""
                      Search by:
                      1. Alias name
                      2. Real name
                      3. Power
                      
                      9. Back to menu
                    """);

            searchUserChoice = readInteger();
            scanner.nextLine(); // Håndtering af Scanner bug
            toolHandlingUserChoice(searchUserChoice);
        }
    }

    //-----------------------------------

    private void toolHandlingUserChoice(int searchUserChoice) {
        if (searchUserChoice == 1)
            searchByAlias(); //Crud operation
        //else if (searchUserChoice == 2)
            //searchByName(); //Crud operation
       // else if (searchUserChoice == 3)
            //searchByPower();
        else if (searchUserChoice != 9) {
            System.out.println(ConsoleColors.RED + """
                                        
                    Could not handle input. Please try again
                    Choose menu item from 1-3 or tab 9 back to menu
                    """ + ConsoleColors.RESET);
        }
    }

    //-----------------------------------
    //TODO Lav dem på alle søgefunktioner!
    public void searchByAlias() {

        System.out.println("Search Superhero by alias name: ");
        String findHero = scanner.nextLine();
        ArrayList<Superhero> superhero = db.searchByAlias(findHero);
        if (superhero.size() == 0 ) {
            System.out.println(ConsoleColors.RED + "\nFound nothing with this name.\n" + ConsoleColors.RESET);
        } else {
            System.out.println("\nInformation\n");
            for (Superhero sh : superhero) {
                System.out.println(sh);
                System.out.println();
            }
        }
    }

    /*public void searchByName() {
        System.out.println("Search Superhero by real name: ");
        String findHero = scanner.nextLine();
        Superhero superhero = db.searchByName(findHero);
        if (superhero != null) {
            System.out.println("\nInformation\n" + superhero);
        } else {
            System.out.println(ConsoleColors.RED + "\nFound nothing with this name.\n" + ConsoleColors.RESET);
        }

    }

     */

    /*public void searchByPower() {
        System.out.println("Search Superhero by superpower: ");
        String findHero = scanner.nextLine();
        Superhero superhero = db.searchByPower(findHero);
        if (superhero != null) {
            System.out.println("\nInformation\n" + superhero);
        } else {
            System.out.println(ConsoleColors.RED + "\nFound nothing with this name.\n" + ConsoleColors.RESET);
        }
    }

     */

    //------------------------------------------------------------------------------------------------

    public void editToolHandlingUserChoice() {

        int editUserChoice = -1;

        System.out.println("""

                Superhero Edit Tool
                ________________________________
                """);

        while (editUserChoice != 9) {
            System.out.println("""               
                    1. Edit Superhero
                    9. Back to menu
                    """);

            editUserChoice = readInteger();
            scanner.nextLine(); // Håndtering af Scanner bug
            editToolHandlingUserChoice(editUserChoice);
        }
    }

    //-----------------------------------

    private void editToolHandlingUserChoice(int editUserChoice) {
        if (editUserChoice == 1)
            editTool(); //Crud operation
        else if (editUserChoice != 9) {
            System.out.println(ConsoleColors.RED + """
                                        
                    Could not handle input. Please try again
                    Choose menu item 1 or tab 9 back to menu
                    """ + ConsoleColors.RESET);
        }
    }

    public void editTool() {
        if (db.getHeros().size() == 0) {
            System.out.println(ConsoleColors.RED + "\nThere's no Superhero registered...\n" + ConsoleColors.RESET);
        } else {
            System.out.println(ConsoleColors.GREEN_BRIGHT + "List of Superhero's registered\n" + ConsoleColors.RESET);

            for (int i = 0; i < db.getHeros().size(); i++) {
                System.out.println(i + 1 + ConsoleColors.GREEN + " Superhero: \n" + db.getHeros().get(i) + ConsoleColors.RESET);
            }

            //Brugerdialog for redigere i oplysninger.
            //-----------------------------------

            System.out.println("Enter Superhero number to edit informations:");
            int numb = scanner.nextInt();
            Superhero editHero;
            scanner.nextLine();
            if (numb - 1 >= db.getHeros().size()) {
                System.out.println(ConsoleColors.RED + "\nThis number don't exits in the database. Please try again" + ConsoleColors.RESET);
            } else {
                editHero = db.getHeros().get(numb - 1);
                System.out.println("Edit Person: " + editHero);


                System.out.println(ConsoleColors.BLUE + "Edit data and press" + ConsoleColors.RED + " ENTER " + ConsoleColors.RESET + ConsoleColors.BLUE + "If data is not to be edited press" + ConsoleColors.RED + " ENTER\n " + ConsoleColors.RESET);


                System.out.println("Current Real name: " + editHero.getName());
                System.out.println("Please enter the new NAME below");
                String newName = scanner.nextLine();
                if (!newName.isEmpty()) {
                    editHero.setName(newName);
                }
                System.out.println("Current Alias name: " + editHero.getAlias());
                System.out.println("Please enter the new ALIAS name below");
                String newAlias = scanner.nextLine();
                if (!newAlias.isEmpty()) {
                    editHero.setAlias(newAlias);
                }

                System.out.println("Current Super Power: " + editHero.getPower());
                System.out.println("Please enter the new SUPER POWER below");
                String newPower = scanner.nextLine();
                if (!newPower.isEmpty()) {
                    editHero.setPower(newPower);
                }

                System.out.println("Current Year of publication: " + editHero.getYear());
                System.out.println("Please enter the new YEAR below");
                String newYear = scanner.nextLine();
                if (!newYear.isEmpty()) {
                    editHero.setYear(Integer.parseInt(newYear));
                }

                //TODO Fejl her - man skal både kunne skrive en (.) og (,)
                System.out.println("Strength: " + editHero.getStrength());
                System.out.println("Please enter the new STRENGTH below *OBS! You need to make a DOT (.) instead of COMMA");
                String newStrength = scanner.nextLine();
                if (!newStrength.isEmpty()) {
                    editHero.setStrength(Double.parseDouble(newStrength));
                }
            }
        }
    }

    //------------------------------------------------------------------------------------------------

    public void deleteToolHandlingUserChoice() {

        int deleteUserChoice = -1;

        System.out.println("""

                Superhero Delete Tool
                ________________________________
                """);

        while (deleteUserChoice != 9) {
            System.out.println("""               
                    1. Delete Superhero
                    9. Back to menu
                    """);

            deleteUserChoice = readInteger();
            scanner.nextLine(); // Håndtering af Scanner bug
            deleteToolHandlingUserChoice(deleteUserChoice);
        }
    }

    //-----------------------------------

    private void deleteToolHandlingUserChoice(int deleteUserChoice) {
        if (deleteUserChoice == 1)
            deleteHero(); //Crud operation
        else if (deleteUserChoice != 9) {
            System.out.println(ConsoleColors.RED + """
                                        
                    Could not handle input. Please try again
                    Choose menu item 1 or tab 9 back to menu
                    """ + ConsoleColors.RESET);
        }
    }

    public void deleteHero() {

        if (db.getHeros().size() == 0) {
            System.out.println(ConsoleColors.RED + "\nThere's no Superhero registered...\n" + ConsoleColors.RESET);
        } else {
            System.out.println(ConsoleColors.GREEN_BRIGHT + "List of Superhero's registered\n" + ConsoleColors.RESET);
            for (int i = 0; i < db.getHeros().size(); i++) {
                System.out.println(i + 1 + ConsoleColors.GREEN + " Superhero: \n" + db.getHeros().get(i) + ConsoleColors.RESET);
            }
            System.out.println("Enter Superhero number, you want to delete: ");

            int nr = readInteger();

            if (nr <= db.getHeros().size()) {
                db.getHeros().remove(nr -1);
                System.out.println("\nSuperhero deleted!\n");
            } else {
                System.out.println("Error! - Please try again\n");
            }
        }
    }
    //------------------------------------------------------------------------------------------------
    // Læser om det er et tal (int eller double) og inputtet ikke er et bogstav.
    public int readInteger() {
        while (!scanner.hasNextInt()) {
            String errorMsg = scanner.next();
            System.out.println(ConsoleColors.RED + "Invalid value \"" + errorMsg + "\" Please try again" + ConsoleColors.RESET);
        }
        return scanner.nextInt();
    }

    public double readDouble() {
        while (!scanner.hasNextDouble()) {
            String errorMsg = scanner.next();
            System.out.println(ConsoleColors.RED + "Invalid value \"" + errorMsg + "\" Please try again" + ConsoleColors.RESET);
        }
        return scanner.nextDouble();
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

/*   int year = 0;
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
        }*/ // try & catch metode til at brugeren skal skrive et tal og ikke et bogstav.