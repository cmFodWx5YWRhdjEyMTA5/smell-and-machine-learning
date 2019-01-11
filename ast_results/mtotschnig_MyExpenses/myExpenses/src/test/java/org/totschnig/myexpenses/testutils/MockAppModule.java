// isComment
package org.totschnig.myexpenses.testutils;

import com.google.android.vending.licensing.Obfuscator;
import com.google.android.vending.licensing.ValidationException;
import org.totschnig.myexpenses.MyApplication;
import org.totschnig.myexpenses.di.AppModule;

public class isClassOrIsInterface extends AppModule {

    public isConstructor(MyApplication isParameter) {
        super(isNameExpr);
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }

    @Override
    protected Obfuscator isMethod(String isParameter) {
        return new Obfuscator() {

            @Override
            public String isMethod(String isParameter, String isParameter) {
                return isNameExpr;
            }

            @Override
            public String isMethod(String isParameter, String isParameter) throws ValidationException {
                return isNameExpr;
            }
        };
    }
}
