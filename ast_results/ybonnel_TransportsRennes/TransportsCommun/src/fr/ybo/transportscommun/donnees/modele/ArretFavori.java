// isComment
package fr.ybo.transportscommun.donnees.modele;

import java.io.Serializable;
import fr.ybo.database.annotation.Column;
import fr.ybo.database.annotation.Entity;
import fr.ybo.database.annotation.PrimaryKey;
import fr.ybo.moteurcsv.adapter.AdapterInteger;
import fr.ybo.moteurcsv.annotation.BaliseCsv;
import fr.ybo.moteurcsv.annotation.FichierCsv;

@SuppressWarnings("isStringConstant")
@Entity
@FichierCsv("isStringConstant")
public class isClassOrIsInterface implements Serializable {

    @Column
    @PrimaryKey
    @BaliseCsv(value = "isStringConstant", ordre = isIntegerConstant)
    public String isVariable;

    @Column
    @PrimaryKey
    @BaliseCsv(value = "isStringConstant", ordre = isIntegerConstant)
    public String isVariable;

    @Column(type = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @PrimaryKey
    @BaliseCsv(value = "isStringConstant", adapter = AdapterInteger.class)
    public Integer isVariable;

    @Column
    public String isVariable;

    @Column
    public String isVariable;

    @Column
    public String isVariable;

    @Column
    public String isVariable;

    @Column(type = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public Integer isVariable;

    @Column
    @BaliseCsv(value = "isStringConstant")
    public String isVariable;
}
