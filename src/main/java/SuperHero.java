public class SuperHero {
    // Attributter
    private String name;
    private String superheroName;
    private String power;
    private int year;
    private double strength;

    //------------------------------------------------------------------------------------------------
    //Constructor
    public SuperHero(String name, String superheroName, String power, int year, double strength) {
        this.name = name;
        this.superheroName = superheroName;
        this.power = power;
        this.year = year;
        this.strength = strength;
    }

    //------------------------------------------------------------------------------------------------
    // Getter & Setter


    public String getSuperheroName() {
        return superheroName;
    }

    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }

    public int getYear() {
        return year;
    }

    public double getStrength() {
        return strength;
    }
}
