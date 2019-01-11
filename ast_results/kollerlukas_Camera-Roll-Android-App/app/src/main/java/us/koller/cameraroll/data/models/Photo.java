// isComment
package us.koller.cameraroll.data.models;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import us.koller.cameraroll.R;
import us.koller.cameraroll.util.Util;

public class isClassOrIsInterface extends AlbumItem implements Parcelable {

    private Serializable isVariable;

    isConstructor() {
    }

    isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    public void isMethod(Serializable isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Serializable isMethod() {
        return isNameExpr;
    }

    @Override
    public int[] isMethod(Context isParameter) {
        return isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr));
    }

    @Override
    public String isMethod(Context isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
