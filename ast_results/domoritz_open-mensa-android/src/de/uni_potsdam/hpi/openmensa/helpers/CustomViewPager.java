// isComment
package de.uni_potsdam.hpi.openmensa.helpers;

import org.osmdroid.views.MapView;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;

public class isClassOrIsInterface extends ViewPager {

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    protected boolean isMethod(View isParameter, boolean isParameter, int isParameter, int isParameter, int isParameter) {
        if (isNameExpr instanceof MapView) {
            return true;
        }
        return super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }
}
