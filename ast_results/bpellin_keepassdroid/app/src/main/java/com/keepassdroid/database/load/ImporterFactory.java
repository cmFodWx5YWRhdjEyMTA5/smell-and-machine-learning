// isComment
package com.keepassdroid.database.load;

import java.io.IOException;
import java.io.InputStream;
import com.keepassdroid.database.PwDbHeaderV3;
import com.keepassdroid.database.PwDbHeaderV4;
import com.keepassdroid.database.exception.InvalidDBSignatureException;
import com.keepassdroid.stream.LEDataInputStream;

public class isClassOrIsInterface {

    public static Importer isMethod(InputStream isParameter) throws InvalidDBSignatureException, IOException {
        return isMethod(isNameExpr, true);
    }

    public static Importer isMethod(InputStream isParameter, boolean isParameter) throws InvalidDBSignatureException, IOException {
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr.isMethod(isNameExpr, isNameExpr)) {
            if (isNameExpr) {
                return new ImporterV3Debug();
            }
            return new ImporterV3();
        } else if (isNameExpr.isMethod(isNameExpr, isNameExpr)) {
            return new ImporterV4();
        }
        throw new InvalidDBSignatureException();
    }
}
