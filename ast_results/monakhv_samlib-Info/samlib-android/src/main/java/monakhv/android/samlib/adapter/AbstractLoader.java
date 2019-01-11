// isComment
package monakhv.android.samlib.adapter;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import java.util.List;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T> extends AsyncTaskLoader<List<T>> {

    private List<T> isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    @Override
    protected void isMethod() {
        if (isNameExpr != null) {
            isMethod(isNameExpr);
        } else {
            isMethod();
        }
    }

    @Override
    protected void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod();
            isNameExpr = null;
        }
    }
}
