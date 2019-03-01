public class Item {
    public int itemID;
    public String name;
    public String producer;
    public double price;

    public Item(int itemID, String name, String producer, double price) {
        this.itemID = itemID;
        this.name = name;
        this.producer = producer;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.itemID+" "+this.name+" "+this.producer+" "+this.price;
    }
}
