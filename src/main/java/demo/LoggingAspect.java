package demo;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class LoggingAspect {

    //@Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(){
        System.out.print("Before Loggers...");
    }

    //@After("execution(* *.*.checkout(..))")
    public void afterLogger(){
        System.out.print("After Loggers...");
    }

}
