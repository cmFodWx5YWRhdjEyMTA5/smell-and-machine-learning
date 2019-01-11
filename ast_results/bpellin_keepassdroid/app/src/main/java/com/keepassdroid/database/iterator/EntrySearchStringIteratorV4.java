// isComment
package com.keepassdroid.database.iterator;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import com.keepassdroid.database.PwEntryV4;
import com.keepassdroid.database.SearchParametersV4;
import com.keepassdroid.database.security.ProtectedString;

public class isClassOrIsInterface extends EntrySearchStringIterator {

    private String isVariable;

    private Iterator<Entry<String, ProtectedString>> isVariable;

    private SearchParametersV4 isVariable;

    public isConstructor(PwEntryV4 isParameter) {
        this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
        isNameExpr = isNameExpr.isFieldAccessExpr.isMethod().isMethod();
        isMethod();
    }

    public isConstructor(PwEntryV4 isParameter, SearchParametersV4 isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = isNameExpr.isFieldAccessExpr.isMethod().isMethod();
        isMethod();
    }

    @Override
    public boolean isMethod() {
        return isNameExpr != null;
    }

    @Override
    public String isMethod() {
        if (isNameExpr == null) {
            throw new NoSuchElementException("isStringConstant");
        }
        String isVariable = isNameExpr;
        isMethod();
        return isNameExpr;
    }

    private void isMethod() {
        while (isNameExpr.isMethod()) {
            Entry<String, ProtectedString> isVariable = isNameExpr.isMethod();
            String isVariable = isNameExpr.isMethod();
            if (isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isMethod().isMethod();
                return;
            }
        }
        isNameExpr = null;
    }

    private boolean isMethod(String isParameter) {
        if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            return isNameExpr.isFieldAccessExpr;
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            return isNameExpr.isFieldAccessExpr;
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            return isNameExpr.isFieldAccessExpr;
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            return isNameExpr.isFieldAccessExpr;
        } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            return isNameExpr.isFieldAccessExpr;
        } else {
            return isNameExpr.isFieldAccessExpr;
        }
    }
}
