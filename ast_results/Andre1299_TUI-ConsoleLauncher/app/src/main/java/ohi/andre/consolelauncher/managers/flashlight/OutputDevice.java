// isComment
package ohi.andre.consolelauncher.managers.flashlight;

import android.content.Context;

public abstract class isClassOrIsInterface extends Device {

    private boolean isVariable;

    private OutputDeviceListener isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = true;
    }

    protected abstract void isMethod();

    protected abstract void isMethod();

    public final void isMethod(boolean isParameter) {
        if (this.isFieldAccessExpr) {
            if (isNameExpr && !this.isFieldAccessExpr)
                this.isMethod();
            else if (!isNameExpr && this.isFieldAccessExpr)
                this.isMethod();
        }
    }

    public final void isMethod() {
        this.isMethod(!this.isFieldAccessExpr);
    }

    public final boolean isMethod() {
        return this.isFieldAccessExpr;
    }

    public final void isMethod(OutputDeviceListener isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    protected final void isMethod(boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        if (this.isFieldAccessExpr != null) {
            this.isFieldAccessExpr.isMethod(isNameExpr);
        }
    }

    protected final void isMethod(String isParameter) {
        if (this.isFieldAccessExpr != null) {
            this.isFieldAccessExpr.isMethod(isNameExpr);
        }
    }
}
