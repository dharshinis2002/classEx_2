package Abstraction;

public class AbsMain {

        public static void main(String[] args) {

            AbsChild1 abs=new AbsChild1();
            abs.Sayhello();
            abs.Calculator();
            abs.print();

            AbsChild2 abs2=new AbsChild2();
            abs2.Sayhello();
            abs2.Calculator();
            abs2.print();
        }
    }


