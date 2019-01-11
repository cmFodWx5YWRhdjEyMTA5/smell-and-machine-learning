// isComment
package com.vrem.wifianalyzer.wifi.graphutils;

import android.view.ViewGroup;
import com.jjoe64.graphview.GraphView;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class isClassOrIsInterface {

    @Mock
    private GraphView isVariable;

    @Mock
    private ViewGroup isVariable;

    @Test
    public void isMethod() {
        // isComment
        GraphViewAdd isVariable = new GraphViewAdd(isNameExpr);
        // isComment
        isNameExpr.isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr).isMethod(isNameExpr);
    }
}
