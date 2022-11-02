package j15_Object클래스;

import java.util.Objects;

public class Teacher {

    private String name;
    private String schoolName;

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

//    @Override
//    public boolean equals(Object obj) {
////        if(this == obj) return true;
////        if (obj == null) return false;
////        if (getClass() != obj.getClass()) return false;
////
////        Teacher other = (Teacher) obj;
////        return Objects.equals(name, other.name)
////                && Objects.equals(schoolName, other.schoolName);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(schoolName, teacher.schoolName);
    }

    // 안의 값으로만 비교를 한다. 패키지가 다르건 클래스가 다르건 안의 값이 같다면 동일한 해쉬코드값을 부여한다.
    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
