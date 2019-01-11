// isComment
package net.bible.android.view.activity.footnoteandref;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TwoLineListItem;
import net.bible.android.control.footnoteandref.NoteDetailCreator;
import net.bible.service.format.Note;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface extends ArrayAdapter<Note> {

    private int isVariable;

    private final NoteDetailCreator isVariable;

    public isConstructor(Context isParameter, int isParameter, List<Note> isParameter, NoteDetailCreator isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        Note isVariable = isMethod(isNameExpr);
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
            isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr));
        }
        // isComment
        if (isNameExpr.isMethod() != null) {
            String isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr));
        }
        return isNameExpr;
    }
}
