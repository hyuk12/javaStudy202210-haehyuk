package j11_배열.StudentManagement;

public class StudentRepository {

    private Student[] students;

    public StudentRepository() {
        students = new Student[0] ;
    }

    public void addStudent(Student student) {

        int index = indexOfEmpty();

        if (index == -1) {
            index = increaseArray();
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
    private int increaseArray(){
        Student[] tempArray = new Student[students.length + 1];

        for (int i = 0; i < students.length; i++) {
            tempArray[i] = students[i];
        }
        students = tempArray;
        return students.length -1 ; // 마지막에 비어 있는 인덱스의 번호
    }

    public Student[] getStudents(){
        return students;
    }

    public int findStudentByName(String name) {

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getName().equals(name)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public Student getStudent(int index){
        return students[index];
    }

    public Student removeStudent(int index){
        Student student = students[index];
        students[index] = null;
        return student;
    }

    public Student updateStudent(int index, Student updateStudent) {
        Student student = students[index];
        student.updateStudent(updateStudent);
        return student;
    }
}
