// isComment
package com.keepassdroid.database.iterator;

import java.util.Iterator;
import com.keepassdroid.database.PwEntry;
import com.keepassdroid.database.PwEntryV3;
import com.keepassdroid.database.PwEntryV4;
import com.keepassdroid.database.SearchParameters;
import com.keepassdroid.database.SearchParametersV4;

public abstract class isClassOrIsInterface implements Iterator<String> {

    public static EntrySearchStringIterator isMethod(PwEntry isParameter) {
        if (isNameExpr instanceof PwEntryV3) {
            return new EntrySearchStringIteratorV3((PwEntryV3) isNameExpr);
        } else if (isNameExpr instanceof PwEntryV4) {
            return new EntrySearchStringIteratorV4((PwEntryV4) isNameExpr);
        } else {
            throw new RuntimeException("isStringConstant");
        }
    }

    public static EntrySearchStringIterator isMethod(PwEntry isParameter, SearchParameters isParameter) {
        if (isNameExpr instanceof PwEntryV3) {
            return new EntrySearchStringIteratorV3((PwEntryV3) isNameExpr, isNameExpr);
        } else if (isNameExpr instanceof PwEntryV4) {
            return new EntrySearchStringIteratorV4((PwEntryV4) isNameExpr, (SearchParametersV4) isNameExpr);
        } else {
            throw new RuntimeException("isStringConstant");
        }
    }

    @Override
    public abstract boolean isMethod();

    @Override
    public abstract String isMethod();

    @Override
    public void isMethod() {
        throw new UnsupportedOperationException("isStringConstant");
    }
}
