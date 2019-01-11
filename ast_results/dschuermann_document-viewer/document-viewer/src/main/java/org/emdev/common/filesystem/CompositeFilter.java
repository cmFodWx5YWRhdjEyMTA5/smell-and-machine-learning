// isComment
package org.emdev.common.filesystem;

import java.io.File;
import java.io.FileFilter;

public class isClassOrIsInterface implements FileFilter {

    final boolean isVariable;

    final FileFilter[] isVariable;

    public isConstructor(final boolean isParameter, final FileFilter... isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(final File isParameter) {
        boolean isVariable = true;
        if (isNameExpr) {
            isNameExpr = true;
            for (final FileFilter isVariable : isNameExpr) {
                isNameExpr &= isNameExpr.isMethod(isNameExpr);
                if (!isNameExpr) {
                    break;
                }
            }
        } else {
            for (final FileFilter isVariable : isNameExpr) {
                isNameExpr |= isNameExpr.isMethod(isNameExpr);
                if (isNameExpr) {
                    break;
                }
            }
        }
        return isNameExpr;
    }
}
