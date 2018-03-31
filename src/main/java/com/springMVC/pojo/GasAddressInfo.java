package com.springMVC.pojo;

import java.io.Serializable;

public class GasAddressInfo implements Serializable {
    private String user_ID_card;
    private String user_gas_card_number;
    private String user_address;
    private String user_gas_burner_brand;
    private String user_gas_burner_type;
    private String postcode;

    public GasAddressInfo() {
    }

    public GasAddressInfo(String user_ID_card, String user_gas_card_number, String user_address, String user_gas_burner_brand, String user_gas_burner_type, String postcode) {
        this.user_ID_card = user_ID_card;
        this.user_gas_card_number = user_gas_card_number;
        this.user_address = user_address;
        this.user_gas_burner_brand = user_gas_burner_brand;
        this.user_gas_burner_type = user_gas_burner_type;
        this.postcode = postcode;
    }

    public String getUser_ID_card() {
        return user_ID_card;
    }

    public String getUser_gas_card_number() {
        return user_gas_card_number;
    }

    public String getUser_address() {
        return user_address;
    }

    public String getUser_gas_burner_brand() {
        return user_gas_burner_brand;
    }

    public String getUser_gas_burner_type() {
        return user_gas_burner_type;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setUser_ID_card(String user_ID_card) {
        this.user_ID_card = user_ID_card;
    }

    public void setUser_gas_card_number(String user_gas_card_number) {
        this.user_gas_card_number = user_gas_card_number;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public void setUser_gas_burner_brand(String user_gas_burner_brand) {
        this.user_gas_burner_brand = user_gas_burner_brand;
    }

    public void setUser_gas_burner_type(String user_gas_burner_type) {
        this.user_gas_burner_type = user_gas_burner_type;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}


