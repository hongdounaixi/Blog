package com.hxj.entity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hxj
 * @Date: 2021/06/06/16:28
 * @Description:
 */
public class Blog {
    private Integer id;
    private String title;
    private String content;
    private Date created;
    private Date updated;
    private String type;
    private String tags;
    private Integer allowcontent;
    private String pic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getAllowcontent() {
        return allowcontent;
    }

    public void setAllowcontent(Integer allowcontent) {
        this.allowcontent = allowcontent;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"title\":\"")
                .append(title).append('\"');
        sb.append(",\"content\":\"")
                .append(content).append('\"');
        sb.append(",\"created\":\"")
                .append(created).append('\"');
        sb.append(",\"updated\":\"")
                .append(updated).append('\"');
        sb.append(",\"type\":\"")
                .append(type).append('\"');
        sb.append(",\"tags\":\"")
                .append(tags).append('\"');
        sb.append(",\"allowcontent\":")
                .append(allowcontent);
        sb.append(",\"pic\":\"")
                .append(pic).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
