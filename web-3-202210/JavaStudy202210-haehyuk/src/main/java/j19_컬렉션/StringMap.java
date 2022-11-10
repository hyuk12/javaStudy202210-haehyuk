package j19_컬렉션;

import java.util.*;

public class StringMap {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        List<String> list = new ArrayList<String>();

        list.add("김준일");
        list.add("이동빈");
        list.add("도정민");
        list.add("최해혁");
        list.add("김준일");

        System.out.println(list);


        // create
        // 원하는 키값을 잡을수가 있다. key값으로 정렬하는데 set과 동일하다
        // 키값은 고유하다 하나만 중복 불가
        map.put("kor2022000-j", "김준일");
        map.put("kor2022000-l", "이동빈");
        map.put("kor2022000-d", "도정민");
        map.put("kor2022000-c", "최해혁");
        map.put("kor2022000-j2", "김준일");
        System.out.println(map);
        // 가지고 올때는 get으로 가지고 오기 때문에  list 특징과 같다.
//        System.out.println(map.get("kor20220001"));

        /*
            kor2022000-c 학번의 학생의 이름을 김완준으로 바꿔라

         */
        String searchId = "kor2022000-c";

        // 조회
        System.out.println(map.get(searchId));
        // put을 사용하여 값 변경
        if(map.containsKey(searchId)){
            map.put(searchId,"김준완");
        }
        // replace를 통한 값 수정
        map.replace(searchId, "이성욱");
        System.out.println(map);

        // 삭제
        map.remove(searchId);
        System.out.println(map);

        // 키 값을 가지고 있니?
        boolean searchSuccessflag = map.containsKey("kor2022000-j2");

        System.out.println(searchSuccessflag);

        // 밸류 값을 가지고 있니?
        searchSuccessflag = map.containsValue("김준일");
        System.out.println(searchSuccessflag);

        Set<Map.Entry<String, String>> entry =  map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entry.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> e= iterator.next();
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        entry.iterator().forEachRemaining(e -> {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        });

        Set<String> keySet = map.keySet();
        Collection<String> values = map.values();
        System.out.println("keySet : " + keySet);
        System.out.println("values : " + values);
    }
}
