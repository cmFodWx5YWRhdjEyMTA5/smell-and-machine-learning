// isComment
package org.geometerplus.zlibrary.core.filetypes;

import java.util.*;
import org.geometerplus.zlibrary.core.filesystem.ZLFile;
import org.geometerplus.zlibrary.core.util.MimeType;

public class isClassOrIsInterface {

    public static final FileTypeCollection isVariable = new FileTypeCollection();

    private final TreeMap<String, FileType> isVariable = new TreeMap<String, FileType>();

    private isConstructor() {
        isMethod(new FileTypeFB2());
        isMethod(new FileTypeEpub());
        isMethod(new FileTypeMobipocket());
        isMethod(new FileTypeHtml());
        isMethod(new SimpleFileType("isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr));
        isMethod(new SimpleFileType("isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr));
        isMethod(new SimpleFileType("isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr));
        isMethod(new FileTypeDjVu());
        isMethod(new FileTypeCBZ());
        isMethod(new SimpleFileType("isStringConstant", "isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)));
        isMethod(new SimpleFileType("isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr));
    }

    private void isMethod(FileType isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr);
    }

    public Collection<FileType> isMethod() {
        return isNameExpr.isMethod();
    }

    public FileType isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod());
    }

    public FileType isMethod(ZLFile isParameter) {
        for (FileType isVariable : isMethod()) {
            if (isNameExpr.isMethod(isNameExpr)) {
                return isNameExpr;
            }
        }
        return null;
    }

    public FileType isMethod(MimeType isParameter) {
        if (isNameExpr == null) {
            return null;
        }
        isNameExpr = isNameExpr.isMethod();
        for (FileType isVariable : isMethod()) {
            if (isNameExpr.isMethod().isMethod(isNameExpr)) {
                return isNameExpr;
            }
        }
        return null;
    }

    public MimeType isMethod(ZLFile isParameter) {
        for (FileType isVariable : isMethod()) {
            final MimeType isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != isNameExpr.isFieldAccessExpr) {
                return isNameExpr;
            }
        }
        return isNameExpr.isFieldAccessExpr;
    }

    public MimeType isMethod(ZLFile isParameter) {
        for (FileType isVariable : isMethod()) {
            final MimeType isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != isNameExpr.isFieldAccessExpr) {
                return isNameExpr;
            }
        }
        return isNameExpr.isFieldAccessExpr;
    }
}
