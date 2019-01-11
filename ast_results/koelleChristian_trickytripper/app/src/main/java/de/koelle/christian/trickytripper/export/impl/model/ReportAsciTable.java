// isComment
package de.koelle.christian.trickytripper.export.impl.model;

import java.util.ArrayList;
import java.util.List;
import de.koelle.christian.common.ascii.AsciTableLayoutTableInterface;
import de.koelle.christian.common.ascii.AsciToStringHelper;

public class isClassOrIsInterface implements ReportAsciTableHeadingCallback {

    private final List<String> isVariable = new ArrayList<>();

    private final List<ReportAsciTableLayoutTableRow> isVariable = new ArrayList<>();

    @Override
    public String isMethod() {
        return isNameExpr.isMethod(isNameExpr.isMethod(new AsciTableLayoutTableInterface[isNameExpr.isMethod()]));
    }

    public void isMethod(ReportAsciTableLayoutTableRow isParameter) {
        isNameExpr.isMethod(this);
        this.isFieldAccessExpr.isMethod(isNameExpr);
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr.isMethod(isNameExpr);
    }

    public String[] isMethod() {
        return isNameExpr.isMethod(new String[isNameExpr.isMethod()]);
    }
}
