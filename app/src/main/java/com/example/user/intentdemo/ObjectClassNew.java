package com.example.user.intentdemo;

import java.io.Serializable;

/**
 * Created by user on 04-09-2017.
 */

public class ObjectClassNew implements Serializable {

    String name;
    String surName;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
