// isComment
package org.bouncycastle.openpgp.jcajce;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.openpgp.PGPMarker;

/**
 * isComment
 */
public class isClassOrIsInterface extends JcaPGPObjectFactory {

    public isConstructor(InputStream isParameter) {
        super(isNameExpr);
    }

    @Override
    public Object isMethod() throws IOException {
        Object isVariable = super.isMethod();
        while (isNameExpr instanceof PGPMarker) {
            isNameExpr = super.isMethod();
        }
        return isNameExpr;
    }
}
