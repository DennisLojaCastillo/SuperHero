import java.util.ArrayList;



public class Database {

    public Database() {
        heroes.add(new Superhero("Peter Parker", "Spider Man", "Spider-Power", 1992, 11.21));
        heroes.add(new Superhero("Clark Kent", "Super Man", "Strong", 1943, 34.31));
        heroes.add(new Superhero("Bruce Wayne", "Bat Man", "Agile", 1923, 65.21));
    }

    private final ArrayList<Superhero> heroes = new ArrayList<>();


    public void addSuperhero(String name, String alias, String power, int year, double strength) {
        heroes.add(new Superhero(name, alias, power, year, strength));
    }

    public ArrayList<Superhero> getHeros() {
        return heroes;
    }

    //TODO Lav en hvor metoden godtager både store og små bogstaver
    public ArrayList<Superhero> searchByAlias(String alias) {
        ArrayList<Superhero> heroList = new ArrayList<>();

        for (Superhero superhero : heroes) {
            if (superhero.getAlias().contains(alias)) {
                heroList.add(superhero);
            }
        }
        return heroList;
    }
}


/* public Database() {
        heroes.add(new Superhero("Peter Parker", "Spider Man", "Spider-Power", 1992, 11.21));
        heroes.add(new Superhero("Clark Kent", "Super Man", "Strong", 1943, 34.31));
        heroes.add(new Superhero("Bruce Wayne", "Bat Man", "Agile", 1923, 65.21));

        //---------------------------------------------------------------------------------
        // Egner sig bedst til eksamen!
        Superhero s2 = new Superhero("Bruce Wayne", "Bat Man", "Agile", 1923, 65.21);
        heroes.add(s2);
        Superhero s3 = new Superhero("Bruce Wayne", "Bat Man", "Agile", 1923, 65.21);
        heroes.add(s3);
        Superhero s4 = new Superhero("Bruce Wayne", "Bat Man", "Agile", 1923, 65.21);
        heroes.add(s4);

        Superhero s5 = new Superhero("Bruce Wayne", "Bat Man", "Agile", 1923, 65.21);
        Superhero s6 = new Superhero("Bruce Wayne", "Bat Man", "Agile", 1923, 65.21);
        Superhero s7 = new Superhero("Bruce Wayne", "Bat Man", "Agile", 1923, 65.21);
        heroes.addAll(List.of(s5,s6,s7));
    }*/ // Test Data - inkl. eksamenssituation

/*public Database() {
        heroes.add(new Superhero("Peter Parker", "Spider Man", "Spider-Power", 1992, 11.21));
        heroes.add(new Superhero("Clark Kent", "Super Man", "Strong", 1943, 34.31));
        heroes.add(new Superhero("Bruce Wayne", "Bat Man", "Agile", 1923, 65.21));
    }*/ //Test Data

/*public Database() {
        heroes.add(new Superhero("Peter Parker", "Spider Man", "Spider-Power", 1992, 11.21));
        heroes.add(new Superhero("Clark Kent", "Super Man", "Strong", 1943, 34.31));
        heroes.add(new Superhero("Bruce Wayne", "Bat Man", "Agile", 1923, 65.21));
    }*/ //Database Superhero test persons

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
    }*/ //Metoder til UserInterFace

/*public Superhero searchByName(String name) {
        for (Superhero superhero : heroes) {
            if (superhero.getName().equals(name)) {
                return superhero;
            }
            if (superhero.getName().equalsIgnoreCase(name)) {
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
            if (superhero.getPower().equalsIgnoreCase(power)) {
                return superhero;
            }
        }
        return null;
    }*/ //Søgefunktion med navn og superpower

