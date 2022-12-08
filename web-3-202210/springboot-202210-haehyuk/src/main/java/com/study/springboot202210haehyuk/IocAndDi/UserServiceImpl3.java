package com.study.springboot202210haehyuk.IocAndDi;

import org.springframework.stereotype.Component;

@Component("usi3")
public class UserServiceImpl3 implements UserService{

    @Override
    public void createUser() {
        System.out.println("사용자 등록3");
    }

    @Override
    public void getUser() {
        System.out.println("사용자 조회3");
    }

    @Override
    public void updateUser() {
        System.out.println("사용자 수정3");
    }

    @Override
    public void deleteUser() {
        System.out.println("사용자 삭제3");
    }
}
