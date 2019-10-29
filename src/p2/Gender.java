package p2;


    public enum Gender {
        MALE(100, "M"), FEMALE(200, "F"), UNKNOWN( 300, "?");

        private final int x;
        String symbol;

        public int getX() {                             //getter pozwala na dostanie się do wartości enuma
            return x;
        }

        public String getSymbol() {
            return symbol;
        }

        Gender(int x, String symbol) {this.x=x;
        this.symbol=symbol;                      //musi być konstruktor
            System.out.println("hello from constructor " + this);
        }

        @Override
        public String toString() {
            return super.toString()+
                    ", x=" + x +
                    ", symbol=" + symbol ;}

        public String toString(int a) {
            return super.toString();
        }
    }