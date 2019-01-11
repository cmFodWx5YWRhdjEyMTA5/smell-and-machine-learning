// isComment
package in.blogspot.anselmbros.torchie.main.manager.device.output;

import android.content.Context;
import in.blogspot.anselmbros.torchie.main.manager.device.Device;
import in.blogspot.anselmbros.torchie.utils.Constants;

public abstract class isClassOrIsInterface extends Device {

    public static final String isVariable = isNameExpr.isFieldAccessExpr;

    private boolean isVariable;

    private OutputDeviceListener isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
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
            this.isFieldAccessExpr.isMethod(this.isFieldAccessExpr, isNameExpr);
        }
    }

    protected final void isMethod(String isParameter) {
        if (this.isFieldAccessExpr != null) {
            this.isFieldAccessExpr.isMethod(isNameExpr);
        }
    }
}
