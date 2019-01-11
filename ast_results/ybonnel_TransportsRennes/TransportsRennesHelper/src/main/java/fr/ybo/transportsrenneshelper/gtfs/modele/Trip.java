// isComment
package fr.ybo.transportsrenneshelper.gtfs.modele;

import fr.ybo.transportsrenneshelper.gtfs.gestionnaire.GestionnaireGtfs;
import fr.ybonnel.csvengine.adapter.AdapterBoolean;
import fr.ybonnel.csvengine.adapter.AdapterInteger;
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

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    @CsvColumn(value = "isStringConstant", adapter = AdapterInteger.class, order = isIntegerConstant)
    public Integer isVariable;

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant, adapter = AdapterBoolean.class)
    public boolean isVariable;

    public Calendar isMethod() {
        return isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
    }

    public Route isMethod() {
        return isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + "isStringConstant" + isNameExpr + 'isStringConstant' + "isStringConstant" + isNameExpr + 'isStringConstant' + "isStringConstant" + isNameExpr + 'isStringConstant' + "isStringConstant" + isNameExpr + 'isStringConstant' + 'isStringConstant';
    }
}
