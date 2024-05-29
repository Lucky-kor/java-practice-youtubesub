package com.codestates.seb.youtubesub;

import java.util.Scanner;

public class YoutubeSub {
    //TODO:
    private static final UserData admin = new UserData("admin", "1234");

    public static void main(String[] args) {
        Validation valid = new Validation();
        // 사용자의 입력을 받기위한 Scanner s 객체 생성
        Scanner sc = new Scanner(System.in);
        // 시스템 로그인을 위한 아이디 및 비밀번호 입력 시스템을 정의 합니다.
        String userId;
        String password;

        String adminId = admin.getUserId(); // 어드민 아이디 검증을 위한 변수
        String adminPassword = admin.getPassword(); // 어드민 아이디 검증을 위한 변수

        while (true) {
            System.out.print("[시스템] 유튜브 계정의 아이디를 입력하세요 {Ex - admin} : ");
            userId = sc.nextLine();

            System.out.print("[시스템] 유튜브 계정의 비밀번호를 입력하세요{Ex - 0000} : ");
            password = sc.nextLine();

            // 사용자 입력에 따른 로그인 및 경고 문구 출력

            if (adminId.equals(userId) && adminPassword.equals(password)) {
                System.out.printf("[안내] 안녕하세요 %s님. \n", userId);
                break;
            } else if (valid.validationToUser(userId, password)) {
                System.out.printf("[안내] 안녕하세요 %s님. \n", userId);
                break;
            } else System.out.println("[경고] 유튜브 계정의 아이디 및 비밀번호를 다시 확인해 주세요.");
        }

        System.out.println("[안내] 유튜브 영상의 자막을 생성해 주세요.");
        String str = sc.nextLine();

        str = valid.filter(str); // 자막 필터링

        valid.getBadWords(); // 금칙어 리스트

        System.out.println("[알림] 자막 순화 프로그램 결과입니다.");
        System.out.println(str);

        System.out.println("[안내] 프로그램을 종료합니다.");
    }
}