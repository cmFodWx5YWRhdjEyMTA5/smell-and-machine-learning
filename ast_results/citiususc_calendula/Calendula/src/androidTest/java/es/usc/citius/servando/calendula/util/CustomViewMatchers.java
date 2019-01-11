// isComment
package es.usc.citius.servando.calendula.util;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class isClassOrIsInterface {

    public static Matcher<View> isMethod(final int isParameter) {
        return new TypeSafeMatcher<View>() {

            @Override
            public boolean isMethod(final View isParameter) {
                return ((RecyclerView) isNameExpr).isMethod().isMethod() == isNameExpr;
            }

            @Override
            public void isMethod(final Description isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant");
            }
        };
    }
}
