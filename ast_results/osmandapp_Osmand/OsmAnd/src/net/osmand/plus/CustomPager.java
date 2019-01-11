// isComment
package net.osmand.plus;

import net.osmand.plus.views.OsmAndMapSurfaceView;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;

public class isClassOrIsInterface extends ViewPager {

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    @Override
    protected boolean isMethod(View isParameter, boolean isParameter, int isParameter, int isParameter, int isParameter) {
        if (isNameExpr instanceof OsmAndMapSurfaceView) {
            return true;
        }
        return super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }
}
