// isComment
package de.chaosdorf.meteroid;

import android.app.Activity;
import android.os.Bundle;
import java.text.DecimalFormat;
import de.chaosdorf.meteroid.util.Config;
import de.chaosdorf.meteroid.util.Connection;
import de.chaosdorf.meteroid.util.Utility;

public abstract class isClassOrIsInterface extends Activity {

    protected DecimalFormat isVariable = new DecimalFormat("isStringConstant");

    protected Activity isVariable;

    protected Config isVariable;

    protected Connection isVariable;

    @Override
    protected void isMethod(final Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = this;
        isNameExpr = isNameExpr.isMethod(isMethod());
        isNameExpr = isNameExpr.isMethod(isNameExpr);
    }
}
