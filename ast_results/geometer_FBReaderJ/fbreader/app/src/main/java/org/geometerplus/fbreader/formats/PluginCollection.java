// isComment
package org.geometerplus.fbreader.formats;

import java.util.*;
import android.os.Build;
import org.geometerplus.zlibrary.core.filesystem.ZLFile;
import org.geometerplus.zlibrary.core.filetypes.*;
import org.geometerplus.zlibrary.core.util.SystemInfo;

public class isClassOrIsInterface implements IFormatPluginCollection {

    static {
        isNameExpr.isMethod("isStringConstant");
    }

    private static volatile PluginCollection isVariable;

    private final List<BuiltinFormatPlugin> isVariable = new LinkedList<BuiltinFormatPlugin>();

    private final List<ExternalFormatPlugin> isVariable = new LinkedList<ExternalFormatPlugin>();

    public static PluginCollection isMethod(SystemInfo isParameter) {
        if (isNameExpr == null) {
            isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    private static synchronized void isMethod(SystemInfo isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new PluginCollection(isNameExpr);
            // isComment
            for (NativeFormatPlugin isVariable : isNameExpr.isMethod(isNameExpr)) {
                isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + isNameExpr);
            }
        }
    }

    public static void isMethod() {
        if (isNameExpr != null) {
            isNameExpr = null;
        }
    }

    private isConstructor(SystemInfo isParameter) {
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isIntegerConstant) {
            isNameExpr.isMethod(new DjVuPlugin(isNameExpr));
            isNameExpr.isMethod(new PDFPlugin(isNameExpr));
            isNameExpr.isMethod(new ComicBookPlugin(isNameExpr));
        }
    }

    public FormatPlugin isMethod(ZLFile isParameter) {
        final FileType isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        final FormatPlugin isVariable = isMethod(isNameExpr);
        if (isNameExpr instanceof ExternalFormatPlugin) {
            return isNameExpr == isNameExpr.isMethod() ? isNameExpr : null;
        }
        return isNameExpr;
    }

    public FormatPlugin isMethod(FileType isParameter) {
        if (isNameExpr == null) {
            return null;
        }
        for (FormatPlugin isVariable : isNameExpr) {
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod())) {
                return isNameExpr;
            }
        }
        for (FormatPlugin isVariable : isNameExpr) {
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod())) {
                return isNameExpr;
            }
        }
        return null;
    }

    public List<FormatPlugin> isMethod() {
        final ArrayList<FormatPlugin> isVariable = new ArrayList<FormatPlugin>();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, new Comparator<FormatPlugin>() {

            public int isMethod(FormatPlugin isParameter, FormatPlugin isParameter) {
                final int isVariable = isNameExpr.isMethod() - isNameExpr.isMethod();
                if (isNameExpr != isIntegerConstant) {
                    return isNameExpr;
                }
                return isNameExpr.isMethod().isMethod(isNameExpr.isMethod());
            }
        });
        return isNameExpr;
    }

    private native NativeFormatPlugin[] isMethod(SystemInfo isParameter);

    private native void isMethod();

    protected void isMethod() throws Throwable {
        isMethod();
        super.isMethod();
    }
}
