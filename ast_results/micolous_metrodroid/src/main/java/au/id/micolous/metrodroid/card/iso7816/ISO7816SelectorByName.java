// isComment
package au.id.micolous.metrodroid.card.iso7816;

import org.simpleframework.xml.Element;
import java.io.IOException;
import au.id.micolous.metrodroid.util.Utils;
import au.id.micolous.metrodroid.xml.Base64String;

class isClassOrIsInterface extends ISO7816SelectorElement {

    @Element(name = "isStringConstant")
    private Base64String isVariable;

    public static final String isVariable = "isStringConstant";

    isConstructor() {
    /*isComment*/
    }

    @Override
    byte[] isMethod(ISO7816Protocol isParameter) throws IOException {
        return isNameExpr.isMethod(isNameExpr.isMethod(), true);
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + isNameExpr.isMethod(isNameExpr.isMethod());
    }

    isConstructor(byte[] isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = new Base64String(isNameExpr);
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (!(isNameExpr instanceof ISO7816SelectorByName))
            return true;
        return ((ISO7816SelectorByName) isNameExpr).isFieldAccessExpr.isMethod().isMethod(isNameExpr.isMethod());
    }
}
