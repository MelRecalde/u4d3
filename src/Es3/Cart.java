package Es3;

public class Cart {
    private User user;
    private Item[] items;

    public Cart(User user1) {
        this.user = user1;
        this.items = new Item[0];
    }

    // GETTER & SETTER
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public double totalCart() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            int avail = items[i].getNumberItems();
            System.out.println(avail);
            if (avail == 0) {
                System.out.println(items[i].getCode() + " is out of stock!");
                continue;
            } else {
                total += items[i].getPrice();
            }
        }
        return total;
    }
}
