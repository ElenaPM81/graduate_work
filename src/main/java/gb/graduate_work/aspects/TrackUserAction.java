package gb.graduate_work.aspects;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
// интерфейс который определяет аннотацию для логирования действия пользователя
@Retention(RetentionPolicy.RUNTIME) // показывает, что аннотация может быть использована во время выполнения
@Target(ElementType.METHOD)  // показывает, что аннотация может использоваться только в методах
public @interface TrackUserAction {// аннотация для логирования действия пользователя

}
