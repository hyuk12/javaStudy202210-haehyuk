package j18_제네릭.와일드카드;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class AnimalData<T> {
    private T animal;

    public void printData(){
        ((Animal)animal).move();
        // 업캐스팅
        if(animal.getClass() == Human.class){
            ((Human)animal).readBooks();
        }else if(animal.getClass() == Tiger.class){
            ((Tiger)animal).hunting();
        }
        System.out.println();
    }
}
