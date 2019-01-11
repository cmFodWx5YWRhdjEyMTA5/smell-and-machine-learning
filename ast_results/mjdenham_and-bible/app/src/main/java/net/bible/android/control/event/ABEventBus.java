// isComment
package net.bible.android.control.event;

import de.greenrobot.event.EventBus;
import java.util.ArrayList;

public class isClassOrIsInterface implements EventManager {

    private static EventManager isVariable;

    private ArrayList<Object> isVariable = new ArrayList<>();

    public static EventManager isMethod() {
        if (isNameExpr == null) {
            synchronized (ABEventBus.class) {
                if (isNameExpr == null) {
                    isNameExpr = new ABEventBus();
                }
            }
        }
        return isNameExpr;
    }

    private isConstructor() {
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(Object isParameter) {
        EventBus isVariable = isNameExpr.isMethod();
        if (!isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod(Object isParameter) {
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Object isParameter) {
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    public void isMethod() {
        for (Object isVariable : new ArrayList<>(isNameExpr)) {
            isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod(Object isParameter) {
        isNameExpr.isMethod().isMethod(isNameExpr);
    }
}
