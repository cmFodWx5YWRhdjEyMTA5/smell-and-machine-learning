// isComment
package fr.neamar.kiss.loader;

import android.content.Context;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import fr.neamar.kiss.dataprovider.Provider;
import fr.neamar.kiss.pojo.Pojo;

public abstract class isClassOrIsInterface<T extends Pojo> extends AsyncTask<Void, Void, ArrayList<T>> {

    final WeakReference<Context> isVariable;

    String isVariable = "isStringConstant";

    private WeakReference<Provider<T>> isVariable;

    isConstructor(Context isParameter, String isParameter) {
        super();
        this.isFieldAccessExpr = new WeakReference<>(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(Provider<T> isParameter) {
        this.isFieldAccessExpr = new WeakReference<>(isNameExpr);
    }

    public String isMethod() {
        return isNameExpr;
    }

    @Override
    protected void isMethod(ArrayList<T> isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod().isMethod(isNameExpr);
        }
    }
}
