import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> heroes = new ArrayList();

    public Database() {
        heroes.add(new Superhero("Peter Parker", "Spider Man", "Spider-Power", 1992, 11.21));
        heroes.add(new Superhero("Clark Kent", "Super Man", "Strong", 1943, 34.31));
    }

    public void addSuperhero(String name, String alias, String power, int year, double strength) {
        heroes.add(new Superhero(name, alias, power, year, strength));
    }

    public ArrayList<Superhero> getHeros() {
        return heroes;
    }


    public Superhero searchInput(String name) {
        for (Superhero superhero : heroes) {
            if (superhero.getAlias().equals(name)) {
                return superhero;
            }
        }
        return null;
    }
}



