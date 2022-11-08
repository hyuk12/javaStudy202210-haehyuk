package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 중복 불가 순서 없음 보통 리스트에서 중복을 제거할 때 많이 쓰인다.
public class StringSet {

    public static void main(String[] args) {

        Set<String> strSet = new HashSet<String>();
        List<String> strList = new ArrayList<String>();

        strList.add("이동빈");
        strList.add("이승아");
        strList.add("우예희");
        strList.add("이종준");
        strList.add("변상원");
        strList.add("김준일");

        // 값 추가
        strSet.add("김준일");
        strSet.add("장혜민");
        strSet.add("정순동");
        strSet.add("김완준");
        strSet.add("송아셀");

        System.out.println(strSet);
        strSet.addAll(strList);
        System.out.println(strSet);

        // 값 조회
        String searchName = "김준일";
        boolean isTrue = false;
        for(String str : strSet){
            if (str.equals(searchName)){
                isTrue = true;
                break;
            }
        }
        System.out.println(isTrue);

        // 수정
        /*
            송아셀 찾아서  -> true이면 남강석으로 바꿔라
         */
       String setName = "송아셀";
        for (String str: strSet){
            if (str.equals(setName)){
                strSet.remove(setName);
                strSet.add("남강석");
                break;
            }
        }

        System.out.println(strSet);

        // 위의 방법을 통합적으로 할 수 있는방법
        System.out.println(strSet.contains(searchName));

        // 응용
        if(strSet.contains(searchName)){
            strSet.remove(searchName);
            strSet.add("김준이");
        }
        System.out.println(strSet);
    }
}
