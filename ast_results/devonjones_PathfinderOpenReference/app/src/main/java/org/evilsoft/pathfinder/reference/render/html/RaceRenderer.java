// isComment
package org.evilsoft.pathfinder.reference.render.html;

public class isClassOrIsInterface extends HtmlRenderer {

    public isConstructor() {
    }

    @Override
    public String isMethod() {
        String isVariable = isNameExpr;
        if (!isNameExpr) {
            isNameExpr = isNameExpr + "isStringConstant";
        }
        return isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }
}
