package j19_컬렉션;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StringList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        printCollection(list);

        // 값 추가
        list.add("문자열1");
        list.add("문자열2");
        list.add("문자열3");
        list.add("문자열4");
        list.add("문자열5");

        printCollection(list);

        list.add(1, "문자열6");
        printCollection(list);

        ArrayList<String> addAllList = new ArrayList<String>();

        addAllList.addAll(list);
        addAllList.addAll(2,list);
        printCollection(addAllList);

        // 값 조회
        String str1 = list.get(0);
        System.out.println("str1 = " + str1);

        // 반복을 사용한 값 조회
        // 기본 for문
        for (int i = 0; i < list.size(); i++){
            System.out.println("일반 for - str: " + list.get(i));
        }
        System.out.println();
        // foreach 문
        for(String str : list){
            System.out.println("forEach - str: " + str);
        }
        System.out.println();
        // Iterator 반복자 forEach 와 유사하다.
        Iterator<String> iterator = list.iterator();
        System.out.println("iterator 첫 생성시: " + iterator.hasNext());
        System.out.println("iterator 첫 생성시: " + iterator.next());
        while(iterator.hasNext()){
            System.out.println("Iterator - str: " + iterator.next());
        }

        System.out.println();
        System.out.println("iterator 안은 비었다면 false" + iterator.hasNext());


        // 값 수정
        list.set(1,"문자열4");
        printCollection(list);

        // 값 삭제하기
        list.remove(0);
        printCollection(list);

        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals("문자열3")){
                list.remove(i);
                break;
            }
        }
        list.add("문자열2");
        printCollection(list);

        // 값의 위치 찾기
        int index = list.indexOf("문자열2");
        System.out.println("앞에서 부터 찾은 문자열2의 위치: " + index);

        int lastIndex = list.lastIndexOf("문자열2");
        System.out.println("뒤에서 부터 찾은 문자열2의 위치: " + lastIndex);

        // 값을 포함하고 있는지 여부 조회
        boolean isTrue = list.contains("문자열3");
        System.out.println("list에 문자열3가(이) 포함되어 있는가? : " + isTrue);

        // 리스트를 배열로 변환
        Object[] objects = list.toArray();
        System.out.println(objects[0]);
        for (Object object : objects){
            System.out.println(object);
        }
    }

    public static void printCollection(Collection collection){
        System.out.println(collection);
        System.out.println();
    }

}
