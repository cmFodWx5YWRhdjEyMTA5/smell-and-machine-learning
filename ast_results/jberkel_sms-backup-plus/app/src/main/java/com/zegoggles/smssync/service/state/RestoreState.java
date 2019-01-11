// isComment
package com.zegoggles.smssync.service.state;

import android.content.res.Resources;
import com.zegoggles.smssync.R;
import com.zegoggles.smssync.mail.DataType;
import static com.zegoggles.smssync.service.state.SmsSyncState.INITIAL;

public class isClassOrIsInterface extends State {

    /**
     * isComment
     */
    public final int isVariable;

    /**
     * isComment
     */
    public final int isVariable;

    /**
     * isComment
     */
    public final int isVariable;

    /**
     * isComment
     */
    public final int isVariable;

    public isConstructor() {
        this(isNameExpr, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, null, null);
    }

    public isConstructor(SmsSyncState isParameter, int isParameter, int isParameter, int isParameter, int isParameter, DataType isParameter, Exception isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + 'isStringConstant';
    }

    @Override
    public RestoreState isMethod(SmsSyncState isParameter, Exception isParameter) {
        return new RestoreState(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public String isMethod(Resources isParameter) {
        String isVariable = super.isMethod(isNameExpr);
        if (isNameExpr != null)
            return isNameExpr;
        switch(isNameExpr) {
            case isNameExpr:
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
                if (isNameExpr != null) {
                    isNameExpr += "isStringConstant" + isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) + "isStringConstant";
                }
                return isNameExpr;
            case isNameExpr:
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            default:
                return "isStringConstant";
        }
    }
}
