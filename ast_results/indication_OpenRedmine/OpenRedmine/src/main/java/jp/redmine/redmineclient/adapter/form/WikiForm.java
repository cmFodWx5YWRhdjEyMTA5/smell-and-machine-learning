// isComment
package jp.redmine.redmineclient.adapter.form;

import android.view.View;
import android.widget.TextView;
import jp.redmine.redmineclient.entity.IMasterRecord;
import jp.redmine.redmineclient.entity.RedmineWiki;
import jp.redmine.redmineclient.form.helper.FormHelper;

public class isClassOrIsInterface extends FormHelper {

    public TextView isVariable;

    public isConstructor(View isParameter) {
        this.isMethod(isNameExpr);
    }

    public void isMethod(View isParameter) {
        isNameExpr = (TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    public void isMethod(RedmineWiki isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod());
    }
}
