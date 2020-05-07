package com.ky.gateway.jwt;

import java.util.List;

/**
 * 描述:jwt 模型
 *
 * @Auther: lzx
 * @Date: 2019/7/9 13:42
 */

public class JwtModel {


    private String userName;

    private List<String> roleIdList;

    public JwtModel() {}

    public JwtModel(String userName, List<String> roleIdList) {
        this.userName = userName;
        this.roleIdList = roleIdList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getRoleIdList() {
        return roleIdList;
    }

    public void setRoleIdList(List<String> roleIdList) {
        this.roleIdList = roleIdList;
    }
}
