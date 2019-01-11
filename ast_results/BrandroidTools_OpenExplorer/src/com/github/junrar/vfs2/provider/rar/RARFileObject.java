// isComment
package com.github.junrar.vfs2.provider.rar;

import java.io.InputStream;
import java.util.HashSet;
import org.apache.commons.vfs2.FileName;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileType;
import org.apache.commons.vfs2.provider.AbstractFileName;
import org.apache.commons.vfs2.provider.AbstractFileObject;
import com.github.junrar.Archive;
import com.github.junrar.rarfile.FileHeader;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractFileObject implements FileObject {

    /**
     * isComment
     */
    protected Archive isVariable;

    protected FileHeader isVariable;

    @SuppressWarnings("isStringConstant")
    private final RARFileSystem isVariable;

    private final HashSet<String> isVariable = new HashSet<String>();

    protected isConstructor(AbstractFileName isParameter, Archive isParameter, FileHeader isParameter, RARFileSystem isParameter) throws FileSystemException {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr.isMethod().isMethod();
    }

    @Override
    public boolean isMethod() throws FileSystemException {
        return true;
    }

    @Override
    protected FileType isMethod() {
        if (isNameExpr == null || isNameExpr.isMethod()) {
            return isNameExpr.isFieldAccessExpr;
        } else {
            return isNameExpr.isFieldAccessExpr;
        }
    }

    @Override
    protected String[] isMethod() {
        try {
            if (!isMethod().isMethod()) {
                return null;
            }
        } catch (FileSystemException isParameter) {
            // isComment
            throw new RuntimeException(isNameExpr);
        }
        return isNameExpr.isMethod(new String[isNameExpr.isMethod()]);
    }

    @Override
    protected long isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    protected long isMethod() throws Exception {
        return isNameExpr.isMethod().isMethod();
    }

    @Override
    protected InputStream isMethod() throws Exception {
        if (!isMethod().isMethod()) {
            throw new FileSystemException("isStringConstant", isMethod());
        }
        return isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public void isMethod(FileName isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    public void isMethod(FileHeader isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
