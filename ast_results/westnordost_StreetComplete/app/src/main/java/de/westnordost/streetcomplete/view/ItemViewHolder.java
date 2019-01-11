// isComment
package de.westnordost.streetcomplete.view;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import de.westnordost.streetcomplete.R;

public class isClassOrIsInterface extends RecyclerView.ViewHolder {

    private ImageView isVariable;

    @Nullable
    private TextView isVariable;

    @Nullable
    private TextView isVariable;

    public interface isClassOrIsInterface {

        void isMethod(int isParameter);
    }

    public isConstructor(@NonNull View isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    public void isMethod(@NonNull Item isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            if (isNameExpr.isFieldAccessExpr != isIntegerConstant)
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            else
                isNameExpr.isMethod(null);
        }
        if (isNameExpr != null) {
            boolean isVariable = isNameExpr.isFieldAccessExpr != isIntegerConstant;
            isNameExpr.isMethod(isNameExpr ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr);
            if (isNameExpr)
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            else
                isNameExpr.isMethod(null);
        }
    }

    public void isMethod(boolean isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    public void isMethod(OnClickListener isParameter) {
        if (isNameExpr == null)
            isNameExpr.isMethod(null);
        isNameExpr.isMethod(isParameter -> {
            int isVariable = isMethod();
            if (isNameExpr != isNameExpr.isFieldAccessExpr)
                isNameExpr.isMethod(isNameExpr);
        });
    }
}
