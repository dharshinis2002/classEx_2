public class Overloadmain extends NumOvverload {
     static int add(int a, int b){
        return a + b;

    }static int sub(int a, int b) {
        return a - b;

    }  static String add(String name1, String name2) {
        return name1 + name2;

    } public static void main (String[]args) {
            Overloadmain obj = new Overloadmain();


            System.out.println(add(4, 8));
            System.out.println(sub(8, 3));
            System.out.println(add("dharshini", "s"));
            System.out.println(obj.add(5,7));
            System.out.println(obj.sub(8,2));
            System.out.println(obj.add("m","d"));

        }
    }

