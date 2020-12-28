package org.sid.contrats.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Logging {

    private long t1,t2;
    private Logger logger=Logger.getLogger(Logging.class.getName());

    public Logging() throws Exception{
        logger.addHandler(new FileHandler("log.xml"));
        logger.setUseParentHandlers(false);
    }

    @Around(value = "@annotation(MyLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        t1=System.currentTimeMillis();
        logger.info("Avant "+ joinPoint.getSignature());
        Object object=joinPoint.proceed();
        logger.info("Après "+ joinPoint.getSignature());
        t2=System.currentTimeMillis();
        logger.info("Durée : "+ (t2-t1)+"ms");
        return object;
    }
}
