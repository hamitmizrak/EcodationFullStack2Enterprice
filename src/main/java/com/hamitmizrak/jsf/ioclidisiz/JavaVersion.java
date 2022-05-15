package com.hamitmizrak.jsf.ioclidisiz;

public class JavaVersion implements IJavaVersion {

    @Override
    public String versions(String data) {
        return "Sürüm: "+data;
    }
}
