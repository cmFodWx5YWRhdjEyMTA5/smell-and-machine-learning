// isComment
package de.markusfisch.android.shadereditor.activity;

import de.markusfisch.android.shadereditor.fragment.CubeMapFragment;
import de.markusfisch.android.shadereditor.widget.CubeMapView;
import de.markusfisch.android.shadereditor.R;
import android.os.Bundle;

public class isClassOrIsInterface extends AbstractSubsequentActivity implements CubeMapFragment.CubeMapViewProvider {

    private CubeMapView isVariable;

    @Override
    public CubeMapView isMethod() {
        return isNameExpr;
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (CubeMapView) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(this);
        if (isNameExpr == null) {
            isMethod(isMethod(), new CubeMapFragment());
        }
    }
}
