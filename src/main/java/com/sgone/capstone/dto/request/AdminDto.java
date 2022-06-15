package com.sgone.capstone.dto.request;

public class AdminDto {

    private String username;
    private String email;
    private String mobile;
    private String password;


    public AdminDto() {}

    public AdminDto(String username,
                    String email,
                    String mobile,
                    String password) {
        this.username = username;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
