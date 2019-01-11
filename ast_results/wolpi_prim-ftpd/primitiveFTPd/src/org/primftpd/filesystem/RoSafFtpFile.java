// isComment
package org.primftpd.filesystem;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import org.apache.ftpserver.ftplet.FtpFile;
import org.apache.ftpserver.ftplet.User;

public class isClassOrIsInterface extends RoSafFile<FtpFile> implements FtpFile {

    private final User isVariable;

    public isConstructor(ContentResolver isParameter, Uri isParameter, String isParameter, User isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor(ContentResolver isParameter, Uri isParameter, String isParameter, String isParameter, boolean isParameter, User isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor(ContentResolver isParameter, Uri isParameter, Cursor isParameter, String isParameter, User isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected FtpFile isMethod(ContentResolver isParameter, Uri isParameter, Cursor isParameter, String isParameter) {
        return new RoSafFtpFile(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(FtpFile isParameter) {
        isNameExpr.isMethod("isStringConstant");
        return super.isMethod((RoSafFile) isNameExpr);
    }

    @Override
    public String isMethod() {
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        return isNameExpr.isMethod();
    }

    @Override
    public String isMethod() {
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        return isNameExpr.isMethod();
    }
}
