package com.lyd.domain;


public class Linkman {
    private Long   link_id;
    private String link_gender;
    private String link_phone;
    private String link_mobile;
    private String link_name;
    private String link_qq;
    private String link_position;
    private String link_memo;
    private String link_cust_id;
    private String link_email;

    //一个联系人只对应一个客户
    private Customer customer;

    public Long getLink_id() {
        return link_id;
    }

    public void setLink_id(Long link_id) {
        this.link_id = link_id;
    }

    public String getLink_gender() {
        return link_gender;
    }

    public void setLink_gender(String link_gender) {
        this.link_gender = link_gender;
    }

    public String getLink_phone() {
        return link_phone;
    }

    public void setLink_phone(String link_phone) {
        this.link_phone = link_phone;
    }

    public String getLink_mobile() {
        return link_mobile;
    }

    public void setLink_mobile(String link_mobile) {
        this.link_mobile = link_mobile;
    }

    public String getLink_name() {
        return link_name;
    }

    public void setLink_name(String link_name) {
        this.link_name = link_name;
    }

    public String getLink_qq() {
        return link_qq;
    }

    public void setLink_qq(String link_qq) {
        this.link_qq = link_qq;
    }

    public String getLink_position() {
        return link_position;
    }

    public void setLink_position(String link_position) {
        this.link_position = link_position;
    }

    public String getLink_memo() {
        return link_memo;
    }

    public void setLink_memo(String link_memo) {
        this.link_memo = link_memo;
    }

    public String getLink_cust_id() {
        return link_cust_id;
    }

    public void setLink_cust_id(String link_cust_id) {
        this.link_cust_id = link_cust_id;
    }

    public String getLink_email() {
        return link_email;
    }

    public void setLink_email(String link_email) {
        this.link_email = link_email;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Linkman{" +
                "link_id=" + link_id +
                ", link_gender='" + link_gender + '\'' +
                ", link_phone='" + link_phone + '\'' +
                ", link_mobile='" + link_mobile + '\'' +
                ", link_name='" + link_name + '\'' +
                ", link_qq='" + link_qq + '\'' +
                ", link_position='" + link_position + '\'' +
                ", link_memo='" + link_memo + '\'' +
                ", link_cust_id='" + link_cust_id + '\'' +
                ", link_email='" + link_email + '\'' +
                ", customer=" + customer +
                '}';
    }
}
