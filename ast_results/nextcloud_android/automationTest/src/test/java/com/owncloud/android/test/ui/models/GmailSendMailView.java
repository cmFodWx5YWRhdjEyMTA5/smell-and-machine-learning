// isComment
package com.owncloud.android.test.ui.models;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

public class isClassOrIsInterface {

    final AndroidDriver isVariable;

    @CacheLookup
    @AndroidFindBy(uiAutomator = "isStringConstant")
    private AndroidElement isVariable;

    @CacheLookup
    @AndroidFindBy(name = "isStringConstant")
    private AndroidElement isVariable;

    @CacheLookup
    @AndroidFindBy(uiAutomator = "isStringConstant")
    private AndroidElement isVariable;

    public isConstructor(AndroidDriver isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr.isMethod(new AppiumFieldDecorator(isNameExpr), this);
    }

    public void isMethod(String isParameter) {
        isNameExpr.isMethod(isNameExpr + "isStringConstant");
    }

    public void isMethod() {
        isNameExpr.isMethod();
    }

    public void isMethod(String isParameter) {
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
    }
}
