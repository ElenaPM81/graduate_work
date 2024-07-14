package gb.graduate_work.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;


// класс, логирующий действия пользователя (методы с аннотацией TrackUserAction)
    @Aspect // аннотация, показывающая, что данный класс является аспектом
    @Component  // аннотация показывающая, что данный класс является компонентом
    public class LoggingAspect {
        private Logger logger = Logger.getLogger(LoggingAspect.class.getName());  // сооздание переменной для логирования

        public void setLogger(Logger logger) {
            this.logger = logger;
        }// метод, устанавливающий логгер

        @Around("@annotation(TrackUserAction)")  // аннотация, показывающая, что метод отслеживает действие пользователя чеоез


        //
        public Object log(ProceedingJoinPoint joinPoint) throws Throwable {  // метод, отвечающий за логирование
            String methodName = joinPoint.getSignature().getName();  // получение имени метода
            Object [] args = joinPoint.getArgs(); // получение аргументов

            logger.info("Method " + methodName + " was called with parameters " +
                    Arrays.asList(args));  // логирование параметров метода в консоль

            return joinPoint.proceed();  // выполнение метода
        }
    }


