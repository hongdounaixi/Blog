package com.hxj.entity;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hxj
 * @Date: 2021/06/06/17:56
 * @Description:
 */
public class Message {
    private Integer id;
    private String nickname;
    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"nickname\":\"")
                .append(nickname).append('\"');
        sb.append(",\"message\":\"")
                .append(message).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
