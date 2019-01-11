// isComment
package org.codehaus.jackson.map.annotate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.codehaus.jackson.annotate.JacksonAnnotation;
import org.codehaus.jackson.map.JsonSerializer;

/**
 * isComment
 */
@Target({ isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr })
@Retention(isNameExpr.isFieldAccessExpr)
@JacksonAnnotation
public @interface JsonSerialize {

    /**
     * isComment
     */
    public Class<? extends JsonSerializer<?>> using() default JsonSerializer.None.class;

    /**
     * isComment
     */
    public Class<?> as() default NoClass.class;

    /**
     * isComment
     */
    public Typing typing() default isNameExpr.isFieldAccessExpr;

    /**
     * isComment
     */
    public Inclusion include() default isNameExpr.isFieldAccessExpr;

    /**
     * isComment
     */
    public enum Inclusion {

        /**
         * isComment
         */
        ALWAYS,
        /**
         * isComment
         */
        NON_NULL,
        /**
         * isComment
         */
        NON_DEFAULT
    }

    /**
     * isComment
     */
    public enum Typing {

        /**
         * isComment
         */
        DYNAMIC,
        /**
         * isComment
         */
        STATIC
    }
}
