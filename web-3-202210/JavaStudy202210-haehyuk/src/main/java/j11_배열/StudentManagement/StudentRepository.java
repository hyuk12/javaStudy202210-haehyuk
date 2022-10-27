package j11_배열.StudentManagement;

public class StudentRepository {

    private Student[] students;

    public StudentRepository() {
        students = new Student[0] ;
    }

    public void addStudent(Student student) {

        int index = indexOfEmpty();

        if (index == -1) {
            index = inCreaseArray();
        }
        students[index] = student;
    }

    private int indexOfEmpty() {
        for(int i = 0; i < students.length; i++) {
            if(students[i] == null) {
                return i;
            }
        }
        return -1;
    }
    private int inCreaseArray(){
        Student[] tempArray = new Student[students.length + 1];

        for (int i = 0; i < students.length; i++) {
            tempArray[i] = students[i];
        }
        students = tempArray;
        return tempArray.length -1 ; // 마지막에 비어 있는 인덱스의 번호
    }
}
