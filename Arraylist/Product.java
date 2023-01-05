package Arraylist;

public class Product {
    private String title;
    private String  description;
    private int id;
    private int price;


    Product(String title,String  description,int id,int price){

        this.title=title;
        this.description=description;
        this.id=id;
        this.price=price;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description= description;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;

    } public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}
