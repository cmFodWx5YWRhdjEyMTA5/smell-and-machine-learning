// isComment
package jackpal.androidterm;

import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import jackpal.androidterm.util.TermSettings;

class isClassOrIsInterface extends GenericTermSession {

    private final String isVariable;

    private boolean isVariable;

    isConstructor(ParcelFileDescriptor isParameter, TermSettings isParameter, String isParameter) {
        super(isNameExpr, isNameExpr, true);
        this.isFieldAccessExpr = isNameExpr;
        isMethod(new ParcelFileDescriptor.AutoCloseInputStream(isNameExpr));
        isMethod(new ParcelFileDescriptor.AutoCloseOutputStream(isNameExpr));
    }

    @Override
    public String isMethod() {
        final String isVariable = super.isMethod();
        return isNameExpr.isMethod(isNameExpr) ? isNameExpr : isNameExpr + "isStringConstant" + isNameExpr;
    }

    @Override
    public void isMethod(int isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isNameExpr = true;
    }

    @Override
    boolean isMethod() {
        return !isNameExpr;
    }
}
