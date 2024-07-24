package Es3;

import java.util.Date;

public class E3 {
    public static void main(String[] args) {

        User jared = new User("333", "Jared", "Snow", "fitzJared@rawr.miao", new Date());
        Item serum = new Item("Serum", "Vitamin C", 19);
        serum.addToCart(3);
        System.out.println(serum);
        Item spf = new Item("SPF", "+50", 30);
        Cart jaredCart = new Cart(jared);

        Item[] itemBought = {serum, spf};
        jaredCart.setItems(itemBought);
        System.out.println(jaredCart.totalCart());
    }
}
