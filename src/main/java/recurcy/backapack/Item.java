package recurcy.backapack;

public class Item {
    private String name;
    private double weight;
    private double price;

    public Item(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
}
