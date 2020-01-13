package com.ot.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Permssion {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
