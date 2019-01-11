// isComment
package fr.ybo.transportsrennes.adapters.alerts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import fr.ybo.transportscommun.util.IconeLigne;
import fr.ybo.transportsrennes.R;
import fr.ybo.transportsrennes.keolis.modele.bus.Alert;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface extends ArrayAdapter<Alert> {

    private final List<Alert> isVariable;

    private final LayoutInflater isVariable;

    public isConstructor(Context isParameter, List<Alert> isParameter) {
        super(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr.isMethod(isMethod());
    }

    private static class isClassOrIsInterface {

        private TextView isVariable;

        private ImageView isVariable;
    }

    @Override
    public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
        View isVariable = isNameExpr;
        Alert isVariable = isNameExpr.isMethod(isNameExpr);
        AlertAdapter.ViewHolder isVariable;
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
            isNameExpr = new AlertAdapter.ViewHolder();
            isNameExpr.isFieldAccessExpr = (TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isFieldAccessExpr = (ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr = (AlertAdapter.ViewHolder) isNameExpr.isMethod();
        }
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        return isNameExpr;
    }
}
