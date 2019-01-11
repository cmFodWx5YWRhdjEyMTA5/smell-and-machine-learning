// isComment
package com.keepassdroid.database.load;

import java.io.IOException;
import java.io.InputStream;
import com.keepassdroid.UpdateStatus;
import com.keepassdroid.database.PwDatabaseV3Debug;
import com.keepassdroid.database.exception.InvalidDBException;

public class isClassOrIsInterface extends ImporterV3 {

    @Override
    protected PwDatabaseV3Debug isMethod() {
        return new PwDatabaseV3Debug();
    }

    @Override
    public PwDatabaseV3Debug isMethod(InputStream isParameter, String isParameter, InputStream isParameter, UpdateStatus isParameter, long isParameter) throws IOException, InvalidDBException {
        return (PwDatabaseV3Debug) super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }
}
