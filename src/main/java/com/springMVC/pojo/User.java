package com.springMVC.pojo;


public class User {
    private String user_ID_card;
    private Double user_balance;
    private String user_name;
    private String user_password;
    private String user_phone;

    public User() {
    }

    public User(String user_ID_card, Double user_balance, String user_name, String user_password, String user_phone) {
        this.user_ID_card = user_ID_card;
        this.user_balance = user_balance;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_phone = user_phone;
    }

    public void setUser_ID_card(String user_ID_card) {
        this.user_ID_card = user_ID_card;
    }

    public void setUser_balance(Double user_balance) {
        this.user_balance = user_balance;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_ID_card() {
        return user_ID_card;
    }

    public Double getUser_balance() {
        return user_balance;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public String getUser_phone() {
        return user_phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_ID_card='" + user_ID_card + '\'' +
                ", user_balance=" + user_balance +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_phone='" + user_phone + '\'' +
                '}';
    }
}