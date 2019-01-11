// isComment
package net.nightwhistler.ui;

import jedi.option.Option;
import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.unmodifiableList;
import static jedi.functional.FunctionalPrimitives.forEach;
import static net.nightwhistler.pageturner.CollectionUtil.listElement;

/**
 * isComment
 */
public class isClassOrIsInterface<T extends TreeNode> {

    private List<T> isVariable = new ArrayList<>();

    public isConstructor() {
    }

    public isConstructor(List<T> isParameter) {
        this.isFieldAccessExpr.isMethod(isNameExpr);
    }

    public void isMethod(T isParameter) {
        this.isFieldAccessExpr.isMethod(isNameExpr);
    }

    public boolean isMethod() {
        return !this.isFieldAccessExpr.isMethod();
    }

    public Option<T> isMethod(int isParameter) {
        return isMethod(isNameExpr, isNameExpr);
    }

    public int isMethod() {
        return isNameExpr.isMethod();
    }

    public void isMethod(Iterable<T> isParameter) {
        isMethod(isNameExpr, this::addChild);
    }

    public List<T> isMethod() {
        return isMethod(this.isFieldAccessExpr);
    }
}
