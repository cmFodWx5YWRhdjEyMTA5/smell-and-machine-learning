// isComment
package com.google.zxing.web.generator.client;

import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

/**
 * isComment
 */
public final class isClassOrIsInterface implements GeneratorSource {

    private Grid isVariable;

    private final TextBox isVariable = new TextBox();

    public isConstructor(ChangeHandler isParameter, KeyPressHandler isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public String isMethod() throws GeneratorException {
        String isVariable = isMethod();
        return "isStringConstant" + isNameExpr;
    }

    private String isMethod() throws GeneratorException {
        String isVariable = isNameExpr.isMethod();
        if (isNameExpr.isMethod()) {
            throw new GeneratorException("isStringConstant");
        }
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }

    @Override
    public Grid isMethod() {
        if (isNameExpr != null) {
            return isNameExpr;
        }
        isNameExpr = new Grid(isIntegerConstant, isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, "isStringConstant");
        isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isNameExpr);
        return isNameExpr;
    }

    @Override
    public void isMethod(Widget isParameter) throws GeneratorException {
        if (isNameExpr == isNameExpr) {
            isMethod();
        }
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(true);
    }
}
