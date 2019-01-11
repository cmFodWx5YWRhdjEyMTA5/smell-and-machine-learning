// isComment
package fr.ybo.transportsrenneshelper.gtfs.modele;

import fr.ybonnel.csvengine.adapter.AdapterInteger;
import fr.ybonnel.csvengine.annotation.CsvColumn;
import fr.ybonnel.csvengine.annotation.CsvFile;

@CsvFile
public class isClassOrIsInterface {

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    @CsvColumn(value = "isStringConstant", order = isIntegerConstant)
    public String isVariable;

    @CsvColumn(value = "isStringConstant", adapter = AdapterInteger.class, order = isIntegerConstant)
    public Integer isVariable;
}
