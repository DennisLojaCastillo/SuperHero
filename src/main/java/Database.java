import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> heroes = new ArrayList();

    public Database() {
        heroes.add(new Superhero("Peter Parker", "Spider Man", "Spider-Power", 1992, 11.21));
        heroes.add(new Superhero("Clark Kent", "Super Man", "Strong", 1943, 34.31));
        heroes.add(new Superhero("Clark Kent", "Super Man", "Strong", 1943, 34.31));
    }

    public void addSuperhero(String name, String alias, String power, int year, double strength) {
        heroes.add(new Superhero(name, alias, power, year, strength));
        System.out.println(heroes.size());
    }

    public ArrayList<Superhero> getHeros() {
        return heroes;
    }


    public Superhero searchByAlias(String alias) {
        System.out.println(heroes.size());
        for (Superhero superhero : heroes) { //TODO Bug ligger her!!!!! size = 3 men burde være size 4
            if (superhero.getAlias().equals(alias)) {
                return superhero;
            }
        }
        return null;
    }

    public Superhero searchByName(String name) {
        for (Superhero superhero : heroes) {
            if (superhero.getName().equals(name)) {
                return superhero;
            }
        }
        return null;
    }
}




