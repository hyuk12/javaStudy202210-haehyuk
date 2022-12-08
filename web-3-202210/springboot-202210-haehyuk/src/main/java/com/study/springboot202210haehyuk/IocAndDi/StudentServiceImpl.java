package com.study.springboot202210haehyuk.IocAndDi;

import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentService{
    @Override
    public void printStudentInfo(Student student) {
        System.out.println("학번 : " + student.getStudentId());
        System.out.println("이름 : " + student.getStudentName());
    }
}
