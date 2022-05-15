package com.hamitmizrak.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="alternative")
@ApplicationScoped
public class _04_OracleVersion {

    @Inject
    _01_IJavaInterface javaInterface;

    public String chooiseVersion(String data){
        return javaInterface.versions(data);
    }

}
