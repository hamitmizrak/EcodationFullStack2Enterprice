package com.hamitmizrak.jsf;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "indexBean")
@ApplicationScoped
public class _01_index {

    private String merhaba;

    public _01_index() {
        this.merhaba="Ben Spring Framework olan CDI Bean";
    }

    public String getMerhaba() {
        return merhaba;
    }

    public _01_index setMerhaba(String merhaba) {
        this.merhaba = merhaba;
        return this;
    }
}
