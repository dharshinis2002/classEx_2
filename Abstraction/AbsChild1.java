package Abstraction;

public class AbsChild1 extends AbstractParent{

@Override
    void Sayhello(){
        System.out.println("how are you");
    }

    @Override
    void Calculator() {
        System.out.println("hi");
    }

    @Override
    void print() {
        super.print();
    }
}


