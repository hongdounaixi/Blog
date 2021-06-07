package com.hxj.entity;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hxj
 * @Date: 2021/06/06/16:45
 * @Description:
 */
public class Tag {
    private Integer id;
    private String tagname;
    private Integer blogid;
    private String blogtitle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public Integer getBlogid() {
        return blogid;
    }

    public void setBlogid(Integer blogid) {
        this.blogid = blogid;
    }

    public String getBlogtitle() {
        return blogtitle;
    }

    public void setBlogtitle(String blogtitle) {
        this.blogtitle = blogtitle;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"tagname\":\"")
                .append(tagname).append('\"');
        sb.append(",\"blogid\":")
                .append(blogid);
        sb.append(",\"blogtitle\":\"")
                .append(blogtitle).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
