import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner valgScanner = new Scanner(System.in);
        Database database = new Database();

        int menu = 0;
        System.out.println("Velkommen til Superhelte-Programmet");
        System.out.println("Her skal du tilføje din favorit superhelte");
        do {
            System.out.println("""
                    ---------------------------------------------
                    1. Opret superhelt
                    2. Se liste af superhelte
                    9. Afslut program""");
            menu = valgScanner.nextInt();
            valgScanner.nextLine();
            if (menu == 1) {
                System.out.println("Indtast superheltens originale navn: ");
                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();

                System.out.println("Indtast superheltens navn: ");
                String alias = scanner.nextLine();

                System.out.println("Indtast superheltens superkræfter: ");
                String power = scanner.nextLine();

                System.out.println("Indtast superheltens udgivelsesår: ");
                int year = scanner.nextInt();

                System.out.println("Indtast superheltens styrke: ");
                double strength = scanner.nextDouble();

                database.addSuperhero(name,alias,power,year,strength);

            } else if ( menu == 2) {
                for (Superhero superhero : database.getHeroes()) {
                    System.out.println(superhero);
                }
            } else {
                System.exit(0);
            }
        } while (menu != 9);
    }

}

