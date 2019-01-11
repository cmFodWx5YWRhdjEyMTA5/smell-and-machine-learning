// isComment
package de.markusfisch.android.shadereditor.activity;

import de.markusfisch.android.shadereditor.fragment.TextureViewFragment;
import de.markusfisch.android.shadereditor.widget.ScalingImageView;
import de.markusfisch.android.shadereditor.R;
import android.os.Bundle;

public class isClassOrIsInterface extends AbstractSubsequentActivity implements TextureViewFragment.ScalingImageViewProvider {

    private ScalingImageView isVariable;

    @Override
    public ScalingImageView isMethod() {
        return isNameExpr;
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (ScalingImageView) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(this);
        if (isNameExpr == null) {
            isMethod(new TextureViewFragment(), isMethod());
        }
    }
}
