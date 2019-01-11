// isComment
package com.zegoggles.smssync.service;

import com.zegoggles.smssync.contacts.ContactGroup;
import com.zegoggles.smssync.mail.BackupImapStore;
import com.zegoggles.smssync.mail.DataType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import java.util.EnumSet;
import static org.mockito.Mockito.mock;

@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface {

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() throws Exception {
        new BackupConfig(isMethod(BackupImapStore.class), isIntegerConstant, -isIntegerConstant, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(DataType.class), true);
    }

    @SuppressWarnings("isStringConstant")
    @Test(expected = IllegalArgumentException.class)
    public void isMethod() throws Exception {
        new BackupConfig(isMethod(BackupImapStore.class), isIntegerConstant, -isIntegerConstant, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() throws Exception {
        new BackupConfig(isMethod(BackupImapStore.class), -isIntegerConstant, -isIntegerConstant, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), true);
    }
}
