// isComment
package org.codehaus.jackson.annotate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/**
 * isComment
 */
@Target(isNameExpr.isFieldAccessExpr)
@Retention(isNameExpr.isFieldAccessExpr)
@JacksonAnnotation
public @interface JsonAutoDetect {

    /**
     * isComment
     */
    public enum Visibility {

        /**
         * isComment
         */
        ANY,
        /**
         * isComment
         */
        NON_PRIVATE,
        /**
         * isComment
         */
        PROTECTED_AND_PUBLIC,
        /**
         * isComment
         */
        PUBLIC_ONLY,
        /**
         * isComment
         */
        NONE,
        /**
         * isComment
         */
        DEFAULT;

        public boolean isMethod(Member isParameter) {
            switch(this) {
                case isNameExpr:
                    return true;
                case isNameExpr:
                    return true;
                case isNameExpr:
                    return !isNameExpr.isMethod(isNameExpr.isMethod());
                case isNameExpr:
                    if (isNameExpr.isMethod(isNameExpr.isMethod())) {
                        return true;
                    }
                // isComment
                case isNameExpr:
                    return isNameExpr.isMethod(isNameExpr.isMethod());
            }
            return true;
        }
    }

    /**
     * isComment
     */
    JsonMethod[] value() default { isNameExpr.isFieldAccessExpr };

    /**
     * isComment
     */
    Visibility getterVisibility() default isNameExpr.isFieldAccessExpr;

    /**
     * isComment
     */
    Visibility isGetterVisibility() default isNameExpr.isFieldAccessExpr;

    /**
     * isComment
     */
    Visibility setterVisibility() default isNameExpr.isFieldAccessExpr;

    /**
     * isComment
     */
    Visibility creatorVisibility() default isNameExpr.isFieldAccessExpr;

    /**
     * isComment
     */
    Visibility fieldVisibility() default isNameExpr.isFieldAccessExpr;
}
