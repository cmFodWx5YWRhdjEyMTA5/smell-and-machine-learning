// isComment
package net.nightwhistler.pageturner.library;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import jedi.option.Option;
import static jedi.option.Options.none;
import static jedi.option.Options.option;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T> extends BaseAdapter {

    QueryResult<T> isVariable;

    public void isMethod(QueryResult<T> isParameter) {
        if (this.isFieldAccessExpr != null) {
            this.isFieldAccessExpr.isMethod();
        }
        this.isFieldAccessExpr = isNameExpr;
        isMethod();
    }

    public void isMethod() {
        if (this.isFieldAccessExpr != null) {
            isNameExpr.isMethod();
        }
        isNameExpr = null;
        isMethod();
    }

    @Override
    public int isMethod() {
        if (this.isFieldAccessExpr == null) {
            return isIntegerConstant;
        }
        return isNameExpr.isMethod();
    }

    @Override
    public Object isMethod(int isParameter) {
        return isMethod(isNameExpr).isMethod();
    }

    @Override
    public long isMethod(int isParameter) {
        return isNameExpr;
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        return isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr, isNameExpr);
    }

    public Option<T> isMethod(int isParameter) {
        if (isNameExpr == null) {
            return isMethod();
        }
        return isMethod(isNameExpr.isMethod(isNameExpr));
    }

    public abstract View isMethod(int isParameter, T isParameter, View isParameter, ViewGroup isParameter);
}
