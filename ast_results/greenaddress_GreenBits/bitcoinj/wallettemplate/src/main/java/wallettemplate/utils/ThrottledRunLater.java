// isComment
package wallettemplate.utils;

import javafx.application.Platform;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * isComment
 */
public class isClassOrIsInterface implements Runnable {

    private final Runnable isVariable;

    private final AtomicBoolean isVariable = new AtomicBoolean();

    /**
     * isComment
     */
    public isConstructor() {
        this.isFieldAccessExpr = null;
    }

    /**
     * isComment
     */
    public isConstructor(Runnable isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(Runnable isParameter) {
        if (!isNameExpr.isMethod(true)) {
            isNameExpr.isMethod(() -> {
                isNameExpr.isMethod(true);
                isNameExpr.isMethod();
            });
        }
    }

    public void isMethod() {
        isMethod(isNameExpr != null ? isNameExpr : this);
    }

    @Override
    public void isMethod() {
    }
}
