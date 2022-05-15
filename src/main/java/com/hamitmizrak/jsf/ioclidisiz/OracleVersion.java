package com.hamitmizrak.jsf.ioclidisiz;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "iocli")
@ApplicationScoped
public class OracleVersion {

    //CDI
    @Inject
    private IJavaVersion iJavaVersion;



    //Method
    public String oracleVersionMethod(String oracleData){
        return iJavaVersion.versions(oracleData);
    }
}
