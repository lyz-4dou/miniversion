package com.taobao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @Column(name = "o_id")
    private Integer id;
    @Column(name = "o_coms")
    private String coms;
    @Column(name = "o_price")
    private Double price;
    @Column(name = "o_userid")
    private Integer uid;

    public Order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComs() {
        return coms;
    }

    public void setComs(String coms) {
        this.coms = coms;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
