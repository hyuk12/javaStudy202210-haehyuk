package j19_컬렉션;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;

public class StudentSet  {



    public static void main(String[] args) {
        Set<Student> students = new HashSet<Student>();
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경효"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));

        /*
            1. 김혜진 학생의 학번을 출력하세요.
            2. 20220004 학번을 가진 학생의 이름을 설민수로 변경하세요.
            3. 20220001 학번이 존재하면 해당 학생을 삭제하세요. > removeAll


            set -> list 로 변환
            해당 list를 학번 순서에 맞게 정렬하시오.
         */

        // 1번 문제
        String searchName = "김혜진";
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().equals(searchName)) {
                System.out.println(searchName + "학생의 학번은: " + student.getId());
                break;
            }
        }

        // 2번 문제
        int searchId = 20220004;
        for (Student student : students) {
            if (student.getId() == searchId) {
                student.setName("설민수");
                break;
            }
        }
        System.out.println(students);

        // 3번 문제
        searchId = 20220001;

        for (Student student : students) {
            if (student.getId() == searchId) {
                students.remove(student);
                break;
            }
        }

        System.out.println(students);

        // 4 set을 list로 변환하고 id값 순서대로 넣기

        students.add(new Student(20220001, "김준일"));


        List<Student> studentList = new ArrayList<>();



        searchId = 20220000;

        for (int i = 0; i < students.size() ; i++) {
            searchId++;
            for (Student student : students) {
                if (student.getId() == searchId) {
                    studentList.add(student);
                }
            }
        }

        System.out.println(studentList);

    }
}

