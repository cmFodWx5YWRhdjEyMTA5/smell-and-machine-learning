// isComment
package io.github.hidroh.materialistic.test;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import io.github.hidroh.materialistic.InjectableActivity;
import io.github.hidroh.materialistic.MultiPaneListener;
import io.github.hidroh.materialistic.R;
import io.github.hidroh.materialistic.data.WebItem;
import static org.mockito.Mockito.mock;

public class isClassOrIsInterface extends InjectableActivity implements MultiPaneListener {

    public MultiPaneListener isVariable = isMethod(MultiPaneListener.class);

    @Override
    protected void isMethod(Bundle isParameter) {
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod((Toolbar) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    @Override
    public void isMethod(WebItem isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public WebItem isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public boolean isMethod() {
        return isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
