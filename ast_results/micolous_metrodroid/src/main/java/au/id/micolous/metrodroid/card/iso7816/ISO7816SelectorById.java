// isComment
package au.id.micolous.metrodroid.card.iso7816;

import org.simpleframework.xml.Element;
import java.io.IOException;

class isClassOrIsInterface extends ISO7816SelectorElement {

    @Element(name = "isStringConstant")
    private int isVariable;

    public static final String isVariable = "isStringConstant";

    @Override
    byte[] isMethod(ISO7816Protocol isParameter) throws IOException {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + isNameExpr.isMethod(isNameExpr);
    }

    isConstructor() {
    /*isComment*/
    }

    isConstructor(int isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (!(isNameExpr instanceof ISO7816SelectorById))
            return true;
        return ((ISO7816SelectorById) isNameExpr).isFieldAccessExpr == isNameExpr;
    }
}
