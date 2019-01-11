// isComment
package fr.ybo.transportsrenneshelper.gtfs.modele;

import fr.ybo.transportsrenneshelper.gtfs.gestionnaire.GestionnaireGtfs;
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

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    @CsvColumn(value = "isStringConstant", adapter = AdapterInteger.class, order = isIntegerConstant)
    public int isVariable;

    @CsvColumn(value = "isStringConstant", adapter = AdapterTime.class, order = isIntegerConstant)
    public int isVariable;

    @CsvColumn(value = "isStringConstant", adapter = AdapterTime.class, order = isIntegerConstant)
    public int isVariable;

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    public String isMethod() {
        return isNameExpr + isNameExpr;
    }

    public Trip isMethod() {
        return isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
    }

    public Stop isMethod() {
        return isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + "isStringConstant" + isNameExpr + 'isStringConstant' + "isStringConstant" + isNameExpr + 'isStringConstant' + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + 'isStringConstant';
    }

    public Trip isVariable;
}
