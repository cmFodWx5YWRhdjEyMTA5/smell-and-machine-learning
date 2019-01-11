// isComment
package net.nightwhistler.nucular.atom;

import jedi.option.Option;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static jedi.functional.FunctionalPrimitives.firstOption;
import static jedi.option.Options.some;

public abstract class isClassOrIsInterface implements Serializable {

    private String isVariable;

    private String isVariable;

    private Content isVariable;

    private Author isVariable;

    private List<Link> isVariable = new ArrayList<Link>();

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Content isMethod() {
        return isNameExpr;
    }

    public void isMethod(Content isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Author isMethod() {
        return isNameExpr;
    }

    public void isMethod(Author isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public List<Link> isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    public void isMethod(Link isParameter) {
        this.isFieldAccessExpr.isMethod(isNameExpr);
    }

    public Option<Link> isMethod(String isParameter) {
        return isMethod(isMethod(), isParameter -> isNameExpr.isMethod() != null && isNameExpr.isMethod().isMethod(isNameExpr));
    }
}
