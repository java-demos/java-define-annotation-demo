package demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface ValueCheck {
    Mode value() default Mode.NoCheck;
}

enum Mode {
    NoCheck, NotNull, NotEmpty
}
