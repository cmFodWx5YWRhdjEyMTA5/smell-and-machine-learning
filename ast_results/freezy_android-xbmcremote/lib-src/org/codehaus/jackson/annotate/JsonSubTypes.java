// isComment
package org.codehaus.jackson.annotate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * isComment
 */
@Target({ isNameExpr.isFieldAccessExpr })
@Retention(isNameExpr.isFieldAccessExpr)
@JacksonAnnotation
public @interface JsonSubTypes {

    /**
     * isComment
     */
    public Type[] value();

    /**
     * isComment
     */
    public @interface Type {

        /**
         * isComment
         */
        public Class<?> value();

        /**
         * isComment
         */
        public String name() default "isStringConstant";
    }
}
