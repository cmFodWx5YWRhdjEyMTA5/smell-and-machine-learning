// isComment
package com.google.android.apps.mytracks.io.maps;

import com.google.android.apps.mytracks.io.fusiontables.SendFusionTablesActivity;
import com.google.android.apps.mytracks.io.sendtogoogle.AbstractSendActivity;
import com.google.android.apps.mytracks.io.sendtogoogle.AbstractSendAsyncTask;
import com.google.android.apps.mytracks.io.sendtogoogle.SendRequest;
import com.google.android.apps.mytracks.io.sendtogoogle.UploadResultActivity;
import com.google.android.apps.mytracks.io.spreadsheets.SendSpreadsheetsActivity;
import com.google.android.apps.mytracks.util.IntentUtils;
import com.google.android.maps.mytracks.R;
import com.google.common.annotations.VisibleForTesting;
import android.content.Intent;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractSendActivity {

    @Override
    protected AbstractSendAsyncTask isMethod() {
        return new SendMapsAsyncTask(this, isNameExpr.isMethod(), isNameExpr.isMethod());
    }

    @Override
    protected String isMethod() {
        return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected void isMethod(boolean isParameter, boolean isParameter) {
        isNameExpr.isMethod(isNameExpr);
        Class<?> isVariable = isMethod(isNameExpr, isNameExpr);
        Intent isVariable = isNameExpr.isMethod(this, isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr);
        isMethod();
    }

    @VisibleForTesting
    Class<?> isMethod(SendRequest isParameter, boolean isParameter) {
        if (isNameExpr) {
            return UploadResultActivity.class;
        } else {
            if (isNameExpr.isMethod()) {
                return SendFusionTablesActivity.class;
            } else if (isNameExpr.isMethod()) {
                return SendSpreadsheetsActivity.class;
            } else {
                return UploadResultActivity.class;
            }
        }
    }
}
