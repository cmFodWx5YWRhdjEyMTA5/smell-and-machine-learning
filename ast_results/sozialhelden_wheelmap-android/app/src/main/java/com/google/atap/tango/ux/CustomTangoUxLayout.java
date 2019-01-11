// isComment
package com.google.atap.tango.ux;

import android.content.Context;
import android.util.AttributeSet;
import rx.Observable;
import rx.subjects.BehaviorSubject;

public class isClassOrIsInterface extends TangoUxLayout {

    public enum ConnectionStatus {

        SHOW, HIDE
    }

    private BehaviorSubject<ConnectionStatus> isVariable = isNameExpr.isMethod();

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
    void isMethod(boolean isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    void isMethod(boolean isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    public Observable<ConnectionStatus> isMethod() {
        return isNameExpr;
    }
}
