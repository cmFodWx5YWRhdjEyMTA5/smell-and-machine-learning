// isComment
package au.id.micolous.metrodroid.card;

import java.io.OutputStream;
import java.util.Iterator;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T extends Card> implements CardExporter<T> {

    public abstract void isMethod(OutputStream isParameter, Iterator<T> isParameter) throws Exception;

    public void isMethod(OutputStream isParameter, Iterable<T> isParameter) throws Exception {
        isMethod(isNameExpr, isNameExpr.isMethod());
    }
}
