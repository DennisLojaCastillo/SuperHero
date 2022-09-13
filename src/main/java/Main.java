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




/* Scanner valgScanner = new Scanner(System.in);
        Database database = new Database();

        int menu = 0;
        do {
            System.out.println("Velkommen til Superhelte-Programmet");
            System.out.println("Her skal du tilføje din favorit superhelte");
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
                String superheroName = scanner.nextLine();

                System.out.println("Indtast superheltens superkræfter: ");
                String power = scanner.nextLine();

                System.out.println("Indtast superheltens udgivelsesår: ");
                int year = scanner.nextInt();

                System.out.println("Indtast superheltens styrke: ");
                double strength = scanner.nextDouble();

                database.addSuperhero(name,superheroName,power,year,strength);
            } else if ( menu == 2) {
                System.out.println(database.getDatabase());
            } else {
                System.exit(0);
            }
        } while (menu != 9);*/



/*   public static void main(String[] args) {
        Database database = new Database();
        System.out.println(database.getDatabase());
    }*/

/* System.out.println("Velkommen til Superhelte-Programmet");
        System.out.println("Her skal du tilføje din favorit superhelte");
        System.out.println("---------------------------------------------");

        System.out.println("Indtast superheltens originale navn: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Indtast superheltens navn: ");
        String superheroName = scanner.nextLine();

        System.out.println("Indtast superheltens superkræfter: ");
        String power = scanner.nextLine();

        System.out.println("Indtast superheltens udgivelsesår: ");
        int year = scanner.nextInt();

        System.out.println("Indtast superheltens styrke: ");
        double strength = scanner.nextDouble();*/