package j_08_메소드;

import java.util.Random;

public class RandomNumber {

    public static int calcRandom(int m){
        Random random = new Random();

        int result = random.nextInt(10) * 1000 + m;
        return result;
    }

    public static void main(String[] args) {
//        Random random = new Random();


        int money = 5000;
//        int a = random.nextInt(10) * 1000 + money;
//        int b = random.nextInt(10) * 1000 + money;
//        int c = random.nextInt(10) * 1000 + money;
//        int d = random.nextInt(10) * 1000 + money;
//        int e = random.nextInt(10) * 1000 + money;

//        System.out.println(a+b+c+d+e);
        // 코드의 재사용 동작을 정의 일정하게 정해진 기능을 만들 때

        int r = calcRandom(money);

        System.out.println(r);
        System.out.println(r);
        System.out.println(r);
        System.out.println(r);
        System.out.println(r + r + r);

//        for (int i = 0; i < 10; i++) {
//            int randNum = random.nextInt(100) + 100;
//            System.out.println(randNum);
//        }

    }
}
