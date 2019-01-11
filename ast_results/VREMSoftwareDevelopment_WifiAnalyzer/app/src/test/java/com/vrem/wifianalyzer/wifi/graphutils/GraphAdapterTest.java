// isComment
package com.vrem.wifianalyzer.wifi.graphutils;

import com.jjoe64.graphview.GraphView;
import com.vrem.wifianalyzer.MainContextHelper;
import com.vrem.wifianalyzer.wifi.model.WiFiData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class isClassOrIsInterface {

    @Mock
    private GraphViewNotifier isVariable;

    @Mock
    private GraphView isVariable;

    @Mock
    private WiFiData isVariable;

    private GraphAdapter isVariable;

    @Before
    public void isMethod() {
        isNameExpr = new GraphAdapter(isNameExpr.isMethod(isNameExpr));
    }

    @After
    public void isMethod() {
        isNameExpr.isFieldAccessExpr.isMethod();
    }

    @Test
    public void isMethod() {
        // isComment
        isNameExpr.isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        // isComment
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        // isComment
        List<GraphView> isVariable = isNameExpr.isMethod();
        // isComment
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr).isMethod();
    }
}
