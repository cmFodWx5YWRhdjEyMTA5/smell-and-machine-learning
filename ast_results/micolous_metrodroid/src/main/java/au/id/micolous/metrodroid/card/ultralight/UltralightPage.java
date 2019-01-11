// isComment
package au.id.micolous.metrodroid.card.ultralight;

import au.id.micolous.metrodroid.xml.Base64String;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * isComment
 */
@Root(name = "isStringConstant")
public class isClassOrIsInterface {

    @Attribute(name = "isStringConstant")
    private int isVariable;

    @Element(name = "isStringConstant", required = true)
    private Base64String isVariable;

    public isConstructor() {
    }

    public isConstructor(int isParameter, byte[] isParameter) {
        isNameExpr = isNameExpr;
        if (isNameExpr == null) {
            isNameExpr = null;
        } else {
            isNameExpr = new Base64String(isNameExpr);
        }
    }

    public static UltralightPage isMethod(int isParameter, byte[] isParameter) {
        return new UltralightPage(isNameExpr, isNameExpr);
    }

    public int isMethod() {
        return isNameExpr;
    }

    public byte[] isMethod() {
        return isNameExpr.isMethod();
    }
}
