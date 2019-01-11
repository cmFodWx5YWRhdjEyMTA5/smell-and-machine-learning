// isComment
package net.fortuna.ical4j.model.property;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import net.fortuna.ical4j.model.Parameter;
import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyFactoryImpl;
import net.fortuna.ical4j.model.ValidationException;
import net.fortuna.ical4j.util.ParameterValidator;
import net.fortuna.ical4j.util.Strings;
import net.fortuna.ical4j.util.Uris;

/**
 * isComment
 */
public class isClassOrIsInterface extends Property {

    private static final long isVariable = isStringConstant;

    private URI isVariable;

    /**
     * isComment
     */
    public isConstructor() {
        super(isNameExpr, isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    public isConstructor(final String isParameter) throws URISyntaxException {
        super(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final String isParameter) throws URISyntaxException {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final URI isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public isConstructor(final ParameterList isParameter, final URI isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr.isMethod());
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public final void isMethod(final String isParameter) throws URISyntaxException {
        isNameExpr = isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public final void isMethod() throws ValidationException {
        /*isComment*/
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        /*isComment*/
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isMethod());
    /*isComment*/
    }

    /**
     * isComment
     */
    public final URI isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public final String isMethod() {
        return isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
    }

    /**
     * isComment
     */
    public final void isMethod(final URI isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public final Property isMethod() throws IOException, URISyntaxException, ParseException {
        // isComment
        return new Attendee(new ParameterList(isMethod(), true), isNameExpr);
    }
}
