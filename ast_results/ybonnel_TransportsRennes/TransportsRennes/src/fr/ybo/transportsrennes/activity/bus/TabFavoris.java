// isComment
package fr.ybo.transportsrennes.activity.bus;

import java.util.Date;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import fr.ybo.database.DataBaseException;
import fr.ybo.database.DataBaseHelper;
import fr.ybo.transportscommun.activity.bus.AbstractTabFavoris;
import fr.ybo.transportscommun.activity.commun.BaseActivity.BaseFragmentActivity;
import fr.ybo.transportscommun.donnees.manager.gtfs.GestionZipKeolis;
import fr.ybo.transportscommun.donnees.modele.DernierMiseAJour;
import fr.ybo.transportsrennes.R;
import fr.ybo.transportsrennes.activity.loading.LoadingActivity;
import fr.ybo.transportsrennes.application.TransportsRennesApplication;
import fr.ybo.transportsrennes.fragments.bus.ListFavoris;

public class isClassOrIsInterface extends AbstractTabFavoris {

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod();
    }

    private void isMethod() {
        DataBaseHelper isVariable = isNameExpr.isMethod();
        DernierMiseAJour isVariable = null;
        try {
            isNameExpr = isNameExpr.isMethod(new DernierMiseAJour());
        } catch (DataBaseException isParameter) {
            isNameExpr.isMethod(DernierMiseAJour.class);
        }
        Date isVariable = isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr == null) {
            isMethod();
        } else if (isNameExpr.isFieldAccessExpr == null || isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            isMethod(isNameExpr);
        }
    }

    private void isMethod() {
        Intent isVariable = new Intent(this, LoadingActivity.class);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
    }

    private static final int isVariable = isIntegerConstant;

    @Override
    protected Dialog isMethod(int isParameter) {
        if (isNameExpr == isNameExpr) {
            AlertDialog.Builder isVariable = new AlertDialog.Builder(this);
            isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isNameExpr.isMethod(true);
            isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), new Dialog.OnClickListener() {

                public void isMethod(DialogInterface isParameter, int isParameter) {
                    isNameExpr.isMethod();
                    isMethod();
                }
            });
            isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), new Dialog.OnClickListener() {

                public void isMethod(DialogInterface isParameter, int isParameter) {
                    isNameExpr.isMethod();
                }
            });
            return isNameExpr.isMethod();
        }
        return super.isMethod(isNameExpr);
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    protected void isMethod() {
        isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected Class<? extends BaseFragmentActivity> isMethod() {
        return ListFavorisForNoGroup.class;
    }

    @Override
    protected Class<? extends ListFragment> isMethod() {
        return ListFavoris.class;
    }

    @Override
    protected void isMethod() {
        Intent isVariable = new Intent(this, LoadingActivity.class);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
    }
}
