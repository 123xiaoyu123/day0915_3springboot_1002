package com.baidu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
@Component
//订单类
//绑定表
@Table(name = "orders")
public class Orders implements Serializable {
    @Id//主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer oid;
    private String onumber;
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
    private Date createtime;
    private Integer price;
    private String note;
    private Integer uid;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oid +
                ", onumber='" + onumber + '\'' +
                ", createtime=" + createtime +
                ", price=" + price +
                ", note='" + note + '\'' +
                ", uid=" + uid +
                '}';
    }
}
