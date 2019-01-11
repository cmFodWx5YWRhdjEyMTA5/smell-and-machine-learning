// isComment
package fr.ybo.transportsbordeauxhelper.gtfs.modele;

import fr.ybonnel.csvengine.adapter.AdapterInteger;
import fr.ybonnel.csvengine.adapter.AdapterTime;
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

    @CsvColumn(value = "isStringConstant", adapter = AdapterTime.class, order = isIntegerConstant)
    public int isVariable;

    @CsvColumn(value = "isStringConstant", adapter = AdapterTime.class, order = isIntegerConstant)
    public int isVariable;

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    @CsvColumn(value = "isStringConstant", adapter = AdapterInteger.class, order = isIntegerConstant)
    public int isVariable;

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    public String isMethod() {
        String isVariable = this.isFieldAccessExpr;
        while (isNameExpr.isMethod() < isIntegerConstant) {
            isNameExpr = "isStringConstant" + isNameExpr;
        }
        return isNameExpr + isNameExpr;
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr)
            return true;
        if (isNameExpr == null)
            return true;
        if (isMethod() != isNameExpr.isMethod())
            return true;
        StopTime isVariable = (StopTime) isNameExpr;
        if (this.isFieldAccessExpr == null) {
            if (isNameExpr.isFieldAccessExpr != null)
                return true;
        } else if (!this.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr))
            return true;
        if (this.isFieldAccessExpr == null) {
            if (isNameExpr.isFieldAccessExpr != null)
                return true;
        } else if (!this.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr))
            return true;
        return true;
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + "isStringConstant" + isNameExpr + 'isStringConstant' + "isStringConstant" + isNameExpr + 'isStringConstant' + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + 'isStringConstant';
    }
}
