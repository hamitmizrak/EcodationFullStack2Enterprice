package com.hamitmizrak.alternative.aop;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.Scanner;

@Interceptor
@_1_InterceptorYolKesici
public class _3_InterceptorYolKesiciAsilIs {

    public boolean isLogin(){
        String defaultEmail="root",defaultPassword="1234";
        String email="root",password="1234";
        if(defaultEmail.equals(email) && defaultPassword.equals(password)){
            System.out.println("Sisteme Giriş yapıldı");
            return false;
        }else{
            System.out.println("Sisteme Giriş YAPILAMADIII");
            return true;
        }
    }

    @AroundInvoke public Object loglama(InvocationContext context){
        System.out.println("İlk Hali: "+context.getMethod().getName());
        //kullanıcı : giriş yapmış mı ?
        _3_InterceptorYolKesiciAsilIs asilIs=new _3_InterceptorYolKesiciAsilIs();
        boolean isLogin=asilIs.isLogin(); //true:önce login olmalı Yol kesici olacak değişkeninimiz
        //jdbc : session ?
        Object isContinue=null; // Eğer yol kesilmezse devam edeceğim

        if(isLogin){
            //Önce sisteme giriş yapsın
            System.out.println("!!! Önce sisteme giriş yapsın" );
            return  null;
        }else{
            try {
                isContinue=context.proceed(); //devam etmesini sağlamak
                System.out.println("Sonraki hali "+isContinue);
            }catch (Exception e){
                e.printStackTrace();
            }
            return isContinue;
        }

    }


}
