package p1;

public class CarSimple {
    private String colour = "gray";
    private String made;
    private long mileage = 0;

    // ALT+Insert generate getter/setter

    // uwaga: dwa proponowowane szablony tworzenia setterów, żeby mieć BUILDER wybieramy TYP BUILDER- zwraca obiekt danej klasy (tu: CarSimple) , przez zapis RETURN THIS;


    public String getColour() {
        return colour;
    }

    public CarSimple setColour(String colour) {
        this.colour = colour;
        return this;
    }

    public String getMade() {
        return made;
    }

    public CarSimple setMade(String made) {
        this.made = made;
        return this;
    }

    public long getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "CarSimple{" +
                "colour='" + colour + '\'' +
                ", made='" + made + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    public CarSimple setMileage(long mileage) {
        this.mileage = mileage;
        return this;


    }
}

