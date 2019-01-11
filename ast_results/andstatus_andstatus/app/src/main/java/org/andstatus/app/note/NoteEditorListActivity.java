// isComment
package org.andstatus.app.note;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import org.andstatus.app.ActivityRequestCode;
import org.andstatus.app.service.CommandData;
import org.andstatus.app.timeline.LoadableListActivity;
import org.andstatus.app.timeline.ViewItem;
import org.andstatus.app.util.TriState;
import org.andstatus.app.util.UriUtils;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T extends ViewItem<T>> extends LoadableListActivity<T> implements NoteEditorContainer {

    private NoteEditor isVariable;

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (!isMethod()) {
            isNameExpr = new NoteEditor(this);
        }
    }

    @Override
    public boolean isMethod() {
        if (isNameExpr != null && isNameExpr.isMethod()) {
            return true;
        }
        return super.isMethod();
    }

    @Override
    public void isMethod(int isParameter, int isParameter, Intent isParameter) {
        switch(isNameExpr.isMethod(isNameExpr)) {
            case isNameExpr:
                if (isNameExpr == isNameExpr && isNameExpr != null) {
                    isMethod(isNameExpr);
                }
                break;
            default:
                super.isMethod(isNameExpr, isNameExpr, isNameExpr);
                break;
        }
    }

    private void isMethod(Intent isParameter) {
        Uri isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        if (!isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr.isMethod());
            isMethod().isMethod(isNameExpr);
        }
    }

    @Override
    public boolean isMethod(int isParameter, KeyEvent isParameter) {
        if (isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod() == isIntegerConstant && isNameExpr != null && isNameExpr.isMethod()) {
            if (isMethod().isMethod()) {
                isMethod().isMethod(isNameExpr.isFieldAccessExpr);
            } else
                isNameExpr.isMethod();
            return true;
        }
        return super.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod() {
        if (isNameExpr != null)
            isNameExpr.isMethod();
        super.isMethod();
    }

    @Override
    protected void isMethod(CommandData isParameter) {
        super.isMethod(isNameExpr);
        switch(isNameExpr.isMethod()) {
            case isNameExpr:
                isNameExpr.isMethod();
                break;
            default:
                break;
        }
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        if (!isNameExpr) {
            isNameExpr.isMethod();
        }
    }

    @Override
    public boolean isMethod(Menu isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        return super.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(Menu isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        return super.isMethod(isNameExpr);
    }

    @Override
    public NoteEditor isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        isMethod();
    }

    @Override
    protected void isMethod(boolean isParameter) {
        if (isNameExpr != null)
            isNameExpr.isMethod(true, isNameExpr);
    }
}
