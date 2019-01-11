// isComment
package org.geometerplus.fbreader.formats;

import java.util.*;
import org.geometerplus.zlibrary.core.drm.FileEncryptionInfo;
import org.geometerplus.zlibrary.core.encodings.EncodingCollection;
import org.geometerplus.zlibrary.core.encodings.JavaEncodingCollection;
import org.geometerplus.zlibrary.core.filesystem.ZLFile;
import org.geometerplus.zlibrary.core.image.*;
import org.geometerplus.zlibrary.core.util.SystemInfo;
import org.geometerplus.zlibrary.text.model.CachedCharStorageException;
import org.geometerplus.fbreader.book.AbstractBook;
import org.geometerplus.fbreader.book.BookUtil;
import org.geometerplus.fbreader.bookmodel.BookModel;
import org.geometerplus.fbreader.formats.fb2.FB2NativePlugin;
import org.geometerplus.fbreader.formats.oeb.OEBNativePlugin;

public class isClassOrIsInterface extends BuiltinFormatPlugin {

    private static final Object isVariable = new Object();

    public static NativeFormatPlugin isMethod(SystemInfo isParameter, String isParameter) {
        if ("isStringConstant".isMethod(isNameExpr)) {
            return new FB2NativePlugin(isNameExpr);
        } else if ("isStringConstant".isMethod(isNameExpr)) {
            return new OEBNativePlugin(isNameExpr);
        } else {
            return new NativeFormatPlugin(isNameExpr, isNameExpr);
        }
    }

    protected isConstructor(SystemInfo isParameter, String isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public synchronized void isMethod(AbstractBook isParameter) throws BookReadingException {
        final int isVariable;
        synchronized (isNameExpr) {
            isNameExpr = isMethod(isNameExpr);
        }
        if (isNameExpr != isIntegerConstant) {
            throw new BookReadingException("isStringConstant", isNameExpr.isMethod(isNameExpr), new String[] { isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod() });
        }
    }

    private native int isMethod(AbstractBook isParameter);

    @Override
    public List<FileEncryptionInfo> isMethod(AbstractBook isParameter) {
        final FileEncryptionInfo[] isVariable;
        synchronized (isNameExpr) {
            isNameExpr = isMethod(isNameExpr);
        }
        return isNameExpr != null ? isNameExpr.<FileEncryptionInfo>isMethod(isNameExpr) : isNameExpr.<FileEncryptionInfo>isMethod();
    }

    private native FileEncryptionInfo[] isMethod(AbstractBook isParameter);

    @Override
    public synchronized void isMethod(AbstractBook isParameter) throws BookReadingException {
        synchronized (isNameExpr) {
            isMethod(isNameExpr);
        }
        if (isNameExpr.isMethod().isMethod()) {
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, "isStringConstant"));
        }
    }

    private native boolean isMethod(AbstractBook isParameter);

    @Override
    public void isMethod(AbstractBook isParameter) {
        synchronized (isNameExpr) {
            isMethod(isNameExpr);
        }
    }

    private native void isMethod(AbstractBook isParameter);

    @Override
    public synchronized void isMethod(BookModel isParameter) throws BookReadingException {
        final int isVariable;
        final String isVariable = isNameExpr.isMethod();
        synchronized (isNameExpr) {
            isNameExpr = isMethod(isNameExpr, isNameExpr);
        }
        switch(isNameExpr) {
            case isIntegerConstant:
                return;
            case isIntegerConstant:
                throw new CachedCharStorageException("isStringConstant" + isNameExpr);
            default:
                throw new BookReadingException("isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), new String[] { isNameExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr.isMethod() });
        }
    }

    private native int isMethod(BookModel isParameter, String isParameter);

    @Override
    public final ZLFileImageProxy isMethod(ZLFile isParameter) {
        return new ZLFileImageProxy(isNameExpr) {

            @Override
            protected ZLFileImage isMethod() {
                final ZLFileImage[] isVariable = new ZLFileImage[isIntegerConstant];
                synchronized (isNameExpr) {
                    isMethod(isNameExpr, isNameExpr);
                }
                return isNameExpr[isIntegerConstant];
            }
        };
    }

    private native void isMethod(ZLFile isParameter, ZLFileImage[] isParameter);

    @Override
    public String isMethod(ZLFile isParameter) {
        synchronized (isNameExpr) {
            return isMethod(isNameExpr);
        }
    }

    private native String isMethod(ZLFile isParameter);

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public EncodingCollection isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + isMethod() + "isStringConstant";
    }
}
