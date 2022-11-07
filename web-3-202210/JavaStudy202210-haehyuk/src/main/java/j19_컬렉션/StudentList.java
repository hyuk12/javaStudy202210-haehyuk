package j19_컬렉션;

import java.util.ArrayList;
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

        for (Student student: students){
            if(student.getName().equals(serchName)){
                System.out.println( serchName + " 학생의 학번은 : " + student.getId());
                break;
            }
        }

        int serchId = 20220002;
        for (int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            if (student.getId() == serchId){
                students.remove(i);
                System.out.println(students);
                break;
            }
        }

        for (Student student: students){
            if (student.getId() == serchId){
                students.remove(students.indexOf(student));
                break;
            }
        }

    }
}
