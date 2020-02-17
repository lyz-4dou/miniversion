package com.taobao.entity;


public class Order {


    private Integer id;
    private String coms;
    private Double price;
    private Integer uid;

    public Order(Integer id, String coms, Double price, Integer uid) {
        this.id = id;
        this.coms = coms;
        this.price = price;
        this.uid = uid;
    }

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
