package p1;

    public class DogUsage2 {

        public static void main(String[] args) {
            Dog dog1 = new Dog();
            dog1.setNasme("Jon");
            dog1.setBreed("Bloodhound");

            Dog dog=new Dog()
                    .setBreed("jamnik")
                    .setNasme("Minus");


            CarSimple car3 = new CarSimple()
                    .setColour("blue")
                    .setMade("Fiat")
                    .setMileage(1);
            System.out.println(dog1);

               }
    }