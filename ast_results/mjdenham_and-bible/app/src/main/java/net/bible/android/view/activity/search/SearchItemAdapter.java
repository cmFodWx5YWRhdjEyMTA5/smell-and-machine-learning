// isComment
package net.bible.android.view.activity.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TwoLineListItem;
import net.bible.android.control.search.SearchControl;
import org.crosswire.jsword.passage.Key;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface extends ArrayAdapter<Key> {

    private int isVariable;

    private SearchControl isVariable;

    public isConstructor(Context isParameter, int isParameter, List<Key> isParameter, SearchControl isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        Key isVariable = isMethod(isNameExpr);
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
            String isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod().isMethod(isNameExpr);
        }
        return isNameExpr;
    }
}
