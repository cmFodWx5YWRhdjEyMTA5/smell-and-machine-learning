// isComment
package fr.neamar.kiss.result;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import fr.neamar.kiss.R;
import fr.neamar.kiss.adapter.RecordAdapter;
import fr.neamar.kiss.pojo.SearchPojo;
import fr.neamar.kiss.ui.ListPopup;
import fr.neamar.kiss.utils.FuzzyScore;

public class isClassOrIsInterface extends Result {

    private final SearchPojo isVariable;

    isConstructor(SearchPojo isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public View isMethod(Context isParameter, int isParameter, View isParameter, FuzzyScore isParameter) {
        if (isNameExpr == null)
            isNameExpr = isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        TextView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        ImageView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        String isVariable;
        int isVariable;
        int isVariable;
        if (isNameExpr.isFieldAccessExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), this.isFieldAccessExpr.isMethod());
            isNameExpr = isNameExpr.isMethod(this.isFieldAccessExpr.isMethod());
            isNameExpr = this.isFieldAccessExpr.isMethod().isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr.isFieldAccessExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), this.isFieldAccessExpr.isMethod(), isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isFieldAccessExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr = isNameExpr.isMethod("isStringConstant");
            isNameExpr = isNameExpr.isMethod() - isNameExpr;
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        isMethod(isNameExpr, isNameExpr.isMethod(new Pair<>(isNameExpr, isNameExpr + isNameExpr)), isNameExpr, isNameExpr);
        isNameExpr.isMethod(isMethod(isNameExpr), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        return isNameExpr;
    }

    @Override
    public void isMethod(Context isParameter, View isParameter) {
        String isVariable;
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        } catch (UnsupportedEncodingException isParameter) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        String isVariable = isNameExpr.isFieldAccessExpr.isMethod("isStringConstant", isNameExpr);
        Uri isVariable = isNameExpr.isMethod(isNameExpr);
        Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        try {
            isNameExpr.isMethod(isNameExpr);
        } catch (android.content.ActivityNotFoundException isParameter) {
            isNameExpr.isMethod("isStringConstant", "isStringConstant" + isNameExpr.isFieldAccessExpr);
        }
    }

    @Override
    protected ListPopup isMethod(Context isParameter, ArrayAdapter<ListPopup.Item> isParameter, final RecordAdapter isParameter, View isParameter) {
        isNameExpr.isMethod(new ListPopup.Item(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        return isMethod(isNameExpr, isNameExpr);
    }

    @Override
    protected boolean isMethod(Context isParameter, RecordAdapter isParameter, int isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                Intent isVariable = new Intent();
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr);
                return true;
        }
        return super.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }
}
