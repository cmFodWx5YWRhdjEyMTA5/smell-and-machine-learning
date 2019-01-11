// isComment
package fr.xgouchet.texteditor;

import java.io.File;
import java.util.LinkedList;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import de.neofonie.mobile.app.android.widget.crouton.Crouton;
import de.neofonie.mobile.app.android.widget.crouton.Style;
import fr.xgouchet.androidlib.ui.activity.AbstractBrowsingActivity;
import fr.xgouchet.texteditor.ui.adapter.FontListAdapter;

public class isClassOrIsInterface extends AbstractBrowsingActivity implements OnClickListener {

    /**
     * isComment
     */
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant");
        // isComment
        isMethod(isNameExpr, null);
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(this);
        isNameExpr = new FontListAdapter(this, new LinkedList<File>());
    }

    /**
     * isComment
     */
    protected void isMethod(File isParameter) {
        if (isMethod(isNameExpr))
            isMethod();
    }

    /**
     * isComment
     */
    protected boolean isMethod(File isParameter) {
        return true;
    }

    /**
     * isComment
     */
    protected void isMethod() {
    }

    /**
     * isComment
     */
    public boolean isMethod(int isParameter, KeyEvent isParameter) {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            // isComment
            File isVariable = isNameExpr.isMethod();
            if ((isNameExpr != null) && (isNameExpr.isMethod())) {
                isMethod(isNameExpr);
                return true;
            }
        }
        return super.isMethod(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public void isMethod(View isParameter) {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            isMethod(isNameExpr);
            isMethod();
        }
    }

    /**
     * isComment
     */
    protected boolean isMethod(File isParameter) {
        Intent isVariable;
        if (!isNameExpr.isMethod()) {
            isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            return true;
        }
        isNameExpr = new Intent();
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr, isNameExpr);
        return true;
    }
}
