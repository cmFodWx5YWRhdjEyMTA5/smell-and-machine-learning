// isComment
package au.id.micolous.metrodroid.card.iso7816;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;
import java.io.IOException;
import au.id.micolous.metrodroid.xml.SkippableRegistryStrategy;

public abstract class isClassOrIsInterface {

    @Attribute(name = "isStringConstant")
    String isVariable;

    abstract byte[] isMethod(ISO7816Protocol isParameter) throws IOException;

    public abstract String isMethod();

    public static class isClassOrIsInterface implements Converter<ISO7816SelectorElement> {

        private final Serializer isVariable;

        public isConstructor(Serializer isParameter) {
            isNameExpr = isNameExpr;
        }

        @Override
        public ISO7816SelectorElement isMethod(InputNode isParameter) throws Exception {
            String isVariable = isNameExpr.isMethod("isStringConstant").isMethod();
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                return isNameExpr.isMethod(ISO7816SelectorByName.class, isNameExpr);
            }
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                return isNameExpr.isMethod(ISO7816SelectorById.class, isNameExpr);
            }
            throw new UnsupportedOperationException("isStringConstant" + isNameExpr);
        }

        @Override
        public void isMethod(OutputNode isParameter, ISO7816SelectorElement isParameter) throws Exception {
            throw new SkippableRegistryStrategy.SkipException();
        }
    }
}
