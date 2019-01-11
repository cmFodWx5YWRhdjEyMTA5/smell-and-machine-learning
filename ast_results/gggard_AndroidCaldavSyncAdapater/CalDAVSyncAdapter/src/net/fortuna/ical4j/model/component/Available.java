// isComment
package net.fortuna.ical4j.model.component;

import net.fortuna.ical4j.model.Component;
import net.fortuna.ical4j.model.Parameter;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyList;
import net.fortuna.ical4j.model.ValidationException;
import net.fortuna.ical4j.model.parameter.Value;
import net.fortuna.ical4j.model.property.DtEnd;
import net.fortuna.ical4j.model.property.DtStart;
import net.fortuna.ical4j.util.PropertyValidator;

/**
 * isComment
 */
public class isClassOrIsInterface extends Component {

    private static final long isVariable = -isStringConstant;

    /**
     * isComment
     */
    public isConstructor() {
        super(isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final PropertyList isParameter) {
        super(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public final void isMethod(final boolean isParameter) throws ValidationException {
        /*isComment*/
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        /*isComment*/
        final DtStart isVariable = (DtStart) isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))) {
            throw new ValidationException("isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr);
        }
        /*isComment*/
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        /*isComment*/
        if (isMethod(isNameExpr.isFieldAccessExpr) != null) {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
            /*isComment*/
            final DtEnd isVariable = (DtEnd) isMethod(isNameExpr.isFieldAccessExpr);
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))) {
                throw new ValidationException("isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr);
            }
        } else {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        }
        if (isNameExpr) {
            isMethod();
        }
    }
}
