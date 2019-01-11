// isComment
package de.tum.in.tumcampusapp.component.ui.barrierfree;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import de.tum.in.tumcampusapp.R;
import de.tum.in.tumcampusapp.component.other.generic.activity.BaseActivity;

public class isClassOrIsInterface extends BaseActivity {

    ListView isVariable;

    public isConstructor() {
        super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod((isParameter, isParameter, isParameter, isParameter) -> {
            Intent isVariable;
            switch(isNameExpr) {
                case isIntegerConstant:
                    isNameExpr = new Intent(this, BarrierFreeContactActivity.class);
                    break;
                case isIntegerConstant:
                    isNameExpr = new Intent(this, BarrierFreeFacilitiesActivity.class);
                    break;
                case isIntegerConstant:
                    isNameExpr = new Intent(this, BarrierFreeMoreInfoActivity.class);
                    break;
                default:
                    isNameExpr = new Intent();
            }
            isMethod(isNameExpr);
        });
    }
}
