// isComment
package org.voidsink.anewjkuapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import org.voidsink.anewjkuapp.base.SlidingTabItem;
import org.voidsink.anewjkuapp.kusss.Term;
import org.voidsink.anewjkuapp.utils.Consts;
import java.util.List;

public class isClassOrIsInterface extends SlidingTabItem {

    private final List<Term> isVariable;

    public isConstructor(CharSequence isParameter, List<Term> isParameter, Class<? extends Fragment> isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    protected List<Term> isMethod() {
        return isNameExpr;
    }

    @Override
    protected Bundle isMethod() {
        Bundle isVariable = new Bundle();
        if (isNameExpr != null) {
            String[] isVariable = new String[isNameExpr.isMethod()];
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                isNameExpr[isNameExpr] = isNameExpr.isMethod(isNameExpr).isMethod();
            }
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        }
        return isNameExpr;
    }
}
