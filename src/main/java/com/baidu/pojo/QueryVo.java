package com.baidu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class QueryVo {
    private String onumber;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
    private Date createtime;
    private Integer price;

    public QueryVo(String onumber, Date createtime, Integer price) {
        this.onumber = onumber;
        this.createtime = createtime;
        this.price = price;
    }

    public QueryVo() {
    }

    @Override
    public String toString() {
        return "QueryVo{" +
                "onumber='" + onumber + '\'' +
                ", createtime=" + createtime +
                ", price=" + price +
                '}';
    }

    public String getOnumber() {
        return onumber;
    }

    public void setOnumber(String onumber) {
        this.onumber = onumber;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
