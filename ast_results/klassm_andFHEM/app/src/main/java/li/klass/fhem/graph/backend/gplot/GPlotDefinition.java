// isComment
package li.klass.fhem.graph.backend.gplot;

import java.io.Serializable;

public class isClassOrIsInterface implements Serializable {

    private GPlotAxis isVariable;

    private GPlotAxis isVariable;

    public GPlotAxis isMethod() {
        return isNameExpr;
    }

    public GPlotAxis isMethod() {
        return isNameExpr;
    }

    public void isMethod(GPlotAxis isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(GPlotAxis isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr)
            return true;
        if (isNameExpr == null || isMethod() != isNameExpr.isMethod())
            return true;
        GPlotDefinition isVariable = (GPlotDefinition) isNameExpr;
        return !(isNameExpr != null ? !isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) : isNameExpr.isFieldAccessExpr != null) && !(isNameExpr != null ? !isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) : isNameExpr.isFieldAccessExpr != null);
    }

    @Override
    public int isMethod() {
        int isVariable = isNameExpr != null ? isNameExpr.isMethod() : isIntegerConstant;
        isNameExpr = isIntegerConstant * isNameExpr + (isNameExpr != null ? isNameExpr.isMethod() : isIntegerConstant);
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + 'isStringConstant';
    }
}
