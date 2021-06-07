package com.hxj.entity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hxj
 * @Date: 2021/06/06/16:50
 * @Description:
 */
public class Content {
    private Integer id;
    private Integer blogid;
    private Date remarktime;
    private String ip;
    private String content;
    private String nickname;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBlogid() {
        return blogid;
    }

    public void setBlogid(Integer blogid) {
        this.blogid = blogid;
    }

    public Date getRemarktime() {
        return remarktime;
    }

    public void setRemarktime(Date remarktime) {
        this.remarktime = remarktime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"blogid\":")
                .append(blogid);
        sb.append(",\"remarktime\":\"")
                .append(remarktime).append('\"');
        sb.append(",\"ip\":\"")
                .append(ip).append('\"');
        sb.append(",\"content\":\"")
                .append(content).append('\"');
        sb.append(",\"nickname\":\"")
                .append(nickname).append('\"');
        sb.append(",\"status\":")
                .append(status);
        sb.append('}');
        return sb.toString();
    }
}
