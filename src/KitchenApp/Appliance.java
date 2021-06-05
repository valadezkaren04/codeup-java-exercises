package KitchenApp;

public abstract class Appliance {
    // using the protected keyword in an abstract class because we want
    // our field to be private to everything else, BUT our subclasses WILL have access.
    protected String type;
    protected String brandName;


    // We can create constructors in abstract classes, that way we can use the super keyword in the subclasses to inherit the defined fields
    public Appliance(String type, String brandName) {
        this.type = type;
        this.brandName = brandName;
    }

    // Abstract methods are defined using the "abstract" keyword,
    // and create a blueprint for a method to be implemented in the subclass.
    // Abstract methods provide the return type, name of method, and number of parameters and parameter types.
    public abstract void setType(String type);

    public abstract void setBrandName(String brandName);




}
