package Arraylist;

import java.util.ArrayList;
import java.util.List;


public class ListOfProducts {
    public static void main(String[] args) {


        Product p1 = new Product("lights", "fantastic", 76, 200);
        Product p2 = new Product("fan", "good", 45, 100);
        Product p3 = new Product("bike", "nice", 234, 44000);


        ArrayList<Product> productlist = new ArrayList<>();
        productlist.add(p1);
        productlist.add(p2);
        productlist.add(p3);
        Order o1 = new Order("ts", "ty", productlist);

        // o1.printtotal();

        ArrayList<Product>productListA=new ArrayList<>();
        Order o2=new Order("t","r",productListA);

        // Add

        System.out.println( o2.productList.size());
        o2.addproduct(p3);
        System.out.println(o2.productList.size());

        //Remove
        o2.removeId(76);
        System.out.println(o2.productList.size());
    }


}