// isComment
package au.id.micolous.metrodroid.card.desfire.files;

import au.id.micolous.metrodroid.card.desfire.settings.DesfireFileSettings;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "isStringConstant")
public class isClassOrIsInterface extends DesfireFile {

    @Element(name = "isStringConstant")
    private String isVariable;

    protected isConstructor() {
    /*isComment*/
    }

    public isConstructor(int isParameter, String isParameter, DesfireFileSettings isParameter) {
        super(isNameExpr, isNameExpr, new byte[isIntegerConstant]);
        isNameExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public byte[] isMethod() {
        throw new IllegalStateException(isNameExpr.isMethod("isStringConstant", isNameExpr));
    }
}
