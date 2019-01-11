// isComment
package com.vrem.wifianalyzer;

import android.content.res.Configuration;
import android.support.annotation.NonNull;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(MockitoJUnitRunner.class)
public class isClassOrIsInterface {

    @Mock
    private MainActivity isVariable;

    @Mock
    private Toolbar isVariable;

    @Mock
    private Configuration isVariable;

    @Mock
    private DrawerLayout isVariable;

    @Mock
    private ActionBarDrawerToggle isVariable;

    private DrawerNavigation isVariable;

    @Before
    public void isMethod() {
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr);
        isNameExpr = new DrawerNavigation(isNameExpr, isNameExpr) {

            @Override
            ActionBarDrawerToggle isMethod(@NonNull MainActivity isParameter, @NonNull Toolbar isParameter, @NonNull DrawerLayout isParameter, int isParameter, int isParameter) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
                isNameExpr.isMethod(isNameExpr, isNameExpr);
                isNameExpr.isMethod(isNameExpr, isNameExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                return isNameExpr;
            }
        };
    }

    @Test
    public void isMethod() {
        // isComment
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        // isComment
        isNameExpr.isMethod();
        // isComment
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod();
    }

    @Test
    public void isMethod() {
        // isComment
        isNameExpr.isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr).isMethod(isNameExpr);
    }
}
