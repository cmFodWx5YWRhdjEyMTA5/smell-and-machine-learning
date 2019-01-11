// isComment
package com.google.android.apps.mytracks.io.spreadsheets;

import com.google.android.apps.mytracks.io.sendtogoogle.AbstractSendActivity;
import com.google.android.apps.mytracks.io.sendtogoogle.AbstractSendAsyncTask;
import com.google.android.apps.mytracks.io.sendtogoogle.SendRequest;
import com.google.android.apps.mytracks.io.sendtogoogle.UploadResultActivity;
import com.google.android.apps.mytracks.util.IntentUtils;
import com.google.android.maps.mytracks.R;
import android.content.Intent;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractSendActivity {

    @Override
    protected AbstractSendAsyncTask isMethod() {
        return new SendSpreadsheetsAsyncTask(this, isNameExpr.isMethod(), isNameExpr.isMethod());
    }

    @Override
    protected String isMethod() {
        return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected void isMethod(boolean isParameter, boolean isParameter) {
        isNameExpr.isMethod(isNameExpr);
        Intent isVariable = isNameExpr.isMethod(this, UploadResultActivity.class).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr);
        isMethod();
    }
}
