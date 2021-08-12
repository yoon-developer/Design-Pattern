package com.pattern.templatemethod.method;

public class DefaultGameConnectHelper extends GameConnectHelper {

    @Override
    protected String doSecurity(String string) {
        System.out.println("디코드");
        return null;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디 / 암호 확인 과정");
        return true;
    }

    @Override
    protected int authorization(String id) {
        System.out.println("권한 확인");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("접속");
        return null;
    }
}
