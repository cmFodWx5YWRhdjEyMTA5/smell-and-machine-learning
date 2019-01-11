// isComment
package au.id.micolous.metrodroid.card;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.Iterator;
import au.id.micolous.metrodroid.util.Utils;

/**
 * isComment
 */
public interface isClassOrIsInterface<T extends Card> {

    /**
     * isComment
     */
    @Nullable
    default Iterator<T> isMethod(@NonNull InputStream isParameter) throws Exception {
        final T isVariable = isMethod(isNameExpr);
        if (isNameExpr == null) {
            return null;
        } else {
            return isNameExpr.isMethod(isNameExpr);
        }
    }

    /**
     * isComment
     */
    @Nullable
    default Iterator<T> isMethod(@NonNull String isParameter) throws Exception {
        return isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod()));
    }

    /**
     * isComment
     */
    @Nullable
    T isMethod(@NonNull InputStream isParameter) throws Exception;

    default T isMethod(@NonNull String isParameter) throws Exception {
        return isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod()));
    }

    /**
     * isComment
     */
    interface isClassOrIsInterface<T extends Card> extends CardImporter<T> {

        @Nullable
        @Override
        default Iterator<T> isMethod(@NonNull InputStream isParameter) throws Exception {
            return isMethod(new InputStreamReader(isNameExpr));
        }

        @Nullable
        default Iterator<T> isMethod(@NonNull Reader isParameter) throws Exception {
            final T isVariable = isMethod(isNameExpr);
            if (isNameExpr == null) {
                return null;
            } else {
                return isNameExpr.isMethod(isNameExpr);
            }
        }

        default Iterator<T> isMethod(@NonNull String isParameter) throws Exception {
            return isMethod(new StringReader(isNameExpr));
        }

        @Nullable
        default T isMethod(@NonNull InputStream isParameter) throws Exception {
            return isMethod(new InputStreamReader(isNameExpr));
        }

        @Nullable
        T isMethod(@NonNull Reader isParameter) throws Exception;

        default T isMethod(@NonNull final String isParameter) throws Exception {
            return isMethod(new StringReader(isNameExpr));
        }
    }
}
