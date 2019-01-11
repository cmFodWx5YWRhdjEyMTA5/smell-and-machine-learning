// isComment
package com.vackosar.searchbasedlauncher.boundary;

import android.app.Activity;
import android.content.Intent;
import com.google.gson.annotations.Expose;
import com.google.inject.Inject;
import com.vackosar.searchbasedlauncher.entity.FontSize;
import com.vackosar.searchbasedlauncher.entity.SelectAction;
import roboguice.context.event.OnCreateEvent;
import roboguice.event.Observes;
import roboguice.inject.ContextSingleton;

@ContextSingleton
public class isClassOrIsInterface extends SelectAction<FontSize> {

    public static final FontSize isVariable = isNameExpr.isFieldAccessExpr;

    @Inject
    private Activity isVariable;

    @Expose
    private FontSize isVariable = isNameExpr;

    @SuppressWarnings("isStringConstant")
    public void isMethod(@Observes OnCreateEvent isParameter) {
        isMethod();
    }

    @Override
    protected Enum<FontSize> isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(Enum<FontSize> isParameter) {
        this.isFieldAccessExpr = (FontSize) isNameExpr;
        isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod(new Intent(isNameExpr, isNameExpr.isMethod()));
    }

    @Override
    public String isMethod() {
        return isMethod().isMethod();
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    public int isMethod() {
        return isNameExpr.isMethod();
    }
}
