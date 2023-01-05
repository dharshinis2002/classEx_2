package Arraylist;

import java.util.ArrayList;

public class Order {

    private String customerId;
    private String orderId;


    ArrayList<Product> productList;


    public Order(String customerId, String orderId, ArrayList<Product> productList) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productList = productList;

    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;

    }

    public String getOrderId(String orderId) {
        return orderId;

    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void printtotal() {
        int sum = 0;
        for (Product product : productList) {
            sum = sum + product.getPrice();
        }
        System.out.println(sum);
    }
//Add
    public void addproduct(Product product) {
        productList.add(product);

    }
    //Remove
    public  void  removeId(int productId) {
        ArrayList<Product> products = new ArrayList<>();
        for (Product product : productList) {
            if (product.getId() != productId) {

            }
        }
             productList =products;
        }

    }



