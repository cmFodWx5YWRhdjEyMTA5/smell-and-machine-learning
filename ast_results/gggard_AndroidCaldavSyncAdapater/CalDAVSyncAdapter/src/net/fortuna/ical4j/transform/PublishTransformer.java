// isComment
package net.fortuna.ical4j.transform;

import java.util.Iterator;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.Component;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyList;
import net.fortuna.ical4j.model.property.Method;
import net.fortuna.ical4j.model.property.Sequence;

/**
 * isComment
 */
public class isClassOrIsInterface extends Transformer {

    /**
     * isComment
     */
    public final Calendar isMethod(final Calendar isParameter) {
        PropertyList isVariable = isNameExpr.isMethod();
        Property isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        for (Iterator isVariable = isNameExpr.isMethod().isMethod(); isNameExpr.isMethod(); ) {
            Component isVariable = (Component) isNameExpr.isMethod();
            PropertyList isVariable = isNameExpr.isMethod();
            Sequence isVariable = (Sequence) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            if (isNameExpr == null) {
                isNameExpr.isMethod(new Sequence(isIntegerConstant));
            } else {
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(new Sequence(isNameExpr.isMethod() + isIntegerConstant));
            }
        }
        return isNameExpr;
    }
}
