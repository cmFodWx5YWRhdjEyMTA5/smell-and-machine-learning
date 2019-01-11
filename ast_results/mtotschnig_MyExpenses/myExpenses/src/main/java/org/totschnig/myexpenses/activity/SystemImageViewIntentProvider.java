// isComment
package org.totschnig.myexpenses.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import org.totschnig.myexpenses.util.AppDirHelper;
import org.totschnig.myexpenses.util.DistribHelper;
import org.totschnig.myexpenses.util.NougatFileProviderException;

public class isClassOrIsInterface implements ImageViewIntentProvider {

    public Intent isMethod(Context isParameter, Uri isParameter) {
        if (isNameExpr.isMethod()) {
            return isMethod(isNameExpr, isNameExpr);
        }
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        } catch (NougatFileProviderException isParameter) {
            return isMethod(isNameExpr, isNameExpr);
        }
        Intent isVariable = isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        return isNameExpr;
    }

    private Intent isMethod(Context isParameter, Uri isParameter) {
        return new Intent(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr, SimpleImageActivity.class);
    }

    @NonNull
    protected Intent isMethod(Uri isParameter) {
        return new Intent(isNameExpr.isFieldAccessExpr, isNameExpr);
    }
}
