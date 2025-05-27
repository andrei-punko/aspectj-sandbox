package by.andd3dfx.aspect;

import by.andd3dfx.logger.LogsCollector;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CustomUserAspect {

    @Before("execution(* by.andd3dfx.dto.User.printHello(..))")
    public void beforePrintHello() {
        LogsCollector.append("BEFORE printHello() method call");
    }

    @After("execution(* by.andd3dfx.dto.User.printHello(..))")
    public void afterPrintHello() {
        LogsCollector.append("AFTER printHello() method call");
    }

    @Around("execution(* by.andd3dfx.dto.User.setAge(..)) && args(value)")
    public void aroundPrintHello(ProceedingJoinPoint point, Integer value) throws Throwable {
        LogsCollector.append("AROUND setAge() method call - first part");
        LogsCollector.append("Parameter is " + value);

        point.proceed();

        LogsCollector.append("AROUND setAge() method call - second part");
    }

    @Pointcut("execution(* by.andd3dfx.dto.User.setName(String))")
    public void setNamePointcut() {
    }

    @Before("setNamePointcut()")
    public void beforeSetName() {
        LogsCollector.append("BEFORE setName() method call");
    }
}
