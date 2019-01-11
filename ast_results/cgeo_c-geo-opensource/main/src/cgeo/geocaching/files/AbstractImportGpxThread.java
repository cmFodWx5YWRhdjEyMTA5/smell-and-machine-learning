// isComment
package cgeo.geocaching.files;

import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.utils.DisposableHandler;
import android.os.Handler;
import java.io.IOException;
import java.util.Collection;

abstract class isClassOrIsInterface extends AbstractImportThread {

    protected isConstructor(final int isParameter, final Handler isParameter, final DisposableHandler isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected Collection<Geocache> isMethod() throws IOException, ParserException {
        try {
            // isComment
            return isMethod(new GPX10Parser(isNameExpr));
        } catch (final ParserException isParameter) {
            // isComment
            return isMethod(new GPX11Parser(isNameExpr));
        }
    }

    protected abstract Collection<Geocache> isMethod(GPXParser isParameter) throws IOException, ParserException;
}
