// isComment
package au.id.micolous.metrodroid.xml;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;
import au.id.micolous.metrodroid.card.calypso.CalypsoApplication;
import au.id.micolous.metrodroid.card.cepas.CEPASApplication;
import au.id.micolous.metrodroid.card.iso7816.ISO7816Application;
import au.id.micolous.metrodroid.card.china.ChinaCard;
import au.id.micolous.metrodroid.card.tmoney.TMoneyCard;

public class isClassOrIsInterface implements Converter<ISO7816Application> {

    private final Serializer isVariable;

    public isConstructor(Serializer isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public ISO7816Application isMethod(InputNode isParameter) throws Exception {
        String isVariable = isNameExpr.isMethod("isStringConstant").isMethod();
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            return isNameExpr.isMethod(CalypsoApplication.class, isNameExpr);
        }
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr) || isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            return isNameExpr.isMethod(ChinaCard.class, isNameExpr);
        }
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            return isNameExpr.isMethod(TMoneyCard.class, isNameExpr);
        }
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            return isNameExpr.isMethod(CEPASApplication.class, isNameExpr);
        }
        throw new SkippableRegistryStrategy.SkipException();
    }

    @Override
    public void isMethod(OutputNode isParameter, ISO7816Application isParameter) throws Exception {
        throw new SkippableRegistryStrategy.SkipException();
    }
}
