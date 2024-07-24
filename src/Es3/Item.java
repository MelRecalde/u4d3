package Es3;

public class Item {
    private String code;
    private String description;
    private double price;
    private int numberItems;

    Item(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.numberItems = 0;
    }

    // GETTER & SETTER
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberItems() {
        return numberItems;
    }

    public void setNumberItems(int numberItems) {
        this.numberItems = numberItems;
    }

    public void addToCart(int itemsToadd) {
        this.numberItems += itemsToadd;
    }

    @Override
    public String toString() {
        return "Item{" +
                "code: '" + code + '\'' +
                " - description: '" + description + '\'' +
                " - price: " + price +
                " - numberItems: " + numberItems +
                '}';
    }
}
