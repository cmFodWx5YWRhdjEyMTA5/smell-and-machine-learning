// isComment
package btools.router;

import java.util.Map;
import btools.expressions.BExpressionContext;
import btools.expressions.BExpressionContextNode;
import btools.expressions.BExpressionContextWay;

final class isClassOrIsInterface extends OsmPathModel {

    public OsmPrePath isMethod() {
        return null;
    }

    public OsmPath isMethod() {
        return new StdPath();
    }

    protected BExpressionContextWay isVariable;

    protected BExpressionContextNode isVariable;

    @Override
    public void isMethod(BExpressionContextWay isParameter, BExpressionContextNode isParameter, Map<String, String> isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        // isComment
        BExpressionContext isVariable = isNameExpr;
    }
}
