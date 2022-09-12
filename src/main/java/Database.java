public class Database {
    private SuperHero[] heroDatabase = new SuperHero[5];

    public void addASuperhero(String name, String superheroName, String power, int year, double strength) {
    SuperHero hero = new SuperHero(name, superheroName, power, year, strength);
    }
}
