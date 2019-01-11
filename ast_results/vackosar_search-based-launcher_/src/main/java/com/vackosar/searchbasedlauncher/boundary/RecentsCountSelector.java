// isComment
package com.vackosar.searchbasedlauncher.boundary;

import com.google.gson.annotations.Expose;
import com.google.inject.Inject;
import com.vackosar.searchbasedlauncher.entity.AppsView;
import com.vackosar.searchbasedlauncher.entity.RecentsCount;
import com.vackosar.searchbasedlauncher.entity.SelectAction;
import roboguice.context.event.OnCreateEvent;
import roboguice.event.Observes;
import roboguice.inject.ContextSingleton;

@ContextSingleton
public class isClassOrIsInterface extends SelectAction<RecentsCount> {

    private static final RecentsCount isVariable = isNameExpr.isFieldAccessExpr;

    @Inject
    private AppsView isVariable;

    @Expose
    private RecentsCount isVariable = isNameExpr;

    @SuppressWarnings("isStringConstant")
    public void isMethod(@Observes OnCreateEvent isParameter) {
        isMethod();
        isMethod();
    }

    private void isMethod() {
        isNameExpr.isMethod(((RecentsCount) isMethod()).isMethod());
    }

    @Override
    protected Enum<RecentsCount> isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(Enum<RecentsCount> isParameter) {
        this.isFieldAccessExpr = (RecentsCount) isNameExpr;
        isMethod();
        isMethod();
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
