// isComment
package org.primftpd.filesystem;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.support.v4.provider.DocumentFile;
import org.apache.sshd.common.Session;
import org.apache.sshd.common.file.FileSystemView;
import org.apache.sshd.common.file.SshFile;

public class isClassOrIsInterface extends SafFileSystemView<SafSshFile, SshFile> implements FileSystemView {

    private final Session isVariable;

    public isConstructor(Context isParameter, Uri isParameter, ContentResolver isParameter, Session isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected SafSshFile isMethod(ContentResolver isParameter, DocumentFile isParameter, DocumentFile isParameter, String isParameter) {
        return new SafSshFile(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, this);
    }

    @Override
    protected SafSshFile isMethod(ContentResolver isParameter, DocumentFile isParameter, String isParameter, String isParameter) {
        return new SafSshFile(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, this);
    }

    @Override
    protected String isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public SshFile isMethod(SshFile isParameter, String isParameter) {
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr);
        // isComment
        return isMethod(isNameExpr.isMethod() + "isStringConstant" + isNameExpr);
    }

    @Override
    public FileSystemView isMethod() {
        isNameExpr.isMethod("isStringConstant");
        return this;
    }
}
