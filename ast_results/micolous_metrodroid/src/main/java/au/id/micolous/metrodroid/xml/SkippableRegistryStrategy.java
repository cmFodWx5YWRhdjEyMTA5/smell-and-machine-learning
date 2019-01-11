// isComment
package au.id.micolous.metrodroid.xml;

import org.simpleframework.xml.convert.Registry;
import org.simpleframework.xml.convert.RegistryStrategy;
import org.simpleframework.xml.strategy.Strategy;
import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.strategy.Value;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.NodeMap;
import org.simpleframework.xml.stream.OutputNode;
import java.util.Map;

public class isClassOrIsInterface extends RegistryStrategy {

    public isConstructor(Registry isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Registry isParameter, Strategy isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @SuppressWarnings("isStringConstant")
    @Override
    public Value isMethod(Type isParameter, NodeMap<InputNode> isParameter, Map isParameter) throws Exception {
        try {
            return super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        } catch (SkipException isParameter) {
            return null;
        }
    }

    @Override
    public boolean isMethod(Type isParameter, Object isParameter, NodeMap<OutputNode> isParameter, Map isParameter) throws Exception {
        try {
            return super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        } catch (SkipException isParameter) {
            return true;
        }
    }

    public static class isClassOrIsInterface extends Exception {
    }
}
