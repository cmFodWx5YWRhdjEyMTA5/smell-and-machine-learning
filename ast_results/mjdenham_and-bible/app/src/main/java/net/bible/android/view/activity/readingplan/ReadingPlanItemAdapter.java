// isComment
package net.bible.android.view.activity.readingplan;

import java.util.List;
import net.bible.service.readingplan.ReadingPlanInfoDto;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TwoLineListItem;

/**
 * isComment
 */
public class isClassOrIsInterface extends ArrayAdapter<ReadingPlanInfoDto> {

    private int isVariable;

    public isConstructor(Context isParameter, int isParameter, List<ReadingPlanInfoDto> isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        ReadingPlanInfoDto isVariable = isMethod(isNameExpr);
        // isComment
        TwoLineListItem isVariable;
        if (isNameExpr == null) {
            LayoutInflater isVariable = (LayoutInflater) isMethod().isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = (TwoLineListItem) isNameExpr.isMethod(isNameExpr, isNameExpr, true);
        } else {
            isNameExpr = (TwoLineListItem) isNameExpr;
        }
        // isComment
        if (isNameExpr.isMethod() != null) {
            String isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod().isMethod(isNameExpr);
        }
        // isComment
        if (isNameExpr.isMethod() != null) {
            String isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod().isMethod(isNameExpr);
        }
        return isNameExpr;
    }
}
