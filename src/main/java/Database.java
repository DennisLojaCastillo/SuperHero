import java.util.ArrayList;

public class Database {

    public void addSuperhero(String name, String alias, String power, int year, double strength) {
        heroes.add(new Superhero(name, alias, power, year, strength));
    }

    private ArrayList<Superhero> heroes = new ArrayList();

    public void superheroList() {
        for (Superhero superhero : heroes) {
            System.out.println(superhero);
        }
    }

    public void searchTool() {
        boolean found = false;
        for (Superhero searchHero : heroes) {
            String searchInput = new String();
            if (searchHero.getAlias().equals(searchInput)) {
                System.out.println("Here is what you search for: \n" + searchHero.getAlias());
                found = true;
            }
        }
    }
}






