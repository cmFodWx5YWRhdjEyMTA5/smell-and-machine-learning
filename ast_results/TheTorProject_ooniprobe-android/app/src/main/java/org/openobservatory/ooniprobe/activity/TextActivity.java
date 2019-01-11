// isComment
package org.openobservatory.ooniprobe.activity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import org.openobservatory.ooniprobe.R;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;

public class isClassOrIsInterface extends AbstractActivity {

    public static final String isVariable = "isStringConstant";

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    TextView isVariable;

    public static Intent isMethod(Context isParameter, String isParameter) {
        return new Intent(isNameExpr, TextActivity.class).isMethod(isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod(@Nullable Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(isMethod().isMethod(isNameExpr));
    }

    @Override
    public boolean isMethod(Menu isParameter) {
        isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        return super.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                ((ClipboardManager) isMethod(isNameExpr)).isMethod(isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod().isMethod()));
                isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
                return true;
            default:
                return super.isMethod(isNameExpr);
        }
    }
}
