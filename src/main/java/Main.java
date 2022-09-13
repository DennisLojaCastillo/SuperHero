import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner valgScanner = new Scanner(System.in);
        Database heroDatabase = new Database();

        int menu = 0;
        do {
            System.out.println("Velkommen til Superhelte-Programmet");
            System.out.println("Her skal du tilføje din favorit superhelte");
            System.out.println("""
                    ---------------------------------------------
                    1. Opret superhelt
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

                heroDatabase.addSuperhero(name,superheroName,power,year,strength);
            } else {
                System.exit(0);
            }
        } while (menu != 9);





       // heroDatabase.addSuperhero(name,superheroName,power,year,strength);
    }
}


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