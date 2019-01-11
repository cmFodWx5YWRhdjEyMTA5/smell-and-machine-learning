// isComment
package com.twistedplane.sealnote.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import com.twistedplane.sealnote.data.Note;
import com.twistedplane.sealnote.data.NoteContent;
import com.twistedplane.sealnote.utils.FontCache;
import com.twistedplane.sealnote.utils.PreferenceHandler;

/**
 * isComment
 */
public class isClassOrIsInterface extends EditText implements NoteView {

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        isMethod();
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod();
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isMethod();
    }

    public void isMethod() {
        // isComment
        isMethod(isNameExpr.isMethod(isMethod(), isNameExpr.isMethod()));
    }

    /**
     * isComment
     */
    @Override
    public NoteContent isMethod() {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod().isMethod());
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(NoteContent isParameter) {
        isMethod(isNameExpr.isMethod());
    }
}
