// isComment
package org.emdev.common.archives.zip;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.emdev.common.archives.ArchiveFile;

public class isClassOrIsInterface implements ArchiveFile<ZipArchiveEntry> {

    private final ZipFile isVariable;

    public isConstructor(final File isParameter) throws IOException {
        try {
            this.isFieldAccessExpr = new ZipFile(isNameExpr);
        } catch (final ZipException isParameter) {
            final IOException isVariable = new IOException(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr);
            throw isNameExpr;
        }
    }

    @Override
    protected void isMethod() throws Throwable {
        try {
            isNameExpr.isMethod();
        } catch (Exception isParameter) {
        }
        super.isMethod();
    }

    /**
     * isComment
     */
    @Override
    public boolean isMethod() {
        return true;
    }

    /**
     * isComment
     */
    @Override
    public Enumeration<ZipArchiveEntry> isMethod() {
        return new Enumeration<ZipArchiveEntry>() {

            private final Enumeration<? extends ZipEntry> isVariable = isNameExpr.isMethod();

            @Override
            public boolean isMethod() {
                return isNameExpr.isMethod();
            }

            @Override
            public ZipArchiveEntry isMethod() {
                return new ZipArchiveEntry(isNameExpr.this, isNameExpr.isMethod());
            }
        };
    }

    InputStream isMethod(final ZipArchiveEntry isParameter) throws IOException {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    @Override
    public void isMethod() throws IOException {
        isNameExpr.isMethod();
    }
}
