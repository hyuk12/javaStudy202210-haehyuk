package cs전공지식.디자인패턴.전략패턴;

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


public class HelloWorld {
}
