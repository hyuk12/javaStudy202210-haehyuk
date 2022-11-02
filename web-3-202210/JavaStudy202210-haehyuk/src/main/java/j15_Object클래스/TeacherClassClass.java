package j15_Object클래스;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherClassClass {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김준일","코리아아이티");
        Teacher teacher2 = new Teacher("김준일","코리아아이티");

        Class t_class1 = teacher1.getClass();
        Class t_class2 = teacher2.getClass();


        System.out.println(t_class1.getName());
        System.out.println(t_class1.getSimpleName());


        Field[] fields = t_class1.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
            System.out.println(fields[i].getType().getSimpleName());
        }

        Method[] methods = t_class1.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
            System.out.println(methods[i].getReturnType().getSimpleName());
            System.out.println(methods[i].getParameterTypes());}

        System.out.println(teacher1.getClass() == teacher2.getClass());
        System.out.println(teacher1 instanceof Teacher);
        System.out.println(teacher1.getClass() == Teacher.class); // 위의 instanceof 와 동작이 동일하다.
        System.out.println(teacher2.getClass() == Teacher.class);

    }
}
