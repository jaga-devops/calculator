package com.leszko.calculator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Calculation {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String a;
    private String b;
    private String result;
    private Timestamp createdAt;

    protected Calculation() {}

    public Calculation(String a, String b, String result, Timestamp createdAt) {
        this.a = a;
        this.b = b;
        this.result = result;
        this.createdAt = createdAt;
    }
}
