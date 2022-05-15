package com.hamitmizrak.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class _02_JavaVersion1 implements _01_IJavaInterface{
    @Override
    public String versions(String data) {
        return "Sürüm 1: "+data;
    }
}
