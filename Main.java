public class Main {
    public static void main(String[] args) {

       Inherit2 in=new Inherit2("dharsh","white",90,76,"brand");

       in.setName("volvo");
       in.setColour("white");
       in.setCallnum(866);
       in.setId(8);
       in.setModel("c");

        System.out.println(in.getCallnum());
        System.out.println(in.getId());
        System.out.println(in.getName());
        System.out.println(in.getModel());
        System.out.println(in.getColour());
    }
}
