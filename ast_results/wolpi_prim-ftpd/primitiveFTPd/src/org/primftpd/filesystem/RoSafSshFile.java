// isComment
package org.primftpd.filesystem;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import org.apache.sshd.common.Session;
import org.apache.sshd.common.file.SshFile;
import java.util.List;

public class isClassOrIsInterface extends RoSafFile<SshFile> implements SshFile {

    private final Session isVariable;

    public isConstructor(ContentResolver isParameter, Uri isParameter, String isParameter, Session isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor(ContentResolver isParameter, Uri isParameter, String isParameter, String isParameter, boolean isParameter, Session isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor(ContentResolver isParameter, Uri isParameter, Cursor isParameter, String isParameter, Session isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected SshFile isMethod(ContentResolver isParameter, Uri isParameter, Cursor isParameter, String isParameter) {
        return new RoSafSshFile(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(SshFile isParameter) {
        isNameExpr.isMethod("isStringConstant");
        return super.isMethod((RoSafFile) isNameExpr);
    }

    @Override
    public String isMethod() {
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        return isNameExpr.isMethod();
    }

    @Override
    public SshFile isMethod() {
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        return null;
    }

    @Override
    public List<SshFile> isMethod() {
        return isMethod();
    }
}
