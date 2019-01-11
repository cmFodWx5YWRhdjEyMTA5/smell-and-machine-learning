// isComment
package fr.ybo.transportsbordeauxhelper.modele;

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
}
