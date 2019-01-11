// isComment
package org.codehaus.jackson.schema;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.codehaus.jackson.annotate.JacksonAnnotation;

/**
 * isComment
 */
@Target(isNameExpr.isFieldAccessExpr)
@Retention(isNameExpr.isFieldAccessExpr)
@JacksonAnnotation
public @interface JsonSerializableSchema {

    /**
     * isComment
     */
    String schemaType() default "isStringConstant";

    /**
     * isComment
     */
    String schemaObjectPropertiesDefinition() default "isStringConstant";

    /**
     * isComment
     */
    String schemaItemDefinition() default "isStringConstant";
}
