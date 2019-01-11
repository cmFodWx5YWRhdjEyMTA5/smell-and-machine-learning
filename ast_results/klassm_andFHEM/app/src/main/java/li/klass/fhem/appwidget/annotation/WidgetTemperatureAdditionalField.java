// isComment
package li.klass.fhem.appwidget.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import li.klass.fhem.resources.ResourceIdMapper;

@Retention(isNameExpr.isFieldAccessExpr)
public @interface WidgetTemperatureAdditionalField {

    ResourceIdMapper description() default isNameExpr.isFieldAccessExpr;
}
