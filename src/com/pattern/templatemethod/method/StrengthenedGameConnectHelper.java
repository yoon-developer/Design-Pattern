package com.pattern.templatemethod.method;

public class StrengthenedGameConnectHelper extends GameConnectHelper {

    @Override
    protected String doSecurity(String string) {
        // 추가 요구 사항
        System.out.println("강화된 알고리즘 이용한 디코드");
        return null;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디 / 암호 확인 과정");
        return true;
    }

    @Override
    protected int authorization(String id) {
        // 추가 요구 사항
        System.out.println("권한을 강화하여 확인");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("접속");
        return null;
    }
}
