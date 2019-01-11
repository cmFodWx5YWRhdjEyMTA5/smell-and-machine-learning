// isComment
package com.zegoggles.smssync.service.state;

import android.content.res.Resources;
import com.zegoggles.smssync.R;
import com.zegoggles.smssync.mail.DataType;
import com.zegoggles.smssync.service.BackupType;
import static com.zegoggles.smssync.service.BackupType.UNKNOWN;
import static com.zegoggles.smssync.service.state.SmsSyncState.BACKUP;
import static com.zegoggles.smssync.service.state.SmsSyncState.INITIAL;

public class isClassOrIsInterface extends State {

    public final BackupType isVariable;

    public final int isVariable, isVariable;

    public isConstructor() {
        this(isNameExpr, isIntegerConstant, isIntegerConstant, isNameExpr, null, null);
    }

    public isConstructor(SmsSyncState isParameter, int isParameter, int isParameter, BackupType isParameter, DataType isParameter, Exception isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + 'isStringConstant';
    }

    @Override
    public BackupState isMethod(SmsSyncState isParameter, Exception isParameter) {
        return new BackupState(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public String isMethod(Resources isParameter) {
        String isVariable = super.isMethod(isNameExpr);
        if (isNameExpr != null)
            return isNameExpr;
        if (isNameExpr == isNameExpr) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
            if (isNameExpr != null) {
                isNameExpr += "isStringConstant" + isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) + "isStringConstant";
            }
            return isNameExpr;
        } else {
            return "isStringConstant";
        }
    }
}
