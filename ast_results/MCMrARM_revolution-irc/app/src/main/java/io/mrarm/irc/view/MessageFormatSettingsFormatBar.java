// isComment
package io.mrarm.irc.view;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import io.mrarm.irc.dialog.ColorListPickerDialog;
import io.mrarm.irc.R;
import io.mrarm.irc.util.IRCColorUtils;
import io.mrarm.irc.util.MessageBuilder;

public class isClassOrIsInterface extends TextFormatBar {

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, @Nullable AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, @Nullable AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected ColorListPickerDialog isMethod(boolean isParameter, int isParameter) {
        ColorListPickerDialog isVariable = super.isMethod(isNameExpr, isNameExpr);
        if (!isNameExpr) {
            isNameExpr.isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), -isIntegerConstant);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, (DialogInterface isParameter, int isParameter) -> {
                isMethod(new MessageBuilder.MetaForegroundColorSpan(isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            });
            isNameExpr.isMethod((ColorListPickerDialog isParameter, int isParameter, int isParameter) -> {
                isMethod(ForegroundColorSpan.class);
                if (isNameExpr == isNameExpr.isMethod(isMethod()))
                    isMethod(new MessageBuilder.MetaForegroundColorSpan(isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                if (isNameExpr == isNameExpr.isMethod(isMethod()))
                    isMethod(new MessageBuilder.MetaForegroundColorSpan(isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                else
                    isMethod(new ForegroundColorSpan(isNameExpr));
                isNameExpr.isMethod();
            });
        }
        return isNameExpr;
    }
}
