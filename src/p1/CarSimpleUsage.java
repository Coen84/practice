package p1;

    public class CarSimpleUsage {

        public static void main(String[] args) {

            CarSimple carSimple = new CarSimple();
            carSimple.setColour("biały");
            carSimple.setMade("Trabant");
            carSimple.setMileage(1000);

            // Fluent setter / chained setters

            CarSimple carSimple2 = new CarSimple()
                    .setColour("czarny")
                    .setMade("Wołga")
                    .setMileage(1000);

            CarSimple carSimple3 = new CarSimple()
                    .setColour("zółty")
                    .setMade("VW")
                    .setMileage(10000);


            System.out.println(carSimple);
            System.out.println(carSimple3);
        }
    }


