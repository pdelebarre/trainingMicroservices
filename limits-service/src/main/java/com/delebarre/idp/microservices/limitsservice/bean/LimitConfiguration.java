package com.delebarre.idp.microservices.limitsservice.bean;

import lombok.Data;

@Data
public class LimitConfiguration {
    private int minimum;
    private  int maximum;

       protected LimitConfiguration(){

       }

    public LimitConfiguration(int maximum, int minimum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }
}
