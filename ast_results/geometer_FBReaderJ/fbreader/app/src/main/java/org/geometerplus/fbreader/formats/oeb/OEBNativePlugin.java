// isComment
package org.geometerplus.fbreader.formats.oeb;

import java.util.Collections;
import java.util.List;
import org.geometerplus.zlibrary.core.encodings.EncodingCollection;
import org.geometerplus.zlibrary.core.encodings.AutoEncodingCollection;
import org.geometerplus.zlibrary.core.filesystem.ZLFile;
import org.geometerplus.zlibrary.core.util.SystemInfo;
import org.geometerplus.fbreader.book.AbstractBook;
import org.geometerplus.fbreader.book.BookUtil;
import org.geometerplus.fbreader.bookmodel.BookModel;
import org.geometerplus.fbreader.formats.BookReadingException;
import org.geometerplus.fbreader.formats.NativeFormatPlugin;

public class isClassOrIsInterface extends NativeFormatPlugin {

    public isConstructor(SystemInfo isParameter) {
        super(isNameExpr, "isStringConstant");
    }

    @Override
    public void isMethod(BookModel isParameter) throws BookReadingException {
        final ZLFile isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(true);
        try {
            super.isMethod(isNameExpr);
            isNameExpr.isMethod(new BookModel.LabelResolver() {

                public List<String> isMethod(String isParameter) {
                    final int isVariable = isNameExpr.isMethod("isStringConstant");
                    return isNameExpr > isIntegerConstant ? isNameExpr.<String>isMethod(isNameExpr.isMethod(isIntegerConstant, isNameExpr)) : isNameExpr.<String>isMethod();
                }
            });
        } finally {
            isNameExpr.isMethod(true);
        }
    }

    @Override
    public EncodingCollection isMethod() {
        return new AutoEncodingCollection();
    }

    @Override
    public void isMethod(AbstractBook isParameter) {
        isNameExpr.isMethod("isStringConstant");
    }

    @Override
    public String isMethod(ZLFile isParameter) {
        isNameExpr.isMethod(true);
        try {
            return new OEBAnnotationReader().isMethod(isMethod(isNameExpr));
        } catch (BookReadingException isParameter) {
            return null;
        } finally {
            isNameExpr.isMethod(true);
        }
    }

    private ZLFile isMethod(ZLFile isParameter) throws BookReadingException {
        if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            return isNameExpr;
        }
        final ZLFile isVariable = isNameExpr.isMethod(isNameExpr, "isStringConstant");
        if (isNameExpr.isMethod()) {
            final ContainerFileReader isVariable = new ContainerFileReader();
            isNameExpr.isMethod(isNameExpr);
            final String isVariable = isNameExpr.isMethod();
            if (isNameExpr != null) {
                return isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        }
        for (ZLFile isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isMethod().isMethod("isStringConstant")) {
                return isNameExpr;
            }
        }
        throw new BookReadingException("isStringConstant", isNameExpr);
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }
}
