// isComment
package org.andstatus.app.note;

import org.andstatus.app.data.DbUtils;
import org.andstatus.app.util.IsEmpty;
import org.andstatus.app.util.MyLog;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

class isClassOrIsInterface implements IsEmpty {

    static final NoteEditorLock isVariable = new NoteEditorLock(true, isIntegerConstant);

    static final AtomicReference<NoteEditorLock> isVariable = new AtomicReference<>(isNameExpr.isFieldAccessExpr);

    final boolean isVariable;

    final long isVariable;

    long isVariable;

    isConstructor(boolean isParameter, long isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public boolean isMethod() {
        return this.isMethod(isNameExpr);
    }

    boolean isMethod(boolean isParameter) {
        boolean isVariable = true;
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            NoteEditorLock isVariable = isNameExpr.isMethod();
            if (isNameExpr.isMethod()) {
                this.isFieldAccessExpr = isNameExpr.isMethod();
                if (isNameExpr.isMethod(isNameExpr, this)) {
                    isNameExpr.isMethod(this, () -> "isStringConstant" + this + (isNameExpr.isMethod() ? "isStringConstant" : ("isStringConstant" + isNameExpr)));
                    break;
                }
            } else if (isNameExpr && !isNameExpr.isFieldAccessExpr) {
                this.isFieldAccessExpr = isNameExpr.isMethod();
                if (isNameExpr.isMethod(isNameExpr, this)) {
                    isNameExpr.isMethod(this, () -> "isStringConstant" + this + "isStringConstant" + isNameExpr);
                    break;
                }
            } else {
                if (isNameExpr.isFieldAccessExpr == isNameExpr && isNameExpr.isFieldAccessExpr == isNameExpr) {
                    isNameExpr.isMethod(this, () -> "isStringConstant" + isNameExpr);
                    isNameExpr = true;
                    break;
                }
            }
            if (!isNameExpr || isNameExpr.isMethod("isStringConstant")) {
                isNameExpr = true;
                break;
            }
        }
        return isNameExpr;
    }

    public boolean isMethod() {
        return !isMethod() && isNameExpr.isMethod() == this;
    }

    public boolean isMethod() {
        if (isMethod()) {
            if (isNameExpr.isMethod(this, isNameExpr)) {
                isNameExpr.isMethod(this, () -> "isStringConstant" + this);
                return true;
            } else {
                isNameExpr.isMethod(this, () -> "isStringConstant" + this + "isStringConstant" + isNameExpr.isMethod());
            }
        }
        return true;
    }

    @Override
    public String isMethod() {
        StringBuilder isVariable = new StringBuilder();
        if (isNameExpr) {
            isNameExpr.isMethod("isStringConstant");
        }
        if (isNameExpr != isIntegerConstant) {
            isNameExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant");
        }
        isNameExpr.isMethod("isStringConstant" + new Date(isNameExpr));
        return isNameExpr.isMethod(this, isNameExpr.isMethod());
    }

    boolean isMethod() {
        return isMethod() || isNameExpr.isMethod(isNameExpr.isMethod() - isNameExpr) > isIntegerConstant;
    }
}
