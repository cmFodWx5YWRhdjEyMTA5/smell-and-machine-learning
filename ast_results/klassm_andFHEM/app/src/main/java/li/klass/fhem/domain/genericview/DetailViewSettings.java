// isComment
package li.klass.fhem.domain.genericview;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import li.klass.fhem.resources.ResourceIdMapper;

@Retention(isNameExpr.isFieldAccessExpr)
public @interface DetailViewSettings {

    boolean showState() default true;

    boolean showMeasured() default true;

    ResourceIdMapper stateStringId() default isNameExpr.isFieldAccessExpr;

    ResourceIdMapper measuredStringId() default isNameExpr.isFieldAccessExpr;
}
