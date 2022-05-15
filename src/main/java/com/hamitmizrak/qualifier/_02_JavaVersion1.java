package com.hamitmizrak.qualifier;


import javax.enterprise.inject.Default;

@Default
public class _02_JavaVersion1 implements _01_IJavaInterface {
    @Override
    public String versions(String data) {
        return "Default Sürüm 1 : "+data;
    }
}
