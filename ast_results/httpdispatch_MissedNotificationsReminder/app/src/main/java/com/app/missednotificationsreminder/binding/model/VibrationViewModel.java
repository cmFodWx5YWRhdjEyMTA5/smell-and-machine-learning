// isComment
package com.app.missednotificationsreminder.binding.model;

import com.app.missednotificationsreminder.binding.util.BindableBoolean;
import com.app.missednotificationsreminder.binding.util.RxBindingUtils;
import com.app.missednotificationsreminder.di.qualifiers.Vibrate;
import com.app.missednotificationsreminder.ui.view.VibrationView;
import com.f2prateek.rx.preferences.Preference;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * isComment
 */
@Singleton
public class isClassOrIsInterface extends BaseViewModel {

    /**
     * isComment
     */
    public BindableBoolean isVariable = new BindableBoolean(true);

    /**
     * isComment
     */
    private Preference<Boolean> isVariable;

    /**
     * isComment
     */
    private VibrationView isVariable;

    /**
     * isComment
     */
    @Inject
    public isConstructor(VibrationView isParameter, @Vibrate Preference<Boolean> isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isMethod();
    }

    void isMethod() {
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr));
        // isComment
        isMethod(isNameExpr.isMethod(isNameExpr).isMethod(isIntegerConstant).isMethod(isParameter -> isNameExpr).isMethod(isParameter -> isNameExpr.isMethod()));
    }
}
