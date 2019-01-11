// isComment
package org.codehaus.jackson.map.annotate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.codehaus.jackson.annotate.JacksonAnnotation;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.KeyDeserializer;

/**
 * isComment
 */
@Target({ isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr })
@Retention(isNameExpr.isFieldAccessExpr)
@JacksonAnnotation
public @interface JsonDeserialize {

    /**
     * isComment
     */
    public Class<? extends JsonDeserializer<?>> using() default JsonDeserializer.None.class;

    /**
     * isComment
     */
    public Class<? extends JsonDeserializer<?>> contentUsing() default JsonDeserializer.None.class;

    /**
     * isComment
     */
    public Class<? extends KeyDeserializer> keyUsing() default KeyDeserializer.None.class;

    /**
     * isComment
     */
    public Class<?> as() default NoClass.class;

    /**
     * isComment
     */
    public Class<?> keyAs() default NoClass.class;

    /**
     * isComment
     */
    public Class<?> contentAs() default NoClass.class;
}
