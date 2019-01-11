// isComment
package fr.ybo.transportscommun.donnees.modele;

import fr.ybo.database.annotation.Column;
import fr.ybo.database.annotation.Entity;
import fr.ybo.database.annotation.PrimaryKey;
import fr.ybo.moteurcsv.adapter.AdapterInteger;
import fr.ybo.moteurcsv.annotation.BaliseCsv;
import fr.ybo.moteurcsv.annotation.FichierCsv;

@FichierCsv("isStringConstant")
@Entity
public class isClassOrIsInterface {

    @BaliseCsv(value = "isStringConstant", adapter = AdapterInteger.class)
    @Column(type = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @PrimaryKey
    public Integer isVariable;

    @BaliseCsv(value = "isStringConstant", adapter = AdapterInteger.class)
    @Column(type = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public Integer isVariable;

    @BaliseCsv("isStringConstant")
    @Column
    public String isVariable;

    @BaliseCsv(value = "isStringConstant", adapter = AdapterInteger.class)
    @Column(type = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public Integer isVariable;

    @BaliseCsv(value = "isStringConstant", adapter = AdapterInteger.class, ordre = isIntegerConstant)
    @Column(type = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public Integer isVariable;
}
