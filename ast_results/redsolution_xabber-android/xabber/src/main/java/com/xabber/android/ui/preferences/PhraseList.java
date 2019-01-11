// isComment
package com.xabber.android.ui.preferences;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.xabber.android.R;
import com.xabber.android.data.Application;
import com.xabber.android.data.message.phrase.PhraseManager;
import com.xabber.android.ui.activity.PreferenceSummaryHelperActivity;
import com.xabber.android.ui.adapter.BaseListEditorAdapter;
import com.xabber.android.ui.adapter.PhraseListAdapter;

public class isClassOrIsInterface extends BaseListEditor<Integer> {

    public static Intent isMethod(Context isParameter) {
        return new Intent(isNameExpr, PhraseList.class);
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    protected Intent isMethod() {
        return isNameExpr.isMethod(this);
    }

    @Override
    protected Intent isMethod(Integer isParameter) {
        return isNameExpr.isMethod(this, isNameExpr);
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    protected String isMethod(Integer isParameter) {
        String isVariable = isNameExpr.isMethod().isMethod(isNameExpr).isMethod();
        if ("isStringConstant".isMethod(isNameExpr))
            isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
    }

    @Override
    protected void isMethod(Integer isParameter) {
        isNameExpr.isMethod().isMethod(isNameExpr);
    }

    @Override
    protected BaseListEditorAdapter<Integer> isMethod() {
        return new PhraseListAdapter(this);
    }

    @Override
    protected Integer isMethod(Bundle isParameter, String isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    protected void isMethod(Bundle isParameter, String isParameter, Integer isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    protected CharSequence isMethod() {
        return isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }
}
