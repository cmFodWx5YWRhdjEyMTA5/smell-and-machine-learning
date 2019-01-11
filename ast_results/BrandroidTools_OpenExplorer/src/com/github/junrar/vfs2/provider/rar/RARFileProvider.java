// isComment
package com.github.junrar.vfs2.provider.rar;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import org.apache.commons.vfs2.Capability;
import org.apache.commons.vfs2.FileName;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystem;
import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileSystemOptions;
import org.apache.commons.vfs2.FileType;
import org.apache.commons.vfs2.provider.AbstractFileName;
import org.apache.commons.vfs2.provider.AbstractLayeredFileProvider;
import org.apache.commons.vfs2.provider.FileProvider;
import org.apache.commons.vfs2.provider.LayeredFileName;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractLayeredFileProvider implements FileProvider {

    /**
     * isComment
     */
    protected static final Collection<Capability> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(new Capability[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr }));

    public isConstructor() {
        super();
    }

    /**
     * isComment
     */
    @Override
    protected FileSystem isMethod(final String isParameter, final FileObject isParameter, final FileSystemOptions isParameter) throws FileSystemException {
        final AbstractFileName isVariable = new LayeredFileName(isNameExpr, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        return new RARFileSystem(isNameExpr, isNameExpr, isNameExpr);
    }

    public Collection<Capability> isMethod() {
        return isNameExpr;
    }
}
