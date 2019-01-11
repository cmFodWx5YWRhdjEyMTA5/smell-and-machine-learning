// isComment
package li.klass.fhem.adapter.devices.genericui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import li.klass.fhem.R;
import li.klass.fhem.domain.core.FhemDevice;

public abstract class isClassOrIsInterface extends DeviceDetailViewAction {

    private int isVariable;

    protected isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public View isMethod(Context isParameter, LayoutInflater isParameter, FhemDevice isParameter, LinearLayout isParameter, String isParameter) {
        return isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public Button isMethod(Context isParameter, LayoutInflater isParameter, FhemDevice isParameter, LinearLayout isParameter, String isParameter) {
        Button isVariable = (Button) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        isNameExpr.isMethod(isMethod(isNameExpr, isNameExpr, isNameExpr));
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }

    private Button.OnClickListener isMethod(final Context isParameter, final FhemDevice isParameter, final String isParameter) {
        return new Button.OnClickListener() {

            @Override
            public void isMethod(View isParameter) {
                isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
        };
    }

    public abstract void isMethod(Context isParameter, FhemDevice isParameter, String isParameter);
}
