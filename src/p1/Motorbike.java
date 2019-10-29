package p1;

    public class Motorbike {
        // POLA:

        private String colour = "gray";
        private String made;
        private EngineType engine;
        Biker biker;

        public String getColour() {
            return colour;
        }

        public Motorbike setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public String getMade() {
            return made;
        }

        public Motorbike setMade(String made) {
            this.made = made;
            return this;
        }

        public EngineType getEngine() {
            return engine;
        }

        public Motorbike setEngine(EngineType engine) {
            this.engine = engine;
            return this;
        }

        @Override
        public String toString() {
            return "Motorbike{" +
                    "colour='" + colour + '\'' +
                    ", made='" + made + '\'' +
                    ", engine=" + engine +
                    ", biker=" + biker +
                    '}';
        }

        public static void main(String[] args) {
            Motorbike moto = new Motorbike()
                    .setColour("blue")
                    .setEngine(EngineType.HYBRID)
                    .setMade("Honda");
            System.out.println(moto);
            Biker biker1= new Biker()
                    .setName("Adam");
            moto.biker= biker1;
            System.out.println(moto);
            biker1.motorbike=moto;

            EngineType e2= EngineType.DIESEL;
            EngineType.PETROL.getCapacity();
            System.out.println(e2.getCapacity());

            for(EngineType type: EngineType.values())
                System.out.println(type);



        }
    }