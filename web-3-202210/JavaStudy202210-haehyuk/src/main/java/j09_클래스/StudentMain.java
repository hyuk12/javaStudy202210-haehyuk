package j09_클래스;

public class StudentMain {

    public static void main(String[] args) {

        Student CLang = new Student();
        Student Kotlin = new Student();



        CLang.schoolName = "서울 대학교";
        CLang.name = "c언어";
        CLang.studentCode = 20122111;
        CLang.studentYear = 1;





        Kotlin.schoolName = "서울 대학교";
        Kotlin.name = "코틀린";
        Kotlin.studentCode = 20122111;
        Kotlin.studentYear = 1;

        Kotlin.increaseStudentYear(5);
        CLang.increaseStudentYear(3);



//        for(int i = 0; i < 10; i++){
//            CLang.increaseStudentYear();
//            System.out.println("=======");
//            Kotlin.increaseStudentYear();
//        }

    }
}
