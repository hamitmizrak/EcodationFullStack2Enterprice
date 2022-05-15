package com.hamitmizrak.alternative.aop;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "aopInterceptor")
@ApplicationScoped
public class _4_AopBean implements Serializable {
    private static final Long serialVersionUID=1L;

    @Inject
    private _2_Login login;

    public String getAopBean(){
        return login.isLoginMethod(" interceptor: yol kesici");
    }


}
