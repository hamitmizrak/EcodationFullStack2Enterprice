package com.hamitmizrak.jsf.iocsizdisiz;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "iocsiz")
@ApplicationScoped
public class OracleVersion {

    //disiz
    private JavaVersion javaVersion;

    //parametresiz constructor
    public OracleVersion() {
        javaVersion=new JavaVersion();
    }

    //Method
    public String oracleVersionMethod(String oracleData){
        return javaVersion.versions(oracleData);
    }
}
