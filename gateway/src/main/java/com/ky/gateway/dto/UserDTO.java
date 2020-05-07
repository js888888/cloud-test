package com.ky.gateway.dto;


/**
 * 描述: 用户DTO
 *
 * @Auther: lzx
 * @Date: 2019/7/9 13:57
 */
public class UserDTO {

    private String userName;

    private String password;

    public UserDTO(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
