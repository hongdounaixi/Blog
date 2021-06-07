package com.hxj.entity;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hxj
 * @Date: 2021/06/06/17:18
 * @Description:
 */
public class Count {
    private Integer id;
    private Integer blogid;
    private Integer clicknumber;
    private Integer contentnumber;

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

    public Integer getClicknumber() {
        return clicknumber;
    }

    public void setClicknumber(Integer clicknumber) {
        this.clicknumber = clicknumber;
    }

    public Integer getContentnumber() {
        return contentnumber;
    }

    public void setContentnumber(Integer contentnumber) {
        this.contentnumber = contentnumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"blogid\":")
                .append(blogid);
        sb.append(",\"clicknumber\":")
                .append(clicknumber);
        sb.append(",\"contentnumber\":")
                .append(contentnumber);
        sb.append('}');
        return sb.toString();
    }
}
