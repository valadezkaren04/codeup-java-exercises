package GroceryApp;

public class Groceries {
    private String name;
    private int quantity;
    private float price;

    public Groceries() {

    }

    public Groceries(String name, int quantity, float price) {
        //constructors
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    /**** setters and getters *****/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    /**** end of setters and getters *****/
}
