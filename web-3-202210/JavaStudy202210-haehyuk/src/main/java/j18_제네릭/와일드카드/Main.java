package j18_제네릭.와일드카드;

public class Main {
    // ? 를이용해서 모두 가능하지만 Animal 을 상속받은 클래스만 가능하다
    /*
       extends 는 자기 자신과 하위 객체만 가능
       super 를 이용하면 자기 자신과 상위 객체만 가능
     */
    public AnimalData<? extends Animal> getAnimal(int flag){
        if(flag == 1){
            AnimalData<Human> animalData = new AnimalData<Human>(new Human());
            return animalData;
        }else if(flag == 2) {
            AnimalData<Tiger> animalData = new AnimalData<Tiger>(new Tiger());
            return animalData;
//        }else if(flag == 3){
//            AnimalData<Car> animalData = new AnimalData<Car>(new Car("k8"));
//            return animalData;
//        }
        }
        return null;

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.getAnimal(1).printData();
        main.getAnimal(2).printData();
        System.out.println(main.getAnimal(3).toString());
    }
}
