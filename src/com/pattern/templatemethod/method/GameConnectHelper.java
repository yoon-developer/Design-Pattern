package com.pattern.templatemethod.method;

public abstract class GameConnectHelper {

    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String id);
    protected abstract String connection(String info);

    // 템플릿 메소드
    public String requestConnection(String encodedInfo) {
        // 보안 작업 -> 암호화 된 문자열을 복호화
        String decodedInfo = doSecurity(encodedInfo);

        String id = "aaa";
        String password = "bbb";

        // 인증 과정
        if (!authentication(id, password)) {
            throw new Error("아이디 암호 불일치");
        }

        // 권한 과정
        int authorization = authorization(id);
        switch (authorization) {
            case -1:
                throw new Error("셧다운");
            case 0: // 게임 매니저
                break;
            case 1: // 유료 회원
                break;
            case 2: // 무료 회원
                break;
            case 3: // 권한 없음
                break;
            default: // 기타 사항
                break;

        }

        return connection(decodedInfo);
    }

}
