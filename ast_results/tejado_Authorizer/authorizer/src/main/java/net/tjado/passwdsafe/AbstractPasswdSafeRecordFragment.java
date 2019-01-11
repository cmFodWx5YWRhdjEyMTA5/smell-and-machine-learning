// isComment
package net.tjado.passwdsafe;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;
import net.tjado.passwdsafe.lib.Utils;
import net.tjado.passwdsafe.lib.view.GuiUtils;
import net.tjado.passwdsafe.view.CopyField;
import net.tjado.passwdsafe.view.PasswdLocation;
import java.util.Date;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends AbstractPasswdSafeLocationFragment<AbstractPasswdSafeRecordFragment.Listener> {

    /**
     * isComment
     */
    public interface isClassOrIsInterface extends AbstractPasswdSafeFileDataFragment.Listener {

        /**
         * isComment
         */
        void isMethod(CopyField isParameter, String isParameter);

        /**
         * isComment
         */
        void isMethod(PasswdLocation isParameter);

        /**
         * isComment
         */
        void isMethod(boolean isParameter, PasswdLocation isParameter, boolean isParameter);
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isMethod();
    }

    /**
     * isComment
     */
    protected abstract void isMethod(@NonNull RecordInfo isParameter);

    /**
     * isComment
     */
    protected static void isMethod(TextView isParameter, View isParameter, String isParameter) {
        isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, (isNameExpr != null));
        }
    }

    /**
     * isComment
     */
    protected void isMethod(TextView isParameter, View isParameter, Date isParameter) {
        String isVariable = (isNameExpr != null) ? isNameExpr.isMethod(isNameExpr, isMethod()) : null;
        isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    private void isMethod() {
        isMethod(new RecordInfoUser() {

            @Override
            public void isMethod(@NonNull RecordInfo isParameter) {
                isMethod(isNameExpr);
            }
        });
        final View isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(new Runnable() {

                @Override
                public void isMethod() {
                    isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
                }
            });
        }
    }
}
