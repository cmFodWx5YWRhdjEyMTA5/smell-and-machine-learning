// isComment
package be.digitalia.fosdem.parsers;

import org.xmlpull.v1.XmlPullParser;
import java.util.Iterator;
import java.util.NoSuchElementException;
import androidx.annotation.NonNull;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T> extends AbstractPullParser<Iterable<T>> {

    private class isClassOrIsInterface implements Iterator<T> {

        private final XmlPullParser isVariable;

        private T isVariable = null;

        public isConstructor(XmlPullParser isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            try {
                if (isMethod(isNameExpr)) {
                    isNameExpr = isMethod(isNameExpr);
                }
            } catch (Exception isParameter) {
                throw new RuntimeException(isNameExpr);
            }
        }

        @Override
        public boolean isMethod() {
            return isNameExpr != null;
        }

        @Override
        public T isMethod() {
            if (isNameExpr == null) {
                throw new NoSuchElementException();
            }
            T isVariable = isNameExpr;
            try {
                isNameExpr = isMethod(isNameExpr);
                if (isNameExpr == null) {
                    isMethod(isNameExpr);
                }
            } catch (Exception isParameter) {
                throw new RuntimeException(isNameExpr);
            }
            return isNameExpr;
        }

        @Override
        public void isMethod() {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    protected Iterable<T> isMethod(final XmlPullParser isParameter) throws Exception {
        return new Iterable<T>() {

            @NonNull
            @Override
            public Iterator<T> isMethod() {
                return new ParserIterator(isNameExpr);
            }
        };
    }

    /**
     * isComment
     */
    protected abstract boolean isMethod(XmlPullParser isParameter) throws Exception;

    /**
     * isComment
     */
    protected abstract T isMethod(XmlPullParser isParameter) throws Exception;

    protected void isMethod(XmlPullParser isParameter) throws Exception {
        while (!isMethod()) {
            isNameExpr.isMethod();
        }
    }
}
