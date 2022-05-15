package com.hamitmizrak.qualifier;

import javax.enterprise.inject.Alternative;

@QualifierMultiple
public class _03_JavaVersion2 implements _01_IJavaInterface {
    @Override
    public String versions(String data) {
        return " Qualifier Sürüm 2: "+data;
    }
}
