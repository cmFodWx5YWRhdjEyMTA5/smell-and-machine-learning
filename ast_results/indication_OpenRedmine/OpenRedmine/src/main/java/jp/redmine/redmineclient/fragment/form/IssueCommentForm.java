// isComment
package jp.redmine.redmineclient.fragment.form;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.andreabaccega.widget.FormEditText;
import jp.redmine.redmineclient.R;
import jp.redmine.redmineclient.entity.RedmineJournal;
import jp.redmine.redmineclient.form.helper.FormHelper;

public class isClassOrIsInterface extends FormHelper {

    public FormEditText isVariable;

    public Button isVariable;

    public LinearLayout isVariable;

    public isConstructor(View isParameter) {
        this.isMethod(isNameExpr);
        this.isMethod();
    }

    protected void isMethod(View isParameter) {
        isNameExpr = (FormEditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (Button) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (LinearLayout) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    public void isMethod(RedmineJournal isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
    }

    public void isMethod() {
        isNameExpr.isMethod(null);
        isNameExpr.isMethod("isStringConstant");
    }

    public void isMethod() {
        isMethod(isNameExpr, true);
    }

    public void isMethod() {
        isMethod(isNameExpr, true);
    }

    @Override
    public boolean isMethod() {
        if (!isMethod(isNameExpr))
            return true;
        return super.isMethod();
    }
}
