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
    }

    public ArrayList<Superhero> getHeros() {
        return heroes;
    }


    public Superhero searchByAlias(String alias) {
        for (Superhero superhero : heroes) {
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

    public Superhero searchByPower(String power) {
        for (Superhero superhero : heroes) {
            if (superhero.getPower().equals(power)) {
                return superhero;
            }
        }
        return null;
    }
}








/* public Superhero searchByYear(int year) {
        for (Superhero superhero : heroes) {
            if (superhero.getYear().equals(year)) {
                return superhero;
            }
        }
        return null;
    }

    public Superhero searchByStrength(String name) {
        for (Superhero superhero : heroes) {
            if (superhero.getYear().equals(name)) {
                return superhero;
            }
        }
        return null;
    }*/



