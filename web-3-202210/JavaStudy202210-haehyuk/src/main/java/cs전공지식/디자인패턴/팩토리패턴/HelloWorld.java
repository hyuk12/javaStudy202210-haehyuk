package cs전공지식.디자인패턴.팩토리패턴;


abstract class Coffee {
    public abstract int getPrice();

    @Override
    public String toString() {
        return "Hi this coffee is " + this.getPrice();
    }
}

class CoffeeFactory{
    public static Coffee getCoffee(String type, int price){
        if("Latte".equalsIgnoreCase(type)) return new Latte(price);
        else if("Americano".equalsIgnoreCase(type)) return new Americano(price);
        else{
            return new DefaulCoffee();
        }
    }
}

class DefaulCoffee extends Coffee{
    private int price;

    public DefaulCoffee(){
        this.price = -1;
    }
    @Override
    public int getPrice() {
        return this.price;
    }
}

class Latte extends Coffee{
    private int price;

    public Latte(int price){
        this.price = price;
    }
    @Override
    public int getPrice() {
        return this.price;
    }
}

class Americano extends Coffee{
    private int price;

    public Americano(int price){
        this.price = price;
    }
    @Override
    public int getPrice() {
        return this.price;
    }
}

/*
커피 팩토리라는 커피를 생성하는 클래스가 있고
그 클래스에는 라떼와 아메리카노 defalutCoffee를 받고 있다
커피 종류와 가격을 적으면 그에 맞게 출력되는 시스템

 */
public class HelloWorld {

    public static void main(String[] args) {
        Coffee latte = CoffeeFactory.getCoffee("Latte", 5500);
        Coffee americano = CoffeeFactory.getCoffee("americano", 5500);

        System.out.println("Factory latte:: " + latte);
        System.out.println("Factory americano:: " + americano);

    }
}
