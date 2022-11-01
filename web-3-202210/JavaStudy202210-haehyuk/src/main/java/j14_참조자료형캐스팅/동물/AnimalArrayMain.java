package j14_참조자료형캐스팅.동물;

public class AnimalArrayMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];


        animals[0]= new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3]= new Tiger();

        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Human) {
              Human h = (Human)animals[i];
              h.readBooks();
            }else if (animals[i] instanceof Tiger){
                Tiger t = (Tiger)animals[i];
                t.hunting();
            }
        }

    }
}
