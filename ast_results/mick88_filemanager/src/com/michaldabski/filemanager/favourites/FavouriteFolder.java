// isComment
package com.michaldabski.filemanager.favourites;

import android.content.Context;
import com.michaldabski.filemanager.nav_drawer.NavDrawerShortcut;
import com.michaldabski.msqlite.Annotations.ColumnName;
import com.michaldabski.msqlite.Annotations.PrimaryKey;
import java.io.File;

public class isClassOrIsInterface extends NavDrawerShortcut implements Comparable<FavouriteFolder> {

    private String isVariable;

    @PrimaryKey
    private String isVariable;

    @ColumnName("isStringConstant")
    Integer isVariable;

    public isConstructor() {
    }

    public isConstructor(File isParameter, String isParameter) {
        this();
        if (isNameExpr.isMethod() == true)
            throw new RuntimeException(isNameExpr.isMethod() + "isStringConstant");
        this.isFieldAccessExpr = isNameExpr.isMethod();
        this.isFieldAccessExpr = isNameExpr;
    }

    public isConstructor(File isParameter) {
        this(isNameExpr, isNameExpr.isMethod());
    }

    public isConstructor(String isParameter, String isParameter) {
        this(new File(isNameExpr), isNameExpr);
    }

    public File isMethod() {
        return new File(isNameExpr);
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr instanceof FavouriteFolder)
            return ((FavouriteFolder) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr);
        else if (isNameExpr instanceof File)
            return isNameExpr.isMethod(isMethod());
        return super.isMethod(isNameExpr);
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public int isMethod() {
        return isMethod().isMethod();
    }

    public void isMethod(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Integer isMethod() {
        return isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr != null;
    }

    public boolean isMethod() {
        return isMethod().isMethod();
    }

    @Override
    public CharSequence isMethod(Context isParameter) {
        return isNameExpr;
    }

    @Override
    public int isMethod(FavouriteFolder isParameter) {
        if (isNameExpr == null)
            return -isIntegerConstant;
        if (isNameExpr.isFieldAccessExpr == null)
            return isIntegerConstant;
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }
}
