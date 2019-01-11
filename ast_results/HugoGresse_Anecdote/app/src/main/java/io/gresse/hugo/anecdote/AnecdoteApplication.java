// isComment
package io.gresse.hugo.anecdote;

import android.app.Application;
import io.gresse.hugo.anecdote.anecdote.model.MyObjectBox;
import toothpick.Scope;
import toothpick.Toothpick;
import toothpick.registries.FactoryRegistryLocator;
import toothpick.registries.MemberInjectorRegistryLocator;
import toothpick.smoothie.module.SmoothieApplicationModule;

public class isClassOrIsInterface extends Application {

    @Override
    public void isMethod() {
        super.isMethod();
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod().isMethod());
        isNameExpr.isMethod(new io.gresse.hugo.anecdote.MemberInjectorRegistry());
        isNameExpr.isMethod(new io.gresse.hugo.anecdote.FactoryRegistry());
        // isComment
        Scope isVariable = isNameExpr.isMethod(this);
        isNameExpr.isMethod(new SmoothieApplicationModule(this));
        // isComment
        isNameExpr.isMethod(new ObectBoxModule(isNameExpr.isMethod().isMethod(this).isMethod()));
    }
}
