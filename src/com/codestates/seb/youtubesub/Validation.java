package com.codestates.seb.youtubesub;

import java.util.Arrays;

public class Validation {
    String[] badWords = new String[]{"킹", "시발", "꺼저", "미친"};
    String[] kindWords = new String[]{"사랑", "하트", "♥", "당신은 사랑받기위해 태어난 사람"};

    public boolean validationToUser(String currentUserId, String currentPassword) {
        UserData[] dummyData = new UserData().getDummyData();

        for (int i = 0; i < dummyData.length; i++) {
            String userId = dummyData[i].getUserId();
            String password = dummyData[i].getPassword();
            if (currentUserId.equals(userId) && currentPassword.equals(password)) {
                return true;
            }
        }
        return false;
    }

    public String filter(String str) {
        // 금칙어를 대체어로 전환하는 과정은 다음과 같습니다.
        // 1. 금칙어 배열에서 하나씩 불러옵니다.

        // 2. 해당 금칙어가 자막에 포함되어 있는지 확인합니다.

        for (int i = 0; i < badWords.length; i++) {
            str = str.replace(badWords[i], kindWords[i]);
        }
        // 3. 만약 포함되어 있다면 replace()를 통해 금칙어와 대체어를 전환하여 저장합니다.

        return str;
    }

    public void getBadWords() {
        System.out.println("========================================");
        System.out.println("[알림] 프로그램의 금칙어 리스트입니다.");
        System.out.println(Arrays.toString(badWords));
        System.out.println("========================================");
    }

}
