// isComment
package com.vrem.wifianalyzer.vendor;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.vrem.wifianalyzer.MainContext;
import com.vrem.wifianalyzer.R;
import com.vrem.wifianalyzer.vendor.model.VendorService;

class isClassOrIsInterface extends ArrayAdapter<String> {

    private final VendorService isVariable;

    isConstructor(@NonNull Context isParameter, @NonNull VendorService isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod());
        this.isFieldAccessExpr = isNameExpr;
    }

    @NonNull
    @Override
    public View isMethod(int isParameter, @Nullable View isParameter, @NonNull ViewGroup isParameter) {
        View isVariable = isNameExpr;
        if (isNameExpr == null) {
            LayoutInflater isVariable = isNameExpr.isFieldAccessExpr.isMethod();
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        }
        String isVariable = isMethod(isNameExpr);
        isNameExpr.<TextView>isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr);
        isNameExpr.<TextView>isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr)));
        return isNameExpr;
    }

    void isMethod(@NonNull String isParameter) {
        isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr));
    }
}
