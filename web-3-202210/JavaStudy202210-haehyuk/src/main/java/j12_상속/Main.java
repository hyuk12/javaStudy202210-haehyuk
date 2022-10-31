package j12_상속;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Human human = new Human();
        Tiger tiger = new Tiger();

        animal.move();
        human.move();
        tiger.move();
    }
}
