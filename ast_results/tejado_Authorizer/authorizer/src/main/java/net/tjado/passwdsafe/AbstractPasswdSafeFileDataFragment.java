// isComment
package net.tjado.passwdsafe;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuInflater;
import net.tjado.passwdsafe.file.PasswdFileDataUser;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<ListenerT extends AbstractPasswdSafeFileDataFragment.Listener> extends Fragment {

    /**
     * isComment
     */
    public interface isClassOrIsInterface {

        /**
         * isComment
         */
        void isMethod(PasswdFileDataUser isParameter);

        /**
         * isComment
         */
        boolean isMethod();
    }

    private ListenerT isVariable;

    @Override
    public void isMethod(Context isParameter) {
        super.isMethod(isNameExpr);
        // isComment
        isNameExpr = (ListenerT) isNameExpr;
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr = null;
    }

    @Override
    public void isMethod(Menu isParameter, MenuInflater isParameter) {
        if ((isNameExpr != null) && isNameExpr.isMethod()) {
            isMethod(isNameExpr, isNameExpr);
        }
        super.isMethod(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    protected final ListenerT isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    protected abstract void isMethod(Menu isParameter, MenuInflater isParameter);

    /**
     * isComment
     */
    protected final void isMethod(PasswdFileDataUser isParameter) {
        if (isMethod() && isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
