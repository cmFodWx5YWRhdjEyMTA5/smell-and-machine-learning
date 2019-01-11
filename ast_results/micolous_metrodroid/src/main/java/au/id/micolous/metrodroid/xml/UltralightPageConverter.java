// isComment
package au.id.micolous.metrodroid.xml;

import au.id.micolous.metrodroid.card.ultralight.UltralightPage;
import au.id.micolous.metrodroid.card.ultralight.UnauthorizedUltralightPage;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

public class isClassOrIsInterface implements Converter<UltralightPage> {

    @Override
    public UltralightPage isMethod(InputNode isParameter) throws Exception {
        int isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant").isMethod());
        if (isNameExpr.isMethod("isStringConstant") != null && isNameExpr.isMethod("isStringConstant").isMethod().isMethod("isStringConstant")) {
            return new UnauthorizedUltralightPage(isNameExpr);
        }
        throw new SkippableRegistryStrategy.SkipException();
    }

    @Override
    public void isMethod(OutputNode isParameter, UltralightPage isParameter) throws Exception {
        throw new SkippableRegistryStrategy.SkipException();
    }
}
