// isComment
package be.digitalia.fosdem.adapters;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    private Cursor isVariable;

    private int isVariable = -isIntegerConstant;

    public isConstructor() {
        isMethod(true);
    }

    /**
     * isComment
     */
    public Cursor isMethod(Cursor isParameter) {
        if (isNameExpr == isNameExpr) {
            return null;
        }
        Cursor isVariable = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = (isNameExpr == null) ? -isIntegerConstant : isNameExpr.isMethod("isStringConstant");
        isMethod();
        return isNameExpr;
    }

    public Cursor isMethod() {
        return isNameExpr;
    }

    @Override
    public int isMethod() {
        return (isNameExpr == null) ? isIntegerConstant : isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public Object isMethod(int isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    @Override
    public long isMethod(int isParameter) {
        if ((isNameExpr != null) && isNameExpr.isMethod(isNameExpr)) {
            return isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(@NonNull VH isParameter, int isParameter) {
        if (isNameExpr == null) {
            throw new IllegalStateException("isStringConstant");
        }
        if (!isNameExpr.isMethod(isNameExpr)) {
            throw new IllegalStateException("isStringConstant" + isNameExpr);
        }
        isMethod(isNameExpr, isNameExpr);
    }

    public abstract void isMethod(VH isParameter, Cursor isParameter);
}
