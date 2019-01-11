// isComment
package com.zegoggles.smssync.contacts;

import com.zegoggles.smssync.mail.PersonRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import static com.google.common.truth.Truth.assertThat;

@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        ContactGroupIds isVariable = new ContactGroupIds();
        isMethod(isNameExpr.isMethod()).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod();
        isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isStringConstant, isStringConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isStringConstant);
    }

    @Test
    public void isMethod() throws Exception {
        ContactGroupIds isVariable = new ContactGroupIds();
        PersonRecord isVariable = new PersonRecord(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod();
        isNameExpr.isMethod(isStringConstant, isStringConstant);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod();
    }
}
