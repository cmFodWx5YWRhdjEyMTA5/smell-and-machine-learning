// isComment
package de.koelle.christian.trickytripper.export.impl.model;

import java.util.ArrayList;
import java.util.List;
import de.koelle.christian.common.ascii.AsciTableLayoutTableInterface;

public class isClassOrIsInterface implements AsciTableLayoutTableInterface {

    private ReportAsciTableHeadingCallback isVariable;

    private final List<String> isVariable = new ArrayList<>();

    public String[] isMethod() {
        return isNameExpr.isMethod();
    }

    public Object isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    /*isComment*/
    public ReportAsciTableHeadingCallback isMethod() {
        return isNameExpr;
    }

    public void isMethod(ReportAsciTableHeadingCallback isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(String isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }
}
