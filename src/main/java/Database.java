import java.util.ArrayList;

public class Database {

    public void addSuperhero(String name, String alias, String power, int year, double strength) {
        heroes.add(new Superhero(name, alias, power, year, strength));
    }

    private ArrayList<Superhero> heroes = new ArrayList();

    public ArrayList<Superhero> getHeroes() {
        return heroes;
    }

}
