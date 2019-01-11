// isComment
package de.hampager.dapnetmobile.tokenautocomplete;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tokenautocomplete.TokenCompleteTextView;
import java.util.ArrayList;
import de.hampager.dap4j.models.TransmitterGroup;
import de.hampager.dapnetmobile.R;

public class isClassOrIsInterface extends TokenCompleteTextView<TransmitterGroup> {

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected View isMethod(TransmitterGroup isParameter) {
        LayoutInflater isVariable = (LayoutInflater) isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        TokenTextView isVariable = (TokenTextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, (ViewGroup) isMethod(), true);
        isNameExpr.isMethod(isNameExpr.isMethod());
        return isNameExpr;
    }

    @Override
    protected TransmitterGroup isMethod(String isParameter) {
        // isComment
        return new TransmitterGroup(isNameExpr, "isStringConstant", new ArrayList<>(), new ArrayList<>());
    }

    @Override
    public void isMethod(boolean isParameter, int isParameter, Rect isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr && isMethod().isMethod() == isIntegerConstant && isMethod().isMethod(isIntegerConstant).isMethod().isMethod("isStringConstant")) {
            isMethod(isMethod().isMethod(isIntegerConstant));
        }
    }
}
