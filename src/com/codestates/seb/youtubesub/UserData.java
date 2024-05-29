package com.codestates.seb.youtubesub;

public class UserData {
    private String userId;
    private String password;

    public UserData() {
    }

    public UserData(String userId, String password) {
        this.userId = userId;  // 인수를 userId 필드에 할당합니다.
        this.password = password;  // 인수를 password 필드에 할당합니다.
    }

    public String getUserId() {
        return this.userId;
    }

    public String getPassword() {
        return this.password;
    }

    public UserData[] getDummyData() {
        UserData user1 = new UserData("jungkyun", "1234");
        UserData user2 = new UserData("charles", "1234");
        UserData user3 = new UserData("minsu", "1234");
        UserData user4 = new UserData("youngsu", "1234");
        UserData user5 = new UserData("chulsu", "1234");

        return new UserData[]{user1, user2, user3, user4, user5};
    }
}
