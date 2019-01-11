// isComment
package au.id.micolous.metrodroid.xml;

import au.id.micolous.metrodroid.card.classic.ClassicSector;
import au.id.micolous.metrodroid.card.classic.InvalidClassicSector;
import au.id.micolous.metrodroid.card.classic.UnauthorizedClassicSector;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

public class isClassOrIsInterface implements Converter<ClassicSector> {

    @Override
    public ClassicSector isMethod(InputNode isParameter) throws Exception {
        int isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant").isMethod());
        if (isNameExpr.isMethod("isStringConstant") != null && isNameExpr.isMethod("isStringConstant").isMethod().isMethod("isStringConstant")) {
            return new UnauthorizedClassicSector(isNameExpr);
        }
        if (isNameExpr.isMethod("isStringConstant") != null && isNameExpr.isMethod("isStringConstant").isMethod().isMethod("isStringConstant")) {
            return new InvalidClassicSector(isNameExpr, isNameExpr.isMethod("isStringConstant").isMethod());
        }
        throw new SkippableRegistryStrategy.SkipException();
    }

    @Override
    public void isMethod(OutputNode isParameter, ClassicSector isParameter) throws Exception {
        throw new SkippableRegistryStrategy.SkipException();
    }
}
