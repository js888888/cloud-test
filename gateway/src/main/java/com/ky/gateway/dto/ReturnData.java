package com.ky.gateway.dto;

/**
 * 描述:
 *
 * @Auther: lzx
 * @Date: 2019/7/9 13:55
 */
public class ReturnData<T> {

    private int code;

    private String mass;

    private T data;

    public ReturnData(int code, String mass, T data) {
        this.code = code;
        this.mass = mass;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
