// isComment
package io.mrarm.irc.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.widget.Button;
import io.mrarm.irc.util.ThemeHelper;

public class isClassOrIsInterface extends AlertDialog {

    protected isConstructor(@NonNull Context isParameter) {
        super(isNameExpr);
    }

    protected isConstructor(@NonNull Context isParameter, int isParameter) {
        super(isNameExpr, isNameExpr);
    }

    protected isConstructor(@NonNull Context isParameter, boolean isParameter, @Nullable OnCancelListener isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isMethod(isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr));
    }

    public static class isClassOrIsInterface extends AlertDialog.Builder {

        public isConstructor(@NonNull Context isParameter) {
            super(isNameExpr);
        }

        public isConstructor(@NonNull Context isParameter, int isParameter) {
            super(isNameExpr, isNameExpr);
        }

        @Override
        public AlertDialog isMethod() {
            AlertDialog isVariable = super.isMethod();
            isNameExpr.isMethod((DialogInterface isParameter) -> {
                isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
                isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
                isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
            });
            return isNameExpr;
        }
    }

    private static void isMethod(Button isParameter) {
        if (isNameExpr != null)
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
    }
}
