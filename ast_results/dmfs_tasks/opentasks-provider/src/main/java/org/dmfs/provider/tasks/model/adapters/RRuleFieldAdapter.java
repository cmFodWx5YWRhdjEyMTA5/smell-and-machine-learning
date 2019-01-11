// isComment
package org.dmfs.provider.tasks.model.adapters;

import android.content.ContentValues;
import android.database.Cursor;
import org.dmfs.rfc5545.recur.InvalidRecurrenceRuleException;
import org.dmfs.rfc5545.recur.RecurrenceRule;

/**
 * isComment
 */
public final class isClassOrIsInterface<EntityType> extends SimpleFieldAdapter<RecurrenceRule, EntityType> {

    /**
     * isComment
     */
    private final String isVariable;

    /**
     * isComment
     */
    public isConstructor(String isParameter) {
        if (isNameExpr == null) {
            throw new IllegalArgumentException("isStringConstant");
        }
        isNameExpr = isNameExpr;
    }

    @Override
    String isMethod() {
        return isNameExpr;
    }

    @Override
    public RecurrenceRule isMethod(ContentValues isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == null) {
            return null;
        }
        try {
            return new RecurrenceRule(isNameExpr);
        } catch (InvalidRecurrenceRuleException isParameter) {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr + "isStringConstant", isNameExpr);
        }
    }

    @Override
    public RecurrenceRule isMethod(Cursor isParameter) {
        int isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr < isIntegerConstant) {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr + "isStringConstant");
        }
        if (isNameExpr.isMethod(isNameExpr)) {
            return null;
        }
        try {
            return new RecurrenceRule(isNameExpr.isMethod(isNameExpr));
        } catch (InvalidRecurrenceRuleException isParameter) {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant", isNameExpr);
        }
    }

    @Override
    public void isMethod(ContentValues isParameter, RecurrenceRule isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        } else {
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
