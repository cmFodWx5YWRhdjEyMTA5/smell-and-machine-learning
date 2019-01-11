// isComment
package fr.ybo.transportsrenneshelper.generateurmodele.modele;

import fr.ybonnel.csvengine.adapter.AdapterInteger;
import fr.ybonnel.csvengine.annotation.CsvColumn;
import fr.ybonnel.csvengine.annotation.CsvFile;

/**
 * isComment
 */
@CsvFile
public class isClassOrIsInterface {

    // isComment
    @CsvColumn("isStringConstant")
    public String isVariable;

    @CsvColumn("isStringConstant")
    public String isVariable;

    @CsvColumn("isStringConstant")
    public String isVariable;

    @CsvColumn(value = "isStringConstant", adapter = AdapterInteger.class)
    public int isVariable;
}
