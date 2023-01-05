package InheridenceabstractionInheridence;

public  interface Clothes {

    String name = "material";
    String add = "ond";

    public void quantity();
    public void colour();
}
abstract class  Clothes1 {
    abstract void name();

    void add() {
        System.out.println("ond");
    }
}



