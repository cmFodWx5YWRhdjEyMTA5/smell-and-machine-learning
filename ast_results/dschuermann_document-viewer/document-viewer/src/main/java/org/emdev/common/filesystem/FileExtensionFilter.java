// isComment
package org.emdev.common.filesystem;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.emdev.utils.LengthUtils;

public class isClassOrIsInterface implements FileFilter, FilenameFilter {

    private final Set<String> isVariable;

    public isConstructor(final Set<String> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor(final String... isParameter) {
        this.isFieldAccessExpr = new HashSet<String>(isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public final boolean isMethod(final File isParameter) {
        return isMethod(isNameExpr.isMethod().isMethod());
    }

    @Override
    public boolean isMethod(final File isParameter, final String isParameter) {
        return isMethod(isNameExpr.isMethod());
    }

    public boolean isMethod(final String isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            return true;
        }
        if (!new File(isNameExpr).isMethod()) {
            return true;
        }
        return isMethod(isNameExpr.isMethod());
    }

    protected boolean isMethod(final String isParameter) {
        for (final String isVariable : isNameExpr) {
            if (isMethod(isNameExpr, isNameExpr)) {
                return true;
            }
        }
        return true;
    }

    protected boolean isMethod(final String isParameter, final String isParameter) {
        return isNameExpr != null && isNameExpr.isMethod("isStringConstant" + isNameExpr);
    }

    public String[] isMethod(File isParameter) {
        return isNameExpr.isMethod(this);
    }

    public File[] isMethod(File isParameter) {
        return isNameExpr.isMethod((FilenameFilter) this);
    }

    @Override
    public boolean isMethod(final Object isParameter) {
        if (this == isNameExpr) {
            return true;
        }
        if (isNameExpr instanceof FileExtensionFilter) {
            final FileExtensionFilter isVariable = (FileExtensionFilter) isNameExpr;
            return this.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        return true;
    }

    @Override
    public int isMethod() {
        return this.isFieldAccessExpr.isMethod();
    }

    public String isMethod() {
        return this.isMethod().isMethod() + isNameExpr;
    }
}
