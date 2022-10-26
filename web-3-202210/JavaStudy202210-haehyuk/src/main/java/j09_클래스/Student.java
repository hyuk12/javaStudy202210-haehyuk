package j09_클래스;

public class Student {
    String schoolName;
    String name;
    int studentCode;
    int studentYear;







    void increaseStudentYear(int year) {
        studentYear += year;
        if(this.studentYear  > 5){
            System.out.println(year + "학년을 더 하면 " + studentYear
                            + "학년이 되어서 5학년을 넘어 섭니다.");
            System.out.println();
            studentYear -= year;
            return;
        }
        showStudentInfo();
    }

//    void showStudentInfo(){
//        System.out.println("학생의 정보입니다." );
//        System.out.println(this.schoolName);
//        System.out.println(this.name);
//        System.out.println(this.studentCode);
//        System.out.println(this.studentYear);
//    }

    void increaseStudentYear() {
        studentYear++;
        if(studentYear > 5){
            System.out.println("더 이상 학년을 늘릴수 없다.");
            System.out.println();
            studentYear--;
            return;
        }
        showStudentInfo();
    }


    void showStudentInfo(){
        System.out.println("학생의 정보입니다." );
        System.out.println("학교: " +schoolName);
        System.out.println("이름: " +name);
        System.out.println("학번: " +studentCode);
        System.out.println("학년: " +studentYear);
        System.out.println("===========");
    }


}
