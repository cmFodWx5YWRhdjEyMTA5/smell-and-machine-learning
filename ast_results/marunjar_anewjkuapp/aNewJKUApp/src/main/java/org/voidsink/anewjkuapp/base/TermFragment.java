// isComment
package org.voidsink.anewjkuapp.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import org.voidsink.anewjkuapp.analytics.Analytics;
import org.voidsink.anewjkuapp.kusss.Term;
import org.voidsink.anewjkuapp.utils.Consts;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class isClassOrIsInterface extends BaseFragment {

    private List<Term> isVariable;

    private void isMethod(String[] isParameter) {
        if (isNameExpr != null && isNameExpr.isFieldAccessExpr > isIntegerConstant) {
            try {
                isNameExpr = new ArrayList<>();
                for (String isVariable : isNameExpr) {
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                }
            } catch (ParseException isParameter) {
                isNameExpr = null;
                isNameExpr.isMethod(isMethod(), isNameExpr, true);
            }
        }
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    protected List<Term> isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(@NonNull Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            String[] isVariable = new String[isNameExpr.isMethod()];
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                isNameExpr[isNameExpr] = isNameExpr.isMethod(isNameExpr).isMethod();
            }
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        }
    }
}
