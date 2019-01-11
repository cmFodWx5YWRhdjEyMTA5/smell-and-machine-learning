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
public @interface JsonTypeInfo {

    /**
     * isComment
     */
    public enum Id {

        /**
         * isComment
         */
        NONE(null),
        /**
         * isComment
         */
        CLASS("isStringConstant"),
        /**
         * isComment
         */
        MINIMAL_CLASS("isStringConstant"),
        /**
         * isComment
         */
        NAME("isStringConstant"),
        /**
         * isComment
         */
        CUSTOM(null);

        private final String isVariable;

        private isConstructor(String isParameter) {
            isNameExpr = isNameExpr;
        }

        public String isMethod() {
            return isNameExpr;
        }
    }

    /**
     * isComment
     */
    public enum As {

        /**
         * isComment
         */
        PROPERTY,
        /**
         * isComment
         */
        WRAPPER_OBJECT,
        /**
         * isComment
         */
        WRAPPER_ARRAY
    }

    /**
     * isComment
     */
    public Id use();

    /**
     * isComment
     */
    public As include() default isNameExpr.isFieldAccessExpr;

    /**
     * isComment
     */
    public String property() default "isStringConstant";
}
