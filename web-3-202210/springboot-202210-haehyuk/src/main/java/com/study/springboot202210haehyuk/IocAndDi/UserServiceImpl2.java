package com.study.springboot202210haehyuk.IocAndDi;

import org.springframework.stereotype.Component;

@Component("usi2")
public class UserServiceImpl2 implements UserService{

    @Override
    public void createUser() {
        System.out.println("사용자 등록2");
    }

    @Override
    public void getUser() {
        System.out.println("사용자 조회2");
    }

    @Override
    public void updateUser() {
        System.out.println("사용자 수정2");
    }

    @Override
    public void deleteUser() {
        System.out.println("사용자 삭제2");
    }
}
