package j19_컬렉션;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(20220001, "java"));
        students.add(new Student(20220002, "python"));
        students.add(new Student(20220003, "GoRang"));
        students.add(new Student(20220004, "CRang"));
        students.add(new Student(20220005, "Kotlin"));
        students.add(new Student(20220006, "html"));

        System.out.println(students.get(2).getId());
        String serchName = "GoRang";
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getName().equals(serchName)) {
                int studentId = student.getId();
                System.out.println(serchName + " 학생의 학번은: " + studentId);
                break;
            }
        }

        for (Student student : students) {
            if (student.getName().equals(serchName)) {
                System.out.println(serchName + " 학생의 학번은 : " + student.getId());
                break;
            }
        }

        int serchId = 20220002;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId() == serchId) {
                students.remove(i);
                System.out.println(students);
                break;
            }
        }

        for (Student student : students) {
            if (student.getId() == serchId) {
                students.remove(students.indexOf(student));
                break;
            }
        }
        /*
            id = 20220003학생을 찾아서 그학생의 이름이 GoRang 이면  goRang으로 바꿔라
         */

        serchId = 20220003;
        for (Student student : students) {

            if (student.getId() == serchId && student.getName().equals("GoRang")) {
                student.setName("goRang");
                break;
            }
        }
        System.out.println(students);

        serchId = 20220004;
        /*
         CRang을 cRang으로 변경 iterator 사용
         */

        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if (student.getId() == serchId) {
                student.setName("cRang");
                break;
            }
        }
        System.out.println(students);
        // 학생 정보를 리스트에 받는데 인덱스가 뒤에서부터 앞으로 들어오게 만들기

        List<Student> reverseStudents = new ArrayList<>();

//        serchId = 20220006;
//        for (int i = 0; i < students.size(); i++) {
//           reverseStudents.add(students.get(students.size()-1-i));
//        }

        for (Student student : students) {
            reverseStudents.add(0,student);
        }
        System.out.println(reverseStudents);

        Collections.reverse(reverseStudents);
        System.out.println(reverseStudents);

        /*
            idList
            nameList

            id 리스트엔 id 값만
            name 리스트엔 name 값만 주입
         */
        List<Integer> idList = new ArrayList<>();
        List<String>nameList = new ArrayList<>();

        for (Student student : students) {
            idList.add(student.getId());
            nameList.add(student.getName());
        }



        System.out.println(idList);
        System.out.println(nameList);

        students.clear();
        System.out.println(students);

        // 거꾸로 아이디리스트와 네임리스트에서 추출한 정보를 학생 리스트에 넣어주기
        for (int i = 0; i < idList.size(); i++) {
         Student student = new Student(idList.get(i), nameList.get(i));
         students.add(student);
        }

        System.out.println(students);
    }

}
