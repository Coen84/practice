package p1;

public class Biker {
    private String name;
    Motorbike motorbike;

    public String getName() {
        return name;
    }

    public Biker setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Biker{" +
                "name='" + name + '\'' +
                ", motorbike=" + motorbike +
                '}';
    }
}