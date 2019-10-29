package p1;

public enum EngineType {
    HYBRID(1000),
    DIESEL(1900),
    PETROL(1600);

    private final int capacity;

    EngineType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

}
