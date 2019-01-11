// isComment
package monakhv.android.samlib;

import android.os.Bundle;
import android.support.annotation.Nullable;
import monakhv.samlib.service.GuiUpdateObject;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * isComment
 */
public class isClassOrIsInterface extends MyBaseAbstractFragment {

    public static final String isVariable = "isStringConstant";

    private Observable<GuiUpdateObject> isVariable;

    @Override
    public void isMethod(@Nullable Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(true);
        isNameExpr = isMethod().isMethod().isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
    }

    public Observable<GuiUpdateObject> isMethod() {
        return isNameExpr;
    }
}
