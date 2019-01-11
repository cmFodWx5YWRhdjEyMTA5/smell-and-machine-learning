// isComment
package net.fortuna.ical4j.data;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.ValidationException;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractOutputter {

    /**
     * isComment
     */
    public isConstructor() {
        super();
    }

    /**
     * isComment
     */
    public isConstructor(final boolean isParameter) {
        super(isNameExpr);
    }

    /**
     * isComment
     */
    public isConstructor(final boolean isParameter, final int isParameter) {
        super(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public final void isMethod(final Calendar isParameter, final OutputStream isParameter) throws IOException, ValidationException {
        isMethod(isNameExpr, new OutputStreamWriter(isNameExpr, isNameExpr));
    }

    /**
     * isComment
     */
    public final void isMethod(final Calendar isParameter, final Writer isParameter) throws IOException, ValidationException {
        if (isMethod()) {
            isNameExpr.isMethod();
        }
        final FoldingWriter isVariable = new FoldingWriter(isNameExpr, isNameExpr);
        try {
            isNameExpr.isMethod(isNameExpr.isMethod());
        } finally {
            isNameExpr.isMethod();
        }
    }
}
