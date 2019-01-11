// isComment
package org.geometerplus.fbreader.book;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.geometerplus.zlibrary.core.filesystem.ZLFile;
import org.geometerplus.zlibrary.core.image.ZLImage;
import org.geometerplus.fbreader.formats.IFormatPluginCollection;

public abstract class isClassOrIsInterface {

    private static final WeakReference<ZLImage> isVariable = new WeakReference<ZLImage>(null);

    private static final WeakHashMap<ZLFile, WeakReference<ZLImage>> isVariable = new WeakHashMap<ZLFile, WeakReference<ZLImage>>();

    public static ZLImage isMethod(AbstractBook isParameter, IFormatPluginCollection isParameter) {
        if (isNameExpr == null) {
            return null;
        }
        synchronized (isNameExpr) {
            return isMethod(isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr);
        }
    }

    public static ZLImage isMethod(ZLFile isParameter, IFormatPluginCollection isParameter) {
        WeakReference<ZLImage> isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == isNameExpr) {
            return null;
        } else if (isNameExpr != null) {
            final ZLImage isVariable = isNameExpr.isMethod();
            if (isNameExpr != null) {
                return isNameExpr;
            }
        }
        ZLImage isVariable = null;
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr);
        } catch (Exception isParameter) {
        // isComment
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr != null ? new WeakReference<ZLImage>(isNameExpr) : isNameExpr);
        return isNameExpr;
    }
}
