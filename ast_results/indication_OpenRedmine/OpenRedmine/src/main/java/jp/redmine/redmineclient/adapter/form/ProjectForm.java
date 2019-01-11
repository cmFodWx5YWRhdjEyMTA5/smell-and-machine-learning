// isComment
package jp.redmine.redmineclient.adapter.form;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import jp.redmine.redmineclient.R;
import jp.redmine.redmineclient.entity.RedmineProject;
import jp.redmine.redmineclient.form.helper.FormHelper;

public class isClassOrIsInterface extends FormHelper {

    public TextView isVariable;

    public CheckBox isVariable;

    public isConstructor(View isParameter) {
        this.isMethod(isNameExpr);
    }

    public void isMethod(View isParameter) {
        isNameExpr = (TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (CheckBox) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(true);
    }

    public void isMethod(RedmineProject isParameter) {
        isMethod(isNameExpr, isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod() > isIntegerConstant);
    }

    public void isMethod(RedmineProject isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod() ? isIntegerConstant : isIntegerConstant);
    }
}
