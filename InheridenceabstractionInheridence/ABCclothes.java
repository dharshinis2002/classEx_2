package InheridenceabstractionInheridence;

public  interface ABCclothes extends Clothes {

    public default void colour() {
        System.out.println("green");

    }

    public default void quantity() {
        // System.out.println(2);
    }

    public class ABCclothes1 extends Clothes1 {
        @Override
        void name() {

            System.out.println("material");

        }

    }
}
