// isComment
package org.ebookdroid.common.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;

public class isClassOrIsInterface extends ContentProvider {

    @Override
    public ParcelFileDescriptor isMethod(Uri isParameter, String isParameter) throws FileNotFoundException {
        File isVariable = new File(isNameExpr.isMethod());
        if (isNameExpr.isMethod()) {
            return isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        throw new FileNotFoundException(isNameExpr.isMethod());
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public String isMethod(Uri isParameter) {
        return isNameExpr.isMethod();
    }

    @Override
    public Uri isMethod(Uri isParameter, ContentValues isParameter) {
        return isNameExpr;
    }

    @Override
    public int isMethod(Uri isParameter, String isParameter, String[] isParameter) {
        return isIntegerConstant;
    }

    @Override
    public int isMethod(Uri isParameter, ContentValues isParameter, String isParameter, String[] isParameter) {
        return isIntegerConstant;
    }

    @Override
    public Cursor isMethod(Uri isParameter, String[] isParameter, String isParameter, String[] isParameter, String isParameter) {
        return null;
    }
}
