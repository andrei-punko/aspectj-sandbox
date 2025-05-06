package by.andd3dfx.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.io.StringWriter;

@Aspect
public class CustomUserAspect {

    private static final StringWriter writer = new StringWriter();

    @Before("execution(* by.andd3dfx.dto.User.printHello(..))")
    public void beforePrintHello() {
        writer.write("BEFORE printHello() method call");
    }

    @After("execution(* by.andd3dfx.dto.User.printHello(..))")
    public void afterPrintHello() {
        writer.append("AFTER printHello() method call");
    }

    @Around("execution(* by.andd3dfx.dto.User.setAge(..)) && args(value)")
    public void aroundPrintHello(ProceedingJoinPoint point, Integer value) throws Throwable {
        writer.append("AROUND setAge() method call - first part");
        writer.append("Parameter is " + value);

        point.proceed();

        writer.append("AROUND setAge() method call - second part");
    }

    @Pointcut("execution(* by.andd3dfx.dto.User.setName(String))")
    public void setNamePointcut() {}

    @Before("setNamePointcut()")
    public void beforeSetName() {
        writer.append("BEFORE setName() method call");
    }

    public static StringWriter getWriter() {
        return writer;
    }
}
