package p2;


public class DefaultMethodsExampleImpl implements DefaultMethodsExample {

    public void hello() {
        double x = getValue();
        System.out.println(x);
    }

//    public static void main(String[] args) {                                      //nie da się stworzyć instancji interfajsu, mozna tylko klasy, która go imlementuje
//        System.out.println(new DefaultMethodsExample().getValue() {
//        });
//    }

}