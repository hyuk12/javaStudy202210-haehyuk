package com.study.springboot202210haehyuk.IocAndDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ResponseBody
    @GetMapping("/student")
    public String printStudent() {
        Student student = Student.builder()
                .studentId(2001)
                .studentName("김경민")
                .build();

        studentService.printStudentInfo(student);
        return null;
    }
}
