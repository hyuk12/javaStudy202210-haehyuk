package j12_상속;

public class Animal {

    private String name;



    public Animal(String name) {
        System.out.println("이름은 " + name + "입니다.");
        this.name = name;
    }
    public void move(){
        System.out.println(name + "이(가) 움직입니다.");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
