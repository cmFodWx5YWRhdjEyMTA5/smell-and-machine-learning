// isComment
package org.osmdroid.samplefragments.animations;

import android.widget.Toast;
import java.util.Locale;
import org.osmdroid.events.MapListener;
import org.osmdroid.events.ScrollEvent;
import org.osmdroid.events.ZoomEvent;
import org.osmdroid.samplefragments.BaseSampleFragment;

public class isClassOrIsInterface extends BaseSampleFragment implements MapListener {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(isDoubleConstant);
        isNameExpr.isMethod(isDoubleConstant);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod().isMethod(isDoubleConstant);
    }

    @Override
    public boolean isMethod(ScrollEvent isParameter) {
        return true;
    }

    @Override
    public boolean isMethod(ZoomEvent isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod(isMethod(), "isStringConstant" + isNameExpr, isNameExpr.isFieldAccessExpr).isMethod();
        return true;
    }
}
