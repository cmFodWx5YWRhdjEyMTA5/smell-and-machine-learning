// isComment
package org.osmdroid.bugtestfragments;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import org.osmdroid.ExtraSamplesActivity;
import org.osmdroid.R;
import org.osmdroid.samplefragments.BaseSampleFragment;
import org.osmdroid.views.MapView;

public class isClassOrIsInterface extends BaseSampleFragment implements View.OnClickListener {

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        isNameExpr = new MapView(isMethod());
        ((LinearLayout) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr);
        Button isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod("isStringConstant");
        return isNameExpr;
    }

    @Override
    public void isMethod(View isParameter) {
        FragmentManager isVariable = isMethod();
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, new SampleBug57Step2(), isNameExpr.isFieldAccessExpr).isMethod(null).isMethod();
    }
}
