// isComment
package net.fortuna.ical4j.model.property;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import net.fortuna.ical4j.model.DateList;
import net.fortuna.ical4j.model.Parameter;
import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyFactory;
import net.fortuna.ical4j.model.TimeZone;
import net.fortuna.ical4j.model.parameter.TzId;
import net.fortuna.ical4j.model.parameter.Value;
import net.fortuna.ical4j.util.Strings;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends Property {

    /**
     * isComment
     */
    private static final long isVariable = isStringConstant;

    private DateList isVariable;

    private TimeZone isVariable;

    /**
     * isComment
     */
    public isConstructor(final String isParameter, PropertyFactory isParameter) {
        this(isNameExpr, new DateList(isNameExpr.isFieldAccessExpr), isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final String isParameter, final ParameterList isParameter, PropertyFactory isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final String isParameter, final DateList isParameter, PropertyFactory isParameter) {
        this(isNameExpr, new ParameterList(), isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final String isParameter, final ParameterList isParameter, final DateList isParameter, PropertyFactory isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        if (isNameExpr != null && !isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod())) {
            isMethod().isMethod(isNameExpr.isMethod());
        }
    }

    /**
     * isComment
     */
    public final DateList isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(final String isParameter) throws ParseException {
        isNameExpr = new DateList(isNameExpr, (Value) isMethod(isNameExpr.isFieldAccessExpr), isNameExpr);
    }

    /**
     * isComment
     */
    public String isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public void isMethod(final TimeZone isParameter) {
        if (isNameExpr == null) {
            throw new UnsupportedOperationException("isStringConstant");
        }
        this.isFieldAccessExpr = isNameExpr;
        if (isNameExpr != null) {
            if (!isNameExpr.isFieldAccessExpr.isMethod(isMethod().isMethod())) {
                throw new UnsupportedOperationException("isStringConstant");
            }
            isNameExpr.isMethod(isNameExpr);
            isMethod().isMethod(isMethod(isNameExpr.isFieldAccessExpr));
            final TzId isVariable = new TzId(isNameExpr.isMethod());
            isMethod().isMethod(isNameExpr);
        } else {
            // isComment
            isMethod(true);
        }
    }

    /**
     * isComment
     */
    public final TimeZone isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public final void isMethod(final boolean isParameter) {
        if (isNameExpr == null || !isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod())) {
            throw new UnsupportedOperationException("isStringConstant");
        }
        isNameExpr.isMethod(isNameExpr);
        isMethod().isMethod(isMethod(isNameExpr.isFieldAccessExpr));
    }

    /**
     * isComment
     */
    public final Property isMethod() throws IOException, URISyntaxException, ParseException {
        final Property isVariable = super.isMethod();
        ((DateListProperty) isNameExpr).isFieldAccessExpr = isNameExpr;
        ((DateListProperty) isNameExpr).isMethod(isMethod());
        return isNameExpr;
    }
}
