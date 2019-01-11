// isComment
package de.tobiasbielefeld.solitaire.ui.statistics;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import de.tobiasbielefeld.solitaire.R;

public class isClassOrIsInterface extends FragmentPagerAdapter {

    private final String[] isVariable;

    isConstructor(FragmentManager isParameter, Context isParameter) {
        super(isNameExpr);
        isNameExpr = new String[] { isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) };
    }

    @Override
    public CharSequence isMethod(int isParameter) {
        return isNameExpr[isNameExpr];
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public android.support.v4.app.Fragment isMethod(int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                return new StatisticsFragment();
            case isIntegerConstant:
                return new HighScoresFragment();
            case isIntegerConstant:
                return new RecentScoresFragment();
        }
        return null;
    }
}
