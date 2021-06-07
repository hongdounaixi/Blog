package com.hxj.entity;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hxj
 * @Date: 2021/06/06/16:42
 * @Description:
 */
public class Type {
    private Integer id;
    private String typename;
    private Integer blogid;
    private Integer blogtitle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Integer getBlogid() {
        return blogid;
    }

    public void setBlogid(Integer blogid) {
        this.blogid = blogid;
    }

    public Integer getBlogtitle() {
        return blogtitle;
    }

    public void setBlogtitle(Integer blogtitle) {
        this.blogtitle = blogtitle;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"typename\":\"")
                .append(typename).append('\"');
        sb.append(",\"blogid\":")
                .append(blogid);
        sb.append(",\"blogtitle\":")
                .append(blogtitle);
        sb.append('}');
        return sb.toString();
    }
}
