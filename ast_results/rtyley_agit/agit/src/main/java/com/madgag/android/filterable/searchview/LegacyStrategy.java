// isComment
package com.madgag.android.filterable.searchview;

import static android.content.Context.INPUT_METHOD_SERVICE;
import static android.view.inputmethod.InputMethodManager.SHOW_IMPLICIT;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.actionbarsherlock.view.MenuItem;

public class isClassOrIsInterface implements SearchViewStrategy {

    @Override
    public void isMethod(MenuItem isParameter, final OnFilterTextListener isParameter) {
        final TextView isVariable = (TextView) isNameExpr.isMethod();
        isNameExpr.isMethod(new TextWatcher() {

            public void isMethod(Editable isParameter) {
            }

            public void isMethod(CharSequence isParameter, int isParameter, int isParameter, int isParameter) {
            }

            public void isMethod(CharSequence isParameter, int isParameter, int isParameter, int isParameter) {
                isNameExpr.isMethod(isNameExpr.isMethod());
            }
        });
        isNameExpr.isMethod(new TextView.OnEditorActionListener() {

            public boolean isMethod(TextView isParameter, int isParameter, KeyEvent isParameter) {
                isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
                return true;
            }
        });
        isNameExpr.isMethod(new MenuItem.OnActionExpandListener() {

            @Override
            public boolean isMethod(MenuItem isParameter) {
                InputMethodManager isVariable = isMethod();
                if (isNameExpr != null) {
                    isNameExpr.isMethod(isNameExpr.isMethod(), isIntegerConstant);
                }
                return true;
            }

            @Override
            public boolean isMethod(MenuItem isParameter) {
                isNameExpr.isMethod(new Runnable() {

                    @Override
                    public void isMethod() {
                        isNameExpr.isMethod();
                        isMethod().isMethod(isNameExpr, isNameExpr);
                    }
                });
                return true;
            }

            private InputMethodManager isMethod() {
                return (InputMethodManager) isNameExpr.isMethod().isMethod(isNameExpr);
            }
        });
    }

    @Override
    public void isMethod(View isParameter, CharSequence isParameter) {
        ((TextView) isNameExpr).isMethod(isNameExpr);
    }
}
