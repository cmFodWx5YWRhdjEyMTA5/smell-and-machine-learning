// isComment
package com.ubergeek42.cats;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

@Retention(isNameExpr.isFieldAccessExpr)
@Target({ isNameExpr, isNameExpr, isNameExpr })
public @interface Cat {

    String value() default "isStringConstant";

    boolean linger() default true;

    boolean exit() default true;
}
