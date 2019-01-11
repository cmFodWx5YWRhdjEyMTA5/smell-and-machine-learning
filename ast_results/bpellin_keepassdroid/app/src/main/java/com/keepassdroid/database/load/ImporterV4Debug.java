// isComment
package com.keepassdroid.database.load;

import java.io.IOException;
import java.io.InputStream;
import com.keepassdroid.UpdateStatus;
import com.keepassdroid.database.PwDatabaseV4Debug;
import com.keepassdroid.database.exception.InvalidDBException;

public class isClassOrIsInterface extends ImporterV4 {

    @Override
    protected PwDatabaseV4Debug isMethod() {
        return new PwDatabaseV4Debug();
    }

    @Override
    public PwDatabaseV4Debug isMethod(InputStream isParameter, String isParameter, InputStream isParameter, UpdateStatus isParameter, long isParameter) throws IOException, InvalidDBException {
        return (PwDatabaseV4Debug) super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }
}
