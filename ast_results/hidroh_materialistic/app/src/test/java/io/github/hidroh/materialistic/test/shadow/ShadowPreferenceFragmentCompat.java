// isComment
package io.github.hidroh.materialistic.test.shadow;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.annotation.RealObject;
import org.robolectric.util.ReflectionHelpers;
import io.github.hidroh.materialistic.R;

// isComment
@Implements(PreferenceFragmentCompat.class)
public class isClassOrIsInterface {

    @RealObject
    PreferenceFragmentCompat isVariable;

    @Implementation
    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        RecyclerView isVariable = new RecyclerView(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
        return isNameExpr;
    }
}
