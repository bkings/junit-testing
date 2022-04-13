package com.bjr.models;

/**
 * @author bkings
 * @version 1.0.0
 * @since 2022-04-13 07:41
 */

public class Owner extends Person {
    private String number;
    private String address;

    public Owner(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
