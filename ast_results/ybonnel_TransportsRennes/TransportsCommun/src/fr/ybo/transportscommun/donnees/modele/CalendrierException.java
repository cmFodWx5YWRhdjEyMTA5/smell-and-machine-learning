// isComment
package fr.ybo.transportscommun.donnees.modele;

import fr.ybo.database.annotation.Column;
import fr.ybo.database.annotation.Column.TypeColumn;
import fr.ybo.database.annotation.Entity;
import fr.ybo.database.annotation.PrimaryKey;
import fr.ybo.moteurcsv.adapter.AdapterBoolean;
import fr.ybo.moteurcsv.adapter.AdapterInteger;
import fr.ybo.moteurcsv.annotation.BaliseCsv;
import fr.ybo.moteurcsv.annotation.FichierCsv;

@FichierCsv("isStringConstant")
@Entity
public class isClassOrIsInterface {

    @BaliseCsv(value = "isStringConstant", adapter = AdapterInteger.class)
    @Column(type = isNameExpr.isFieldAccessExpr)
    @PrimaryKey
    public Integer isVariable;

    @BaliseCsv(value = "isStringConstant")
    @Column
    @PrimaryKey
    public String isVariable;

    @BaliseCsv(value = "isStringConstant", adapter = AdapterBoolean.class)
    @Column(type = isNameExpr.isFieldAccessExpr)
    public Boolean isVariable;
}
