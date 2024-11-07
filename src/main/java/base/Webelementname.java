package base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.FIELD)          // Only applies to fields
public @interface Webelementname {
   // String id() default "";          // Unique identifier for the field
    String name() default "";        // Alternative identifier for the field
}

