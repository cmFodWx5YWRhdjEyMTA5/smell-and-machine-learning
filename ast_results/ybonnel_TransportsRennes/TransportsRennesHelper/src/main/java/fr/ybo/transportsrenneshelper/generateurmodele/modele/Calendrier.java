// isComment
package fr.ybo.transportsrenneshelper.generateurmodele.modele;

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
    @CsvColumn(value = "isStringConstant", adapter = AdapterInteger.class, order = isIntegerConstant)
    public int isVariable;

    @CsvColumn(value = "isStringConstant", adapter = AdapterBoolean.class, order = isIntegerConstant)
    public boolean isVariable;

    @CsvColumn(value = "isStringConstant", adapter = AdapterBoolean.class, order = isIntegerConstant)
    public boolean isVariable;

    @CsvColumn(value = "isStringConstant", adapter = AdapterBoolean.class, order = isIntegerConstant)
    public boolean isVariable;

    @CsvColumn(value = "isStringConstant", adapter = AdapterBoolean.class, order = isIntegerConstant)
    public boolean isVariable;

    @CsvColumn(value = "isStringConstant", adapter = AdapterBoolean.class, order = isIntegerConstant)
    public boolean isVariable;

    @CsvColumn(value = "isStringConstant", adapter = AdapterBoolean.class, order = isIntegerConstant)
    public boolean isVariable;

    @CsvColumn(value = "isStringConstant", adapter = AdapterBoolean.class, order = isIntegerConstant)
    public boolean isVariable;

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    public boolean isMethod() {
        return (isNameExpr && isNameExpr && isNameExpr && isNameExpr && isNameExpr && isNameExpr && !isNameExpr);
    }

    public boolean isMethod() {
        return (!isNameExpr && !isNameExpr && !isNameExpr && !isNameExpr && !isNameExpr && !isNameExpr && isNameExpr);
    }
}
