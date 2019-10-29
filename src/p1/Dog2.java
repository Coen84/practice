package p1;

    public class Dog2 {
        byte b;
        short s;
        int i;
        long l;

        double d;
        float f;

        boolean bool;
        char c;

        String str;
        Integer ii;
        Dog2 dog;                           // parametrem klasy jest ona sama?

        public static void main(String[] args) {
            new Dog2().hello();
        }

        public void hello() {

            System.out.println(b);
            System.out.println(s);
            System.out.println(i);
            System.out.println(l);

            System.out.println(d);
            System.out.println(f);

            System.out.println(bool);  // false

            System.out.println(c);  // '\u0000'

            System.out.println(str);
            System.out.println(ii);
            System.out.println(dog);
        }
    }