package com.hamitmizrak.qualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="qualifier")
@ApplicationScoped
public class _04_OracleVersion {

    @Inject
    _01_IJavaInterface javaInterface;

//    @Inject
//    @QualifierMultiple
//    _01_IJavaInterface javaInterface;

    public String chooiseVersion(String data){
        return javaInterface.versions(data);
    }

}
