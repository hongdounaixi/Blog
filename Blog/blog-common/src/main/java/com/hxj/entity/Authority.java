package com.hxj.entity;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hxj
 * @Date: 2021/06/06/23:15
 * @Description:
 */
public class Authority {
    private Integer id;
    private Integer roleid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"roleid\":")
                .append(roleid);
        sb.append('}');
        return sb.toString();
    }
}
