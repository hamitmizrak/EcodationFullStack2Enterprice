package com.hamitmizrak.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class _03_JavaVersion2 implements _01_IJavaInterface{
    @Override
    public String versions(String data) {
        return "Sürüm 2: "+data;
    }
}
