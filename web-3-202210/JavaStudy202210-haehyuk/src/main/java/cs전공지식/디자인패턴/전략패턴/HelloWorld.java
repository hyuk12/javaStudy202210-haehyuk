package cs전공지식.디자인패턴.전략패턴;

import java.util.ArrayList;
import java.util.List;

interface PaymentStrategy {
    public void pay(int amount);
}
class KAKAOCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String date0fExpiry;

    public KAKAOCardStrategy(String name, String cardNumber, String cvv, String date0fExpiry){
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.date0fExpiry = date0fExpiry;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using KAKAOCard.");
    }
}
class LUNACardStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public LUNACardStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using LUNACard.");
    }
}

class Item{
    private String name;
    private int price;

    public Item(String name, int cost) {
        this.name = name;
        this.price = cost;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class ShoppingCart{
    List<Item> items;

    public ShoppingCart() {

        this.items = new ArrayList<Item>();
    }



    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for (Item item: items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}



public class HelloWorld {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item A  =  new Item("kundolA", 100);
        Item B  =  new Item("kundolB", 300);

        cart.addItem(A);
        cart.addItem(B);

        // pay by LUNACard
        cart.pay(new LUNACardStrategy("kundol@example.com", "pukubababo"));

        // pay by KAKAOCard
        cart.pay(new KAKAOCardStrategy("Ju hongchul", "123456789","123","12/01"));



    }
}
