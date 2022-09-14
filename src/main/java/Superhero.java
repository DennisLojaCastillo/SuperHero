public class Superhero {
    // Attributter
    private String name;
    private String alias;
    private String power;
    private int year;
    private double strength;

    //------------------------------------------------------------------------------------------------
    //Constructor
    public Superhero(String name, String alias, String power, int year, double strength) {
        this.name = name;
        this.alias = alias;
        this.power = power;
        this.year = year;
        this.strength = strength;
    }

    //------------------------------------------------------------------------------------------------
    // Getter & Setter


    public String getAlias() {
        return alias;
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


    public String toString() {
        return "Real name: " + name +
                "\nAlias: " + alias +
                "\nSuperpower: " + power +
                "\nYear of publication: " + year +
                "\nStrength: " + strength + "\n";
    }
}
