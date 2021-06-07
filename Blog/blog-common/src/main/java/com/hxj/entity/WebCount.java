package com.hxj.entity;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hxj
 * @Date: 2021/06/06/17:48
 * @Description:
 */
public class WebCount {
    private Integer id;
    private Integer usernumber;//站点总人数
    private Integer browsenumber;//浏览次数

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(Integer usernumber) {
        this.usernumber = usernumber;
    }

    public Integer getBrowsenumber() {
        return browsenumber;
    }

    public void setBrowsenumber(Integer browsenumber) {
        this.browsenumber = browsenumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"usernumber\":")
                .append(usernumber);
        sb.append(",\"browsenumber\":")
                .append(browsenumber);
        sb.append('}');
        return sb.toString();
    }
}
