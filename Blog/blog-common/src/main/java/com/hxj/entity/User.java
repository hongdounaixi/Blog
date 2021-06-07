package com.hxj.entity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hxj
 * @Date: 2021/06/06/16:14
 * @Description:
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private String email;
    private Date created;
    private Integer valid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"username\":\"")
                .append(username).append('\"');
        sb.append(",\"password\":\"")
                .append(password).append('\"');
        sb.append(",\"nickname\":\"")
                .append(nickname).append('\"');
        sb.append(",\"phone\":\"")
                .append(phone).append('\"');
        sb.append(",\"email\":\"")
                .append(email).append('\"');
        sb.append(",\"created\":\"")
                .append(created).append('\"');
        sb.append(",\"valid\":")
                .append(valid);
        sb.append('}');
        return sb.toString();
    }
}
