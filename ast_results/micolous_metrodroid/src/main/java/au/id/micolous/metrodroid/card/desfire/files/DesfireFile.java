// isComment
package au.id.micolous.metrodroid.card.desfire.files;

import au.id.micolous.metrodroid.card.desfire.settings.DesfireFileSettings;
import au.id.micolous.metrodroid.card.desfire.settings.RecordDesfireFileSettings;
import au.id.micolous.metrodroid.card.desfire.settings.ValueDesfireFileSettings;
import au.id.micolous.metrodroid.xml.Base64String;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "isStringConstant")
public class isClassOrIsInterface {

    @Attribute(name = "isStringConstant")
    private int isVariable;

    @Element(name = "isStringConstant", required = true)
    private DesfireFileSettings isVariable;

    @Element(name = "isStringConstant", required = true)
    private Base64String isVariable;

    isConstructor() {
    /*isComment*/
    }

    isConstructor(int isParameter, DesfireFileSettings isParameter, byte[] isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = new Base64String(isNameExpr);
    }

    public static DesfireFile isMethod(int isParameter, DesfireFileSettings isParameter, byte[] isParameter) {
        if (isNameExpr instanceof RecordDesfireFileSettings) {
            return new RecordDesfireFile(isNameExpr, isNameExpr, isNameExpr);
        } else if (isNameExpr instanceof ValueDesfireFileSettings) {
            return new ValueDesfireFile(isNameExpr, isNameExpr, isNameExpr);
        } else {
            return new DesfireFile(isNameExpr, isNameExpr, isNameExpr);
        }
    }

    public DesfireFileSettings isMethod() {
        return isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public byte[] isMethod() {
        return isNameExpr.isMethod();
    }
}
