// isComment
package org.apache.geode.test.junit;

import org.apache.geode.test.junit.support.DefaultIgnoreCondition;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * isComment
 */
@Documented
@Retention(isNameExpr.isFieldAccessExpr)
@Target({ isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr })
// isComment
@Inherited
@SuppressWarnings("isStringConstant")
public @interface ConditionalIgnore {

    Class<? extends IgnoreCondition> condition() default DefaultIgnoreCondition.class;

    String until() default "isStringConstant";

    String value() default "isStringConstant";
}
