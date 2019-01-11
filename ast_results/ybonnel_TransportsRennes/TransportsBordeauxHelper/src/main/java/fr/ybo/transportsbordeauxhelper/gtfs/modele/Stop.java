// isComment
package fr.ybo.transportsbordeauxhelper.gtfs.modele;

import fr.ybonnel.csvengine.adapter.AdapterDouble;
import fr.ybonnel.csvengine.annotation.CsvColumn;
import fr.ybonnel.csvengine.annotation.CsvFile;

/**
 * isComment
 */
@CsvFile
public class isClassOrIsInterface {

    // isComment
    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    @CsvColumn(value = "isStringConstant", adapter = AdapterDouble.class, order = isIntegerConstant)
    public double isVariable;

    @CsvColumn(value = "isStringConstant", adapter = AdapterDouble.class, order = isIntegerConstant)
    public double isVariable;

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    @Override
    public int isMethod() {
        final int isVariable = isIntegerConstant;
        int isVariable = isIntegerConstant;
        isNameExpr = isNameExpr * isNameExpr + ((isNameExpr == null) ? isIntegerConstant : isNameExpr.isMethod());
        long isVariable;
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isNameExpr = isNameExpr * isNameExpr + (int) (isNameExpr ^ (isNameExpr >>> isIntegerConstant));
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isNameExpr = isNameExpr * isNameExpr + (int) (isNameExpr ^ (isNameExpr >>> isIntegerConstant));
        isNameExpr = isNameExpr * isNameExpr + ((isNameExpr == null) ? isIntegerConstant : isNameExpr.isMethod());
        return isNameExpr;
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr)
            return true;
        if (isNameExpr == null)
            return true;
        if (isMethod() != isNameExpr.isMethod())
            return true;
        Stop isVariable = (Stop) isNameExpr;
        if (isNameExpr == null) {
            if (isNameExpr.isFieldAccessExpr != null)
                return true;
        } else if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))
            return true;
        if (isNameExpr.isMethod(isNameExpr) != isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))
            return true;
        if (isNameExpr.isMethod(isNameExpr) != isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))
            return true;
        if (isNameExpr == null) {
            if (isNameExpr.isFieldAccessExpr != null)
                return true;
        } else if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))
            return true;
        return true;
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + "isStringConstant" + isNameExpr + 'isStringConstant' + "isStringConstant" + isNameExpr + 'isStringConstant' + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + 'isStringConstant';
    }
}
