// isComment
package fr.ybo.transportscommun.donnees.modele;

import java.io.Serializable;
import fr.ybo.database.annotation.Column;
import fr.ybo.database.annotation.Entity;
import fr.ybo.database.annotation.PrimaryKey;
import fr.ybo.moteurcsv.adapter.AdapterDouble;
import fr.ybo.moteurcsv.annotation.BaliseCsv;
import fr.ybo.moteurcsv.annotation.FichierCsv;
import fr.ybo.transportscommun.AbstractTransportsApplication;

@SuppressWarnings({ "isStringConstant" })
@FichierCsv("isStringConstant")
@Entity
public class isClassOrIsInterface extends ObjetWithDistance implements Serializable {

    @BaliseCsv("isStringConstant")
    @Column
    @PrimaryKey
    public String isVariable;

    @BaliseCsv("isStringConstant")
    @Column
    public String isVariable;

    @BaliseCsv(value = "isStringConstant", adapter = AdapterDouble.class)
    @Column(type = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public Double isVariable;

    @BaliseCsv(value = "isStringConstant", adapter = AdapterDouble.class)
    @Column(type = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public Double isVariable;

    public ArretFavori isVariable;

    @Override
    public double isMethod() {
        return isNameExpr;
    }

    @Override
    public double isMethod() {
        return isNameExpr;
    }

    public static Arret isMethod(String isParameter) {
        Arret isVariable = new Arret();
        isNameExpr.isFieldAccessExpr = isNameExpr;
        return isNameExpr.isMethod().isMethod(isNameExpr);
    }
}
