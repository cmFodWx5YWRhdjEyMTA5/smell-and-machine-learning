// isComment
package org.geometerplus.zlibrary.ui.swing.dialogs;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.geometerplus.zlibrary.core.dialogs.ZLBooleanOptionEntry;

public class isClassOrIsInterface extends ZLSwingOptionView {

    private JCheckBox isVariable;

    public isConstructor(String isParameter, ZLBooleanOptionEntry isParameter, ZLSwingDialogContent isParameter, GridBagLayout isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    protected void isMethod() {
        ((ZLBooleanOptionEntry) isNameExpr).isMethod(isNameExpr.isMethod());
    }

    protected void isMethod(boolean isParameter) {
        // isComment
        isNameExpr.isMethod(isNameExpr);
    }

    protected void isMethod() {
        final ZLBooleanOptionEntry isVariable = (ZLBooleanOptionEntry) isNameExpr;
        isNameExpr = new JCheckBox(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(new ChangeListener() {

            public void isMethod(ChangeEvent isParameter) {
                isNameExpr.isMethod(isNameExpr.isMethod());
            }
        });
        isNameExpr.isMethod(isNameExpr);
    }

    protected void isMethod() {
        isMethod(isNameExpr);
    }

    protected void isMethod() {
        isMethod(isNameExpr);
    }
}
