// isComment
package org.codehaus.jackson.annotate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * isComment
 */
@Target({ isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr })
@Retention(isNameExpr.isFieldAccessExpr)
@JacksonAnnotation
public @interface JsonIgnore {

    /**
     * isComment
     */
    boolean value() default true;
}
