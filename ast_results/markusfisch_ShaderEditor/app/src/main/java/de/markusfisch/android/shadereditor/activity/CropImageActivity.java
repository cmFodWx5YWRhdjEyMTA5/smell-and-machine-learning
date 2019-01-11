// isComment
package de.markusfisch.android.shadereditor.activity;

import de.markusfisch.android.shadereditor.fragment.CropImageFragment;
import de.markusfisch.android.shadereditor.widget.CropImageView;
import de.markusfisch.android.shadereditor.R;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class isClassOrIsInterface extends AbstractSubsequentActivity implements CropImageFragment.CropImageViewProvider {

    private CropImageView isVariable;

    public static Intent isMethod(Context isParameter, Uri isParameter) {
        Intent isVariable = new Intent(isNameExpr, CropImageActivity.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        return isNameExpr;
    }

    @Override
    public CropImageView isMethod() {
        return isNameExpr;
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (CropImageView) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(this);
        if (isNameExpr == null) {
            isMethod(new CropImageFragment(), isMethod());
        }
    }
}
