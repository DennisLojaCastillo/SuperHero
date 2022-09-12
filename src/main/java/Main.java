import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Database heroDatabase = new Database();

        System.out.println("Velkommen til Superhelte-Programmet");
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
        double strength = scanner.nextDouble();

        heroDatabase.addASuperhero(name,superheroName,power,year,strength);
    }
}
