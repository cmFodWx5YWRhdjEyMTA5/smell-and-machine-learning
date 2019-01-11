// isComment
package fr.ybo.transportsbordeaux.adapters.alerts;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import fr.ybo.transportsbordeaux.R;
import fr.ybo.transportsbordeaux.application.TransportsBordeauxApplication;
import fr.ybo.transportsbordeaux.database.modele.Alert;
import fr.ybo.transportscommun.donnees.modele.Ligne;
import fr.ybo.transportscommun.util.IconeLigne;

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
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        Ligne isVariable = null;
        if (isNameExpr.isFieldAccessExpr != null) {
            isNameExpr = new Ligne();
            isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr);
        }
        if (isNameExpr == null) {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
        return isNameExpr;
    }
}
