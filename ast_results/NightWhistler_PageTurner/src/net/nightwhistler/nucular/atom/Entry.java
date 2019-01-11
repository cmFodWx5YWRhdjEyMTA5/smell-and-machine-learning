// isComment
package net.nightwhistler.nucular.atom;

import jedi.option.Option;
import java.util.ArrayList;
import java.util.List;
import static jedi.functional.FunctionalPrimitives.firstOption;
import static jedi.functional.FunctionalPrimitives.isEmpty;
import static jedi.option.Options.none;
import static jedi.option.Options.option;
import static jedi.option.Options.some;
import static net.nightwhistler.nucular.atom.AtomConstants.*;

public class isClassOrIsInterface extends AtomElement {

    private String isVariable;

    private String isVariable;

    private Feed isVariable;

    private String isVariable;

    public String isMethod() {
        return isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(Feed isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Option<Feed> isMethod() {
        return isMethod(isNameExpr);
    }

    public Option<Link> isMethod() {
        return isMethod(isNameExpr.isFieldAccessExpr);
    }

    public Option<Link> isMethod() {
        Option<Link> isVariable = isMethod();
        return isNameExpr.isMethod(isParameter -> isNameExpr.isMethod() != null && isNameExpr.isMethod().isMethod(isNameExpr));
    }

    public Option<Link> isMethod() {
        List<Link> isVariable = isMethod();
        return isMethod(isNameExpr, isParameter -> isNameExpr.isMethod().isMethod(isNameExpr));
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    private Option<Link> isMethod(String... isParameter) {
        Option<Link> isVariable = isMethod();
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr && isMethod(isNameExpr); isNameExpr++) {
            isNameExpr = isMethod(isNameExpr[isNameExpr]);
        }
        return isNameExpr;
    }

    public List<Link> isMethod() {
        List<Link> isVariable = new ArrayList<Link>();
        for (Link isVariable : isMethod()) {
            String isVariable = isNameExpr.isMethod() != null ? isNameExpr.isMethod() : "isStringConstant";
            String isVariable = isNameExpr.isMethod() != null ? isNameExpr.isMethod() : "isStringConstant";
            if (isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod(isNameExpr)) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        return isNameExpr;
    }

    public Option<Link> isMethod() {
        return isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    public Option<Link> isMethod() {
        return isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    public Option<Link> isMethod() {
        return isMethod(isNameExpr, isNameExpr);
    }

    public Option<Link> isMethod() {
        return isMethod(isMethod(), isParameter -> isNameExpr.isMethod() != null && isNameExpr.isMethod().isMethod(isNameExpr));
    }
}
