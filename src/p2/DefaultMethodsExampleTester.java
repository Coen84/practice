package p2;


    public class DefaultMethodsExampleTester {

        public static void main(String[] args) {
            DefaultMethodsExampleImpl impl = new DefaultMethodsExampleImpl();
            impl.hello();
            System.out.println(impl.getValue());

            System.out.println( DefaultMethodsExample.getSomething() );
//        System.out.println( impl.getSomething() );                //nie da się, bo to static


        }
    }