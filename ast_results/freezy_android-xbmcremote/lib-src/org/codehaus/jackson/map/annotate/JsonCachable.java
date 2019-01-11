// isComment
package org.codehaus.jackson.map.annotate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.codehaus.jackson.annotate.JacksonAnnotation;

/**
 * isComment
 */
@Target({ isNameExpr.isFieldAccessExpr })
@Retention(isNameExpr.isFieldAccessExpr)
@JacksonAnnotation
public @interface JsonCachable {

    /**
     * isComment
     */
    boolean value() default true;
}
