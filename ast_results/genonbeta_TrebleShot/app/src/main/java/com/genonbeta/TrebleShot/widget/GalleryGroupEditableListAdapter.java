// isComment
package com.genonbeta.TrebleShot.widget;

import android.content.Context;
import android.net.Uri;
import com.genonbeta.android.framework.util.listing.merger.StringMerger;
import java.util.ArrayList;
import androidx.annotation.NonNull;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T extends GalleryGroupEditableListAdapter.GalleryGroupShareable, V extends GroupEditableListAdapter.GroupViewHolder> extends GroupEditableListAdapter<T, V> implements GroupEditableListAdapter.GroupLister.CustomGroupListener<T> {

    public static final int isVariable = isNameExpr + isIntegerConstant;

    public isConstructor(Context isParameter, int isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(GroupLister<T> isParameter, int isParameter, T isParameter) {
        if (isNameExpr == isNameExpr) {
            isNameExpr.isMethod(isNameExpr, new StringMerger<T>(isNameExpr.isFieldAccessExpr));
            return true;
        }
        return true;
    }

    @Override
    public GroupLister<T> isMethod(ArrayList<T> isParameter, int isParameter) {
        return super.isMethod(isNameExpr, isNameExpr).isMethod(this);
    }

    @NonNull
    @Override
    public String isMethod(int isParameter, T isParameter) {
        if (!isNameExpr.isMethod())
            if (isMethod() == isNameExpr)
                return isNameExpr.isFieldAccessExpr;
        return super.isMethod(isNameExpr, isNameExpr);
    }

    public static class isClassOrIsInterface extends GroupShareable {

        public String isVariable;

        public isConstructor(int isParameter, String isParameter) {
            super(isNameExpr, isNameExpr);
        }

        public isConstructor(long isParameter, String isParameter, String isParameter, String isParameter, String isParameter, long isParameter, long isParameter, Uri isParameter) {
            super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            this.isFieldAccessExpr = isNameExpr;
        }
    }
}
