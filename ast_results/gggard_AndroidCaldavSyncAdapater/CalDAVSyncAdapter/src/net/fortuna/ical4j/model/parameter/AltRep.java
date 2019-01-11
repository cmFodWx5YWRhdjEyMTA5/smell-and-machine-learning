// isComment
package net.fortuna.ical4j.model.parameter;

import java.net.URI;
import java.net.URISyntaxException;
import net.fortuna.ical4j.model.Parameter;
import net.fortuna.ical4j.model.ParameterFactoryImpl;
import net.fortuna.ical4j.util.Strings;
import net.fortuna.ical4j.util.Uris;

/**
 * isComment
 */
public class isClassOrIsInterface extends Parameter {

    private static final long isVariable = -isStringConstant;

    private URI isVariable;

    /**
     * isComment
     */
    public isConstructor(final String isParameter) throws URISyntaxException {
        this(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)));
    }

    /**
     * isComment
     */
    public isConstructor(final URI isParameter) {
        super(isNameExpr, isNameExpr.isMethod());
        this.isFieldAccessExpr = isNameExpr;
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
}
