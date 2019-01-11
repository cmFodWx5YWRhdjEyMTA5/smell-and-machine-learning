// isComment
package au.id.micolous.metrodroid.xml;

import android.util.Base64;
import au.id.micolous.metrodroid.card.desfire.files.DesfireFile;
import au.id.micolous.metrodroid.card.desfire.files.InvalidDesfireFile;
import au.id.micolous.metrodroid.card.desfire.files.UnauthorizedDesfireFile;
import au.id.micolous.metrodroid.card.desfire.settings.DesfireFileSettings;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

public class isClassOrIsInterface implements Converter<DesfireFile> {

    private final Serializer isVariable;

    public isConstructor(Serializer isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public DesfireFile isMethod(InputNode isParameter) throws Exception {
        int isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant").isMethod());
        InputNode isVariable = isNameExpr.isMethod("isStringConstant");
        boolean isVariable = true;
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
        }
        DesfireFileSettings isVariable = null;
        byte[] isVariable = null;
        String isVariable = null;
        while (true) {
            InputNode isVariable = isNameExpr.isMethod();
            if (isNameExpr == null) {
                break;
            }
            switch(isNameExpr.isMethod()) {
                case "isStringConstant":
                    isNameExpr = isNameExpr.isMethod(DesfireFileSettings.class, isNameExpr);
                    break;
                case "isStringConstant":
                    String isVariable = isNameExpr.isMethod();
                    if (isNameExpr != null) {
                        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                    }
                    break;
                case "isStringConstant":
                    isNameExpr = isNameExpr.isMethod();
                    break;
            }
        }
        if (isNameExpr) {
            return new UnauthorizedDesfireFile(isNameExpr, isNameExpr, isNameExpr);
        }
        if (isNameExpr != null) {
            return new InvalidDesfireFile(isNameExpr, isNameExpr, isNameExpr);
        }
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(OutputNode isParameter, DesfireFile isParameter) throws Exception {
        throw new SkippableRegistryStrategy.SkipException();
    }
}
